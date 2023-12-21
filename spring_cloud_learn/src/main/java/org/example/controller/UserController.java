package org.example.controller;

import org.apache.catalina.security.SecurityUtil;
import org.example.dao.UserDao;
import org.example.domain.User;
import org.example.util.AesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * UserController:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/21
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello")
    public String get() {
        return "hello world";
    }

    @PostMapping("/add")
    public boolean createUser(@RequestBody User user) throws Exception {
        String password = user.getPassword();
        AesUtils.encrypt(password, "123456");
        User save = userDao.save(user);
        if (save.getId() != null) {
            return true;
        }
        return false;
    }

    @PostMapping("/queryAll")
    public List<User> query() {
        Iterable<User> all = userDao.findAll();
        List<User> uses = new ArrayList<>();
        all.forEach(uses::add);
        return uses;
    }

    @GetMapping("/query/{id}")
    public List query(@PathVariable String id) {
        String sql = "select * from user where id = '" + id + "'";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("/queryByJpa/{id}")
    public User queryByJpa(@PathVariable String id) throws Exception {
        Optional<User> byId = userDao.findById(Long.valueOf(id));
        User user = byId.get();
        String password = user.getPassword();
        String encrypt = AesUtils.encrypt(password, "123456");
        user.setPassword(encrypt);
        return user;
    }
}
