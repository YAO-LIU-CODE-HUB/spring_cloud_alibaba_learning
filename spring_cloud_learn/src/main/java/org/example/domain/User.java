package org.example.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/21
 * @version: 1.0.0
 */
@Data()
@Entity
public class User {
    @Column(name = "username",unique = true)
    private String username;

    private String password;

    @Id
    private Long id;
}
