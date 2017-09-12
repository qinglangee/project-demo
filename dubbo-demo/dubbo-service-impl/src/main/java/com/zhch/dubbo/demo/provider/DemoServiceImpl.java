package com.zhch.dubbo.demo.provider;

import com.zhch.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name){
        return "Here is Service :Hello " + name;
    }
}
