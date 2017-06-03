package com.zhch.demo09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class Demo09SimpleTest  implements CommandLineRunner {


    @Autowired
    private Demo09Logic logic;

    public static void main(String[] args) {
        // TODO ZHCH 项目中有web相关还是会启动tomcat, 这个以后看怎么关掉
        SpringApplication.run(Demo09SimpleTest.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        int sum = logic.add(1, 2);
        System.out.println("sum is:" + sum);

    }
}
