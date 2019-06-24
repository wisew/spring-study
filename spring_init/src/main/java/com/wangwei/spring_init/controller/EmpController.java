package com.wangwei.spring_init.controller;

import com.wangwei.spring_init.bean.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
    @Value("${name}")
    private String name;
    @Autowired
    private Emp emp;

    @ResponseBody
    @RequestMapping("/emp/show")
    public String show() {
        return name +"--" + emp;
    }
}
