package com.zhch.demo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 作为非web工程启动
 * @author zhch Apr 21, 2017
 *
 */
// 关闭一些不需要的自动配置
@SpringBootApplication(scanBasePackages = { "com.zhch.demo03", "zhignore" }, exclude={MongoAutoConfiguration.class})
public class Demo03ExcludeSomeAutoConfig {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(D03Logic.class);
        app.setWebEnvironment(false); // 设置为非　web 工程
        ConfigurableApplicationContext ctx = app.run(args);
        D03Logic logic = (D03Logic)ctx.getBean("d03Logic");
        logic.run();
    }
}
