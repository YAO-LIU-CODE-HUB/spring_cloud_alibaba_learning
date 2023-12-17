package org.example.bridge;

/**
 * FileUploader:
 *
 * @author: 刘瑶
 * @description: 文件上传
 * @date: 2023/12/17
 * @version: 1.0.0
 */
public interface FileUploader {
    void upload(String file);
    void preCheck(String file);
}
