package org.example.adapter;

/**
 * TargetUseImp:
 *
 * @author: 刘瑶
 * @description: 适配器模式——旧的引用方法
 * @date: 2023/12/17
 * @version: 1.0.0
 */
public class TargetUseImp extends TargetUseService{
    @Override
    public String filter(String string) {
        return string.replace("a", "A");
    }
}
