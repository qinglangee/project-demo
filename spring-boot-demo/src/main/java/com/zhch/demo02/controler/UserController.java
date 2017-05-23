package com.zhch.demo02.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhch.demo02.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/name")
    public String name(){
        return "zhangsan";
    }
    // 路径参数
    @RequestMapping("/id/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User("lisi", 22);
        user.setId(id);
        return user;
    }
    // 普通参数
    @RequestMapping("/param")
    public User useName(@RequestParam("name")String name){
        User user = new User(name, 22);
        return user;
    }

    // 这个方法没有设置 RequestMapping, 是访问不到的
    public String from(){
        return "nothing";
    }

}
