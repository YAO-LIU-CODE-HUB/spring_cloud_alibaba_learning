package org.example.dao;

import org.example.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * UserDao:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/21
 * @version: 1.0.0
 */
public interface UserDao extends JpaSpecificationExecutor<User>, CrudRepository<User, Long> {
}
