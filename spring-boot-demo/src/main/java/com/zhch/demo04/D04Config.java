package com.zhch.demo04;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// 开启　ignoreUnknownFields = false，在配置文件中不能出现类中不存在的属性，但属性可以不存在于配置文件中
@ConfigurationProperties(prefix = "demo04.typeconfig", ignoreUnknownFields = false)
public class D04Config {

    // 第一种，配置　map
    private List<Map<String, String>> list;
    // 第二种，配置POJO
    private List<Item> items;

    public List<Map<String, String>> getList() {
        return list;
    }

    public void setList(List<Map<String, String>> list) {
        this.list = list;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
