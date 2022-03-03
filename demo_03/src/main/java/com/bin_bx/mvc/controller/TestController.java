package com.bin_bx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: //TODO
 * @ClassName: TestController
 * @Author: bxie
 * @Date: 2022/3/2 22:05
 * @Version:
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
