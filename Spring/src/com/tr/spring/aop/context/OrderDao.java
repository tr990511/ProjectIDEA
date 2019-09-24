package com.tr.spring.aop.context;

public class OrderDao {
    public void save(){
        System.out.println("orderdao save.");
    }
    public void update(){
        System.out.println("orderdao update.");
    }
    public String delete(){
        System.out.println("orderdao delete.");
        return "tr990";
    }
    public void find(){
        System.out.println("orderdao find.");
        int i=1/0;
    }
}
