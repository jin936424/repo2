package com.jwh.component;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 渣渣灰
 * @Date: 2020/4/8 10:16
 * @Description:
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String name = (String) request.getSession().getAttribute("name");
        System.out.println(name);
        return true ;

    }
}
