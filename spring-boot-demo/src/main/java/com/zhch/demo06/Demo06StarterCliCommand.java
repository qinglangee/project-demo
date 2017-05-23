package com.zhch.demo06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo06StarterCliCommand implements CommandLineRunner {

    @Autowired
    private OtherLogic logic;

    public static void main(String[] args) {
        // TODO ZHCH 项目中有web相关还是会启动tomcat, 这个以后看怎么关掉
        SpringApplication.run(Demo06StarterCliCommand.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logic.printSth();

    }

}
