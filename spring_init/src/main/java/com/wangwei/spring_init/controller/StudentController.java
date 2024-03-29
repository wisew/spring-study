package com.wangwei.spring_init.controller;

import com.wangwei.spring_init.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    Student student;

    @ResponseBody
    @RequestMapping("/student/show")
    public String show(){
        return student.toString();
    }
}
