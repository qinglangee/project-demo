package com.zhch.demo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主要步骤：<br>
 * 0 pom　中引入　<artifactId>spring-boot-starter-data-jpa</artifactId>,  <artifactId>mysql-connector-java</artifactId>
 * 1 application.properties 配置<br>
 * 2 dto dao 配置<br>
 * 3 logic 中引用
 * @author zhch 2017年7月11日
 *
 */
@SpringBootApplication
public class Demo11JPAAndTemplate {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo11JPAAndTemplate.class);
        app.setWebEnvironment(false); // 设置为非 web 工程
        ConfigurableApplicationContext ctx = app.run(args);
        D11Logic logic = (D11Logic) ctx.getBean("d11Logic");
        logic.run();
    }
}
