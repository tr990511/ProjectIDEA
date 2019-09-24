package com.tr.mybatis.dao;

import com.tr.mybatis.pojo.User;

public interface UserDao {
    public User findUserById(int i);
    public User queryUserOrder(int i);
    public User queryUserByIds(int i);
}
