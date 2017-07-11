package com.zhch.demo11.dao;

import org.springframework.data.repository.CrudRepository;

import com.zhch.demo11.dto.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
