package com.wangwei.spring_init.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("朱晶晶")
    String name;
    @Value("#{10*2}")
    byte age;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=" + name + ",");
        sb.append("age=" + age + ",");
        sb.append("goods=[");
        goods.forEach((good) -> sb.append(good + "#"));
        sb.append("]");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public List<String> getGoods() {
        return goods;
    }

    public void setGoods(List<String> goods) {
        this.goods = goods;
    }

    @Value("${student.goods}")
    List<String> goods;
}
