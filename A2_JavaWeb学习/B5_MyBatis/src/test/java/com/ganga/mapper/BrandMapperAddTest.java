package com.ganga.mapper;

import com.ganga.pojo.Brand;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class BrandMapperAddTest {

    /**
     * 添加数据操作
     *      返回值: 是int 受影响的行数
     *      参数:  除id[自增的列] 以外的所有列
     */

    @Test
    public void testAddAll01Test(){
        //获取用户添加的数据参数
        String brandName = "拳头游戏";
        String companyName = "英雄联盟";
        int ordered = 100;
        String description = "英雄, 为你而战！";
        int status = 1;
        //封装参数
        Brand brandAdd = new Brand();
        brandAdd.setBrandName(brandName);
        brandAdd.setCompanyName(companyName);
        brandAdd.setOrdered(ordered);
        brandAdd.setDescription(description);
        brandAdd.setStatus(status);

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行sql添加数据
        int i = brandMapper.addAll(brandAdd);
        /*
         * 但是！！！
         * 数据库并没有添加上
         *   因为默认情况[无参] 是手动提交事务的
         *
         * */
        //提交事务！！
        sqlSession.commit();

        //释放资源
        sqlSession.close();
        //查看受影响的行
        System.out.println(i);

    }

    /*
    * 设置参数 自动提交:
    * sqlSessionFactory.openSession(true);
    * */
    @Test
    public void testAddAll02Test(){
        //获取用户添加的数据参数
        String brandName = "拳头游戏";
        String companyName = "英雄联盟";
        int ordered = 100;
        String description = "英雄, 为你而战！";
        int status = 1;
        //封装参数
        Brand brandAdd = new Brand();
        brandAdd.setBrandName(brandName);
        brandAdd.setCompanyName(companyName);
        brandAdd.setOrdered(ordered);
        brandAdd.setDescription(description);
        brandAdd.setStatus(status);

        //获取SqlSession对象 获取的是封装的 自动提交事务的SlqSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession(true);
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行sql添加数据
        int i = brandMapper.addAll(brandAdd);

        //会自动提交事务

        //释放资源
        sqlSession.close();
        //查看受影响的行
        System.out.println(i);

    }

    /*
    * 返回主键
    * 在 insert 标签中添加两个参数
    * <insert id="addAll" useGeneratedKeys="true" keyProperty="id">
    * */
    @Test
    public void testAddAll03Test(){
        //获取用户添加的数据参数
        String brandName = "拳头游戏";
        String companyName = "英雄联盟";
        int ordered = 100;
        String description = "英雄, 为你而战！";
        int status = 1;
        //封装参数
        Brand brandAdd = new Brand();
        brandAdd.setBrandName(brandName);
        brandAdd.setCompanyName(companyName);
        brandAdd.setOrdered(ordered);
        brandAdd.setDescription(description);
        brandAdd.setStatus(status);

        //获取SqlSession对象 获取的是封装的 自动提交事务的SlqSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession(true);
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行sql添加数据
        int i = brandMapper.addAll(brandAdd);
        //会自动提交事务

        //释放资源
        sqlSession.close();
        //查看受影响的行
        System.out.println(i);

        //查看主键id
        int id = brandAdd.getId();
        System.out.println(id);

    }
}
