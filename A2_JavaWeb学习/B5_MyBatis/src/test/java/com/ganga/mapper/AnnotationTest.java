package com.ganga.mapper;

import com.ganga.pojo.Brand;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AnnotationTest {

    /*
    * 使用注解开发
    *   一些简单的sql语句
    * */
    @Test
    public void aTest(){
        //获取用户输入的id
        int id = 7;
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行
        List<Brand> brands = brandMapper.selectByIdAnnotation(id);
        //释放资源
        sqlSession.close();
        //查看结果
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }

}
