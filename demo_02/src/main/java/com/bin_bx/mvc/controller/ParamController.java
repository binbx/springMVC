package com.bin_bx.mvc.controller;

import com.bin_bx.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @Description: 测试获取请求参数功能
 * @ClassName: ParamController
 * @Author: bxie
 * @Date: 2022/3/2 18:50
 * @Version:
 */
@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();  //加这个getSession()是下面方法需要获取@CookieValue
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/testParam") //required = false表示可以不是必须要传值
    public String testParam(
            @RequestParam(value = "user_name", required = false, defaultValue = "hehe") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "sayHaha", required = true, defaultValue = "haha") String host,
            @CookieValue("JSESSIONID") String JSESSIONID){
        //若请求参数中出现多个同名的请求参数，可以再控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:"+username+",password:"+password+",hobby:"+ Arrays.toString(hobby));
        System.out.println("host:"+host);
        System.out.println("JSESSIONID:"+JSESSIONID);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
