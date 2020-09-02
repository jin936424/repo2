package com.jwh.controller;

import com.jwh.entity.Admin;
import com.jwh.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: 渣渣灰
 * @Date: 2020/4/6 20:05
 * @Description:
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpSession session, Admin admin) {

        Admin admin1 = this.adminService.selectAdmin(admin);
        System.out.println(admin1.toString());
        if (admin1!=null) {
            session.setAttribute("name", admin1.getAname());
            String name = (String) request.getSession().getAttribute("name");
            System.out.println(name);
            return "success";
        } else {
            session.setAttribute("msg", "登陆失败");

            return "redirect:/loginpage";
        }
    }

}
