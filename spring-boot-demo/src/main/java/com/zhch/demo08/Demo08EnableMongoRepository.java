package com.zhch.demo08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Demo08EnableMongoRepository {
    // 如果mongo没有开启repositories自动配置，就用 @EnableMongoRepositories 手动开启
    // 也可以给它指定扫描的包
    // @EnableMongoRepositories(basePackages={"com.lifeix.leadread.spider"})

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo08EnableMongoRepository.class);
        app.setWebEnvironment(false); // 设置为非 web 工程
        ConfigurableApplicationContext ctx = app.run(args);
        UserService logic = (UserService) ctx.getBean("userService");
        logic.useRepo();
    }

}
