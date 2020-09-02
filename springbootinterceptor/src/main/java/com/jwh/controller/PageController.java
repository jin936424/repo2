package com.jwh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 渣渣灰
 * @Date: 2020/4/6 20:04
 * @Description:
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String pageShow(@PathVariable String page){
        return page ;
    }
}
