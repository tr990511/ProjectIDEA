package com.tr.spring.ioc.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component("car")
@Scope("prototype")
public class Car {
    @Value("context car name")
    private String name;
    private  String id;
    //@Autowired
    //@Qualifier("user111")
    @Resource(name="user1111")
    private User owner;

    public Car(){}

    public Car(String name, String id, User owner) {
        this.name = name;
        this.id = id;
        this.owner = owner;
    }
    @PostConstruct
    public void initUser(){
        System.out.println("initUser");
    }
    @PreDestroy
    public void destroyUser(){
        System.out.println("destroyUser");
    }
    public void  save(){
        System.out.println("saved!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    @Value("context car id")
    public void setId(String id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }
}
