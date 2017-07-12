package com.zhch.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 多数据库配置　http://blog.didispace.com/springbootmultidatasource/
 *
 * @author zhch 2017年7月10日
 *
 */
@SpringBootApplication
public class Demo12MultiDataSourceForJpa {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo12MultiDataSourceForJpa.class);
        app.setWebEnvironment(false); // 设置为非 web 工程
        ConfigurableApplicationContext ctx = app.run(args);
        D12Logic logic = (D12Logic) ctx.getBean("d12Logic");
        logic.run();
    }
}
