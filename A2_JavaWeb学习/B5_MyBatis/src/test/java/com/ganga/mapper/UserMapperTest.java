package com.ganga.mapper;

import com.ganga.pojo.User;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest {

    /*
    * 【未使用】自定义封装的工具类 来加载MyBatis
    *
    * 执行方式【一】：sqlSession.selectList("id");
    *
    * */
    @Test
    public void getUserListTest01() throws IOException {

        //1. 加载MyBatis的核心配置文件, 获取SqlSessionFactory核心对象
        String resource = "mybatis-config.xml";//mybatis-config.xml配置文件路径
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 执行sql 并封装sql查询对象
        List<User> users = sqlSession.selectList("getUserList");

        //4. 释放资源
        inputStream.close();

        //查看运行结果
        for (User user : users) {
            System.out.println(user);
        }
    }


    /*
     * 【使用】自定义封装的工具类 来加载MyBatis
     *
     * 执行方式【一】：sqlSession.selectList("id");
     *
     * */
    @Test
    public void getUserListTest02(){

        //第一步: 获取SqlSession对象  使用自定义封装的工具了
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();

        //第二步: 执行sql 并封装sql查询对象
        //List<User> users = sqlSession.selectList("getUserList");
        List<User> users = sqlSession.selectList("com.ganga.mapper.UserMapper.getUserList");

        //释放资源
        sqlSession.close();

        //擦看结果
        for (User user : users) {
            System.out.println(user);
        }
    }


    /*
     * 【使用】自定义封装的工具类 来加载MyBatis
     *
     * 执行方式【二】
     *
     * */
    @Test
    public void getUserListTest03(){

        //第一步: 获取SqlSession对象  使用自定义封装的工具了
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();

        //第二步: 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        //最后一部 释放资源
        sqlSession.close();

        //查看结果
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
