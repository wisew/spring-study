package com.wangwei.spring_init.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("name", "ww");
        return "hello";
    }
}
