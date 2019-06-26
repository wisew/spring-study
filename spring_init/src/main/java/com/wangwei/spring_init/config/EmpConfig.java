package com.wangwei.spring_init.config;

import com.wangwei.spring_init.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Bean
    public EmpService empService2() {
        logger.debug("@bean加载");
        return new EmpService();
    }
}
