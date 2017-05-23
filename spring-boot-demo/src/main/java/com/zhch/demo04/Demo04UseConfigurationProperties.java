package com.zhch.demo04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Demo04UseConfigurationProperties {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo04UseConfigurationProperties.class);
        app.setWebEnvironment(false);
        ConfigurableApplicationContext ctx = app.run(args);

        Environment env = (Environment) ctx.getBean("environment");
        String host = env.getProperty("demo04.mail.host");
        System.out.println("demo host is :" + host);

        D04Logic logic = (D04Logic)ctx.getBean("demo04Logic");
        logic.printConfig();
    }
}
