package com.zhch.demo05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 这个注解放在入口类就可以了
public class Demo05ScheduleJob {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo05ScheduleJob.class);
        app.setWebEnvironment(false);
        app.run(args);
    }
}
