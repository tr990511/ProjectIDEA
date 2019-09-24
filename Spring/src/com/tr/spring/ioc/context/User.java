package com.tr.spring.ioc.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user1111")
public class User {
    private String name;
    @Value("context user id")
    private  String id;

    public  User(){}

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Value("context user name")
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
