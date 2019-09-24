package com.tr.mybatis.dao;

import com.tr.mybatis.pojo.Order;

import java.util.List;

public interface OrderDaoImp {
    public List<Order> findOrderUser();
}
