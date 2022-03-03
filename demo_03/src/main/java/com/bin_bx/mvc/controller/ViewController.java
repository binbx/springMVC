package com.bin_bx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @ClassName: ViewController
 * @Author: bxie
 * @Date: 2022/3/3 11:22
 */
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }

    //转发视图
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    //重定向视图
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }
}
