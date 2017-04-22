package com.zhch.demo04;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties(MailProperty.class)
public class Demo04Logic {

    @Autowired
    Demo04Config config;

    @Autowired
    MailProperty mailProp;

    private List<Map<String, String>> cars;

    public void printConfig() {
        // 第一种，配置　map
        List<Map<String, String>> list = config.getList();
        list.forEach(c -> System.out.println("config is:" + c));

        // 第二种，配置POJO
        List<Item> items = config.getItems();
        items.forEach(i -> System.out.println("item is :" + i));

        // 第三种，配置指定class,不需要在类上有Comonent
        System.out.println("mail is:" + mailProp);

//        cars.forEach(car -> System.out.println("car is:" + car));
    }

    @ConfigurationProperties(prefix = "demo04.methodconfig.cars")
    public List<Map<String, String>> getCars() {
        return cars;
    }

    @ConfigurationProperties(prefix = "demo04.methodconfig.cars")
    public void setCars(List<Map<String, String>> cars) {
        this.cars = cars;
    }
}
