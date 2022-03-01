package com.bin_bx.mvc.controller;

import com.sun.javafx.logging.PulseLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: bxie
 * @ClassName: HelloController
 * @Date: 2022/2/20 19:47
 * @Description: //TODO
 * @Version: V1.0
 **/

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        //返回试图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
