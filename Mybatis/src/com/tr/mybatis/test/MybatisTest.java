package com.tr.mybatis.test;

import com.tr.mybatis.dao.UserDao;
import com.tr.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void init() throws Exception {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        // 3. 创建SqlSessionFactory对象
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    //@Test
    public  void run() throws Exception{
/*
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findUserById", 1);
        // 6. 打印结果
        System.out.println(user.getUsername());

        SqlSession sqlSession = this.sqlSessionFactory.openSession();

        // 从sqlSession中获取Mapper接口的代理对象
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        // 执行查询方法
        User list =  userMapper.findUserById(1);

        System.out.println(list.getUsername());
        // 和spring整合后由spring管理
        sqlSession.close();
*/
    }
    @Test
    public  void run1() throws Exception{
/*
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findUserById", 1);
        // 6. 打印结果
        System.out.println(user.getUsername());
*/
        SqlSession sqlSession = this.sqlSessionFactory.openSession();

        // 从sqlSession中获取Mapper接口的代理对象
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        // 执行查询方法
        User user =  userMapper.queryUserOrder(1);

        System.out.println(user.getUsername());
        // 和spring整合后由spring管理
        sqlSession.close();

    }
}
