package com.tr.mybatis.test;

import com.tr.mybatis.dao.UserDao;
import com.tr.mybatis.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    private ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @Test
    public void testQueryUserByUsername() {
        // 获取Mapper
        UserDao userMapper = this.context.getBean(UserDao.class);
        User user = userMapper.findUserById(1);
        System.out.println(user.getUsername());
    }
}
