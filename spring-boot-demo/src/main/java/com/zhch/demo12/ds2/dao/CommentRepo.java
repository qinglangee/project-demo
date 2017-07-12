package com.zhch.demo12.ds2.dao;

import org.springframework.data.repository.CrudRepository;

import com.zhch.demo12.ds2.dto.Comment;

public interface CommentRepo extends CrudRepository<Comment, Long>{

}
