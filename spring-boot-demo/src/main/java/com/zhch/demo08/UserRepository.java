package com.zhch.demo08;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String>{
    public User findByName(String name);
    public List<User> findBySchoolAddress(String address);
    public User findByNameAndSchoolAddress(String name, String address);
    // 以上方法都会自动生成　，不需要手工实现

}
