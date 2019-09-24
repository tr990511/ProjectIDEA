package com.tr.spring.ioc;

public class Car {
    private String name;
    private  String id;
    private  User owner;

    public Car(){}

    public Car(String name, String id, User owner) {
        this.name = name;
        this.id = id;
        this.owner = owner;
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

    public void setId(String id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner =owner;
    }
}
