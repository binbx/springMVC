package com.bin_bx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @ClassName: TestController
 * @Author: bxie
 * @Date: 2022/3/4
 */
@Controller
public class TestController {

    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }

    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println(1/0);
        return "success";
    }
}
