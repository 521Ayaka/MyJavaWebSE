package com.ganga.web.request;

import com.ganga.mapper.UserMapper;
import com.ganga.pojo.User;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class LoginServletTest {

    @Test
    public void doGetTest(){

        //获取用户输入数据
        String username = "ganga";
        String password = "123";
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //查询并返回结果
        User user = userMapper.selectUser(username, password);
        //释放资源
        sqlSession.close();

        System.out.println(user);
    }

}
