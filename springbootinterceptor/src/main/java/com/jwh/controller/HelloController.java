package com.jwh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 渣渣灰
 * @Date: 2020/4/8 10:04
 * @Description:
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String helloPage(){
        return "hello Interceptor" ;
    }
}
