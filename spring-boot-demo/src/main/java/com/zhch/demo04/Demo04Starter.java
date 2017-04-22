package com.zhch.demo04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo04Starter {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo04Starter.class);
        app.setWebEnvironment(false);
        ConfigurableApplicationContext ctx = app.run(args);
        Demo04Logic logic = (Demo04Logic)ctx.getBean("demo04Logic");
        logic.printConfig();
    }
}
