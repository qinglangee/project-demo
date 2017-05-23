package com.zhch.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 最简单的例子，一个类就可以了，启动后访问　http://localhost:8080, 得到　Hello World!
 * @author zhch Apr 18, 2017
 *
 */
@RestController
@EnableAutoConfiguration
public class Demo01SimpleStarter {
    Logger LOG = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    String home() {
        int a = 3;
        LOG.debug("a is :" + a);
        LOG.info("a is :{}", a);
        return "Hello World! Demo01SimpleStarter";
    }

    @RequestMapping(value="/{user}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        return new User("zhangsan", 22);
    }

    public class User{
        public String name;
        public int age;
        public User(String name, int age){
            this.name = name;
            this.age = age;
        }
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo01SimpleStarter.class, args);
    }
}