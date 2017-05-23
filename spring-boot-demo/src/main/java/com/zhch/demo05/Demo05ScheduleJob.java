package com.zhch.demo05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo05ScheduleJob {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo05ScheduleJob.class);
        app.setWebEnvironment(false);
        app.run(args);
    }
}
