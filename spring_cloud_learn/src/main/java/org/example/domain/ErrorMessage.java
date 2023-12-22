package org.example.domain;

import lombok.Data;

/**
 * ErrorMessage:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/22
 * @version: 1.0.0
 */
@Data
public class ErrorMessage<T> {
    private String message;
    private Integer code;
    private T data;
    private String url;
}
