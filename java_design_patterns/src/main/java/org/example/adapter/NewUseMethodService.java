package org.example.adapter;

/**
 * NewUseMethodService:
 *
 * @author: 刘瑶
 * @description: 新字符串的处理方式
 * @date: 2023/12/17
 * @version: 1.0.0
 */
public class NewUseMethodService {
    public boolean preCheck(String string) {
        return string.contains("ace");
    }

    public String replace(String string) {
        return string.replace("ace", "a");
    }
}
