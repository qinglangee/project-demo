package com.zhch.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhch.demo11.dao.UserRepo;
import com.zhch.demo11.dto.User;
import com.zhch.demo12.ds2.dao.CommentRepo;
import com.zhch.demo12.ds2.dto.Comment;

import common.utils.GsonUtils;

@Component
public class D12Logic {

    @Autowired
    UserRepo userRepo;
    @Autowired
    CommentRepo commentRepo;

    public void run(){
        Iterable<User> users = userRepo.findAll();
        System.out.println("D12Logic has next:" + users.iterator().hasNext());
        for(User user : users){
            System.out.println(GsonUtils.toJson(user));
        }
        Iterable<Comment> comments = commentRepo.findAll();
        System.out.println("D12Logic has next:" + comments.iterator().hasNext());
        for(Comment user : comments){
            System.out.println(GsonUtils.toJson(user));
        }
    }

}
