package org.example.config;

import org.example.domain.ErrorMessage;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * GlobalExceptionHandler:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/22
 * @version: 1.0.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ErrorMessage exceptionHandler(Exception e) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(500);
        errorMessage.setMessage(e.getMessage());
        return errorMessage;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        System.out.println("GlobalExceptionHandler init");
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
        webDataBinder.addValidators(systemValidator());
    }

    private Validator systemValidator() {
        return null;
    }
}
