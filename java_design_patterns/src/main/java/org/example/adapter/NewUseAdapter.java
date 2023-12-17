package org.example.adapter;

/**
 * NewUseAdapter:
 *
 * @author: 刘瑶
 * @description: 适配器_新的应用方式
 * @date: 2023/12/17
 * @version: 1.0.0
 */
public class NewUseAdapter extends TargetUseService{
    private final NewUseMethodService newUseMethodService;
    private NewUseAdapter(){
        this.newUseMethodService = new NewUseMethodService();
    }
    @Override
    public String filter(String string) {
        if (newUseMethodService.preCheck(string)) {
            return newUseMethodService.replace(string);
        }
        return string;
    }
}
