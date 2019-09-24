package com.tr.mybatis.dao;

import com.tr.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImp extends SqlSessionDaoSupport implements UserDao{
    @Override
    public User findUserById(int id){
        // 获取SqlSession
        SqlSession sqlSession = super.getSqlSession();
        // 使用SqlSession执行操作
        User user = sqlSession.selectOne("findUserById", id);
        return user;
    };
    public User queryUserOrder(int i){
        return null;
    };
    public User queryUserByIds(int i){
        return null;
    };
}
