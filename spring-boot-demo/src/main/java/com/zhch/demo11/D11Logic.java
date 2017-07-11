package com.zhch.demo11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhch.demo11.dao.UserDao;
import com.zhch.demo11.dao.UserRepo;
import com.zhch.demo11.dto.User;

import common.utils.GsonUtils;

@Component
public class D11Logic {

    @Autowired
    UserDao userDao;
    @Autowired
    UserRepo userRepo;

    public void run(){

        Iterable<User> users = userRepo.findAll();
        System.out.println("D11Logic has next:" + users.iterator().hasNext());
        for(User user : users){
            System.out.println(GsonUtils.toJson(user));
        }
    }

}
