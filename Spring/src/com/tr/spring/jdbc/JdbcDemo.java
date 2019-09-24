package com.tr.spring.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcDemo {
    @Test
    public void demo(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/learn");
        dataSource.setUsername("root");
        dataSource.setPassword("Root1234");
        JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert into account values (null,?,?)","tr990",100d);
    }
}
