package com.wangwei.spring_security.sentinel_test;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

public class SentinelDemo {
    @SentinelResource("resource")
    public String hello() {
        return "Hello";
    }
}
