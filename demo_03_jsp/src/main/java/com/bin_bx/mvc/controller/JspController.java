package com.bin_bx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @ClassName: JspController
 * @Author: bxie
 * @Date: 2022/3/3 13:45
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
