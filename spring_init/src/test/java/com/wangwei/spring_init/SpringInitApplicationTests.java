package com.wangwei.spring_init;

import com.wangwei.spring_init.bean.Animal;
import com.wangwei.spring_init.bean.Emp;
import com.wangwei.spring_init.bean.Student;
import com.wangwei.spring_init.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringInitApplicationTests {
    @Autowired
    Emp emp;
    @Autowired
    Student student;
    @Autowired
    Animal animal;

    @Autowired
    ApplicationContext context;

    @Test
    public void testXml() {
        EmpService empService = (EmpService) context.getBean("empService");
        empService.add();
    }

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

    @Test
    public void test() {
        System.out.println(animal);
    }

}
