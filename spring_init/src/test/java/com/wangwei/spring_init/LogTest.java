package com.wangwei.spring_init;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {
    Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads(){
        log.trace("trace日志");
        log.debug("debug日志");
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");
    }
}
