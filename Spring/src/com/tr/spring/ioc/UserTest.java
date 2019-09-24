package com.tr.spring.ioc;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {

    public void run(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Car car=(Car)applicationContext.getBean("car1");
        System.out.println(car.getId());
        System.out.println(car.getName());
    }
    @Test
    public void run2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Car car=(Car)applicationContext.getBean("car3");
        System.out.println(car.getId());
        System.out.println(car.getName());
        System.out.println(car.getOwner().getName());
    }
}
