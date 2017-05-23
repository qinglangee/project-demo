package com.zhch.demo05;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Job01 {

    public Job01(){
        System.out.println("init job01");
    }

    // 秒　分　时　日　月　周几
    // */45 设置在秒上会在每分钟的０秒和４５秒执行，可能是个bug
    @Scheduled(cron="*/3 * * * * *")
    public void job01(){
        System.out.println("call job 01 " + new Date());
    }
}
