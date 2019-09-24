package com.tr.spring.ioc;

public class UserFactory {
    public static User createBean(){
        System.out.println("userFactory 执行了。。。");
        return new User("123","12d");
    }
    public  User createBean1(){
        System.out.println("userFactory 执行了。。。");
        return new User("123","12d");
    }
}
