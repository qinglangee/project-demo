package com.zhch.demo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 作为非web工程启动
// 关闭一些不需要的自动配置
// , exclude={HibernateJpaAutoConfiguration.class}
 * 当配置了　jpa 又不需要启动时可以配置一个h2的配置充当一下，防止报错
 *
 * #配置h2数据库的连接地址
spring.datasource.url=jdbc:h2:mem:test
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.database = H2
 * @author zhch Apr 21, 2017
 *
 */
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
