package com.tr.spring.ioc.context;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {

    public void run1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User)applicationContext.getBean("user");

        System.out.println(user.getId());
        System.out.println(user.getName());
        //System.out.println(car.getOwner().getName());
    }
    @Test
    public void run2(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car=(Car)applicationContext.getBean("car");
        car.save();
        System.out.println(car);
        System.out.println(car.getOwner());
      /*  System.out.println(car.getId());
        System.out.println(car.getName());
        System.out.println(car.getOwner().getName());*/
        Car car2=(Car)applicationContext.getBean("car");
        System.out.println(car2);
        System.out.println(car2.getOwner());
        car2.save();
        System.out.println(car2.getId());
       /* System.out.println(car2.getName());
        System.out.println(car2.getOwner().getName());*/
        applicationContext.close();
    }
}
