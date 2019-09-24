package com.tr.spring.aop;

import org.springframework.stereotype.Component;

@Component("car")
public class DaoImp implements Dao
{
    @Override
    public void save(){
        System.out.println("save");
    }
    @Override
    public void update(){
        System.out.println("save");
    }
    @Override
    public void find() {
        System.out.println("find");
    }
    @Override
    public void delete() {
        System.out.println("delete");
    }
}
