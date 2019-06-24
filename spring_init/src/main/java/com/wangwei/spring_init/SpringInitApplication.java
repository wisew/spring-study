package com.wangwei.spring_init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:spring-mvc.xml"})
@SpringBootApplication
public class SpringInitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringInitApplication.class, args);
    }

}
