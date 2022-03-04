package com.bin_bx.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description:
 * @ClassName: ExceptionController
 * @Author: bxie
 * @Date: 2022/3/4
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String testException(Exception ex, Model model){
        model.addAttribute("ex", ex);
        return "error";
    }
}

