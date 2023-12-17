package org.example.bridge;

/**
 * FileBehevior:
 *
 * @author: 刘瑶
 * @description: 行为
 * @date: 2023/12/17
 * @version: 1.0.0
 */
public interface FileBehavior {
    void preCheck(String file);
    void upload(String file);
}
