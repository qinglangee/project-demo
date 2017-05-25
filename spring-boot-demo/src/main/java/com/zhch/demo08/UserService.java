package com.zhch.demo08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserRepository repository;

    public void useRepo() {

        repository.deleteAll();

        // 先保存几个
        repository.save(new User("Alice", "beijing dongcheng"));
        repository.save(new User("Bob", "beijing changping"));
        repository.save(new User("Clord", "beijing changping"));

        // 取所有文档
        System.out.println("users found with findAll():");
        System.out.println("-------------------------------");
        for (User user : repository.findAll()) {
            System.out.println(user);
        }
        System.out.println();

        // 查找一条记录
        System.out.println("user found with findByName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByName("Alice"));

        System.out.println("users found with findBySchoolAddress('beijing changping'):");
        System.out.println("--------------------------------");
        for (User user : repository.findBySchoolAddress("beijing changping")) {
            System.out.println(user);
        }
    }
}
