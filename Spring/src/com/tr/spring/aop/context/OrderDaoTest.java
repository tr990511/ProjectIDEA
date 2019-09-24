package com.tr.spring.aop.context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class OrderDaoTest {
    @Resource(name="orderDao")
    private OrderDao orderDao;
    @Test
    public void run(){
       // orderDao.delete();
       // orderDao.find();
        //orderDao.update();
        orderDao.save();
    }
}
