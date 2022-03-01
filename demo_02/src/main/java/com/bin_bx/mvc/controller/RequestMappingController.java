package com.bin_bx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: //TODO
 * @ClassName: RequestMappingController
 * @Author: bxie
 * @Date: 2022/3/1 22:47
 * @Version:
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping("/testRequestMapping")
    public String success(){
        return "success";
    }


}
