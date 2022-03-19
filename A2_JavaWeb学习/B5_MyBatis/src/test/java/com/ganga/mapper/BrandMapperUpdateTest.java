package com.ganga.mapper;

import com.ganga.pojo.Brand;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class BrandMapperUpdateTest {

    @Test
    public void updateBrandTest(){

        //获取用户设置数据信息
        int id = 4;
        String brandName = "拳头游戏YYSD";
        String companyName = "英雄联盟YYDS";
        int ordered = 1;
        String description = "英雄, 为你而战!!！";
        int status = 1;

        //封装数据
        Brand brandSet = new Brand();
        brandSet.setId(id);
        brandSet.setBrandName(brandName);
        brandSet.setCompanyName(companyName);
        brandSet.setOrdered(ordered);
        brandSet.setDescription(description);
        brandSet.setStatus(status);

        //获取SqlSession对象 获取自动提交事务的！
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession(true);
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行修改
        int num = brandMapper.updateBrand(brandSet);
        //释放资源
        sqlSession.close();
        //产看受影响的行数

    }
    /*
    *
    * 需求: 如果用户只修改其中部分信息
    *           那么没有修改的会被替换成null
    *           是非常危险的bug
    *   解决方案:
    *   使用: 动态SQL 修改数据
    *       <set> <if></if> </set> 标签
    * */
    @Test
    public void updateBrandDynamicTest(){
        //获取用户设置数据信息
        int id = 4;
        String brandName = "拳头游戏YY-SD";
        //String companyName = "英雄联盟YY-DS";
        int ordered = 1;
        String description = "英雄, 为你而战!!！";
        //int status = 1;
        /*用户没有修改company_name 和 status
        * 原数据不受印象
        * */
        //封装数据
        Brand brandSet = new Brand();
        brandSet.setId(id);
        brandSet.setBrandName(brandName);
        //brandSet.setCompanyName(companyName);
        brandSet.setOrdered(ordered);
        brandSet.setDescription(description);
        //brandSet.setStatus(status);

        //获取SqlSession对象 获取自动提交事务的！
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行修改
        int num = brandMapper.updateBrandDynamic(brandSet);
        //释放资源
        sqlSession.close();
        //产看受影响的行数
    }


}
