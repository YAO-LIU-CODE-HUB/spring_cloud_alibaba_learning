package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Application:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/21
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableWebMvc
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
