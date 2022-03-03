package com.bin_bx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: //TODO
 * @ClassName: ScopeController
 * @Author: bxie
 * @Date: 2022/3/2 22:15
 * @Version:
 */
@Controller
public class ScopeController {

    //使用servletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope", "hello,servletAPI");
        return "success";
    }
}
