package com.tr.spring.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class JdbcDemo2 {
    @Resource(name="jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
    public void demo(){
        jdbcTemplate.update("insert into account values (null,?,?)","tr991",100d);
    }
}
