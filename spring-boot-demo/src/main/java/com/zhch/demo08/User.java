package com.zhch.demo08;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="demo_user")
// 不加Document注解的话，默认关联到user集合
public class User {
    @Id // 会自动与ObjectId字段_id进行转换
    private String Id;
    // 默认映射到name字段
    private String name;
    @Field("school_add") // 指定它映射到　school_add 字段
    private String schoolAddress;

    public User(String name, String schoolAddress){
        this.name = name;
        this.schoolAddress = schoolAddress;
    }

    @Override
    public String toString() {
        return "User [Id=" + Id + ", name=" + name + ", schoolAddress=" + schoolAddress + "]";
    }

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchoolAddress() {
        return schoolAddress;
    }
    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

}
