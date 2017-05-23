package com.zhch.demo05;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 可以在别的类中配置　@EnableScheduling
 */
@Component
public class Job02 {

    public Job02(){
        System.out.println("init job02");
    }

    // 秒　分　时　日　月　周几
    // */45 设置在秒上会在每分钟的０秒和４５秒执行，可能是个bug
    @Scheduled(cron="*/5 * * * * *")
    public void job01(){
        System.out.println("call job 02 " + new Date());
    }
}
