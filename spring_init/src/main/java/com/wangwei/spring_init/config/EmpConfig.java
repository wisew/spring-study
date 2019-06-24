package com.wangwei.spring_init.config;

import com.wangwei.spring_init.service.EmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
    @Bean
    public EmpService empService2() {
        System.out.println("bean注解将bean注入");
        return new EmpService();
    }
}
