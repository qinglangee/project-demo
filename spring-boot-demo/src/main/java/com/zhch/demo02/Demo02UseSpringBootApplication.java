package com.zhch.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 这个注解一个顶三个，默认扫描当前包(com.zhch.demo02)及子包
// @Configuration, @EnableAutoConfiguration and @ComponentScan
@SpringBootApplication
public class Demo02UseSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo02UseSpringBootApplication.class, args);
    }
}
