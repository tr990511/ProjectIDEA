package com.tr.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class DaoTest {
    @Resource(name="daoImp")
    private Dao daoImp;
    @Test
    public void run(){
        daoImp.save();
        daoImp.delete();
        daoImp.update();
    }
}
