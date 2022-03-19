package com.ganga.mapper;

/*
use mybatis;

insert into tb_brand (id, brand_name, company_name, ordered, description, status)
values (5, '腾讯游戏', '王者农药', '9999', '腾讯用心创造快乐,没钱玩你妈',0),
       (6, '腾讯游戏辣鸡', '王者农药不玩', '99999', '腾讯用心创造快乐,没钱玩你妈',0),
       (7, '腾讯游戏辣鸡辣鸡', '王者农药狗都不玩', '999999', '腾讯用心创造快乐,没钱玩你妈',0);
*/
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class BrandMapperDeleteTest {


    /*
    * 单个删除
    * */
    @Test
    public void deleteByIdTest(){
        //获取用户要删除的id
        int id = 5;

        //获取SqlSession 自动提交事务的对象
        SqlSession sqlSessionAuto = MyBatisUtils.getSqlSessionFactory().openSession(true);
        //获取Mapper代理对象
        BrandMapper brand = sqlSessionAuto.getMapper(BrandMapper.class);
        //执行sql
        int i = brand.deleteById(id);
        //释放资源
        sqlSessionAuto.close();

    }


    /*
    *
    * 批量删除
    * 问题：不知道用户要删除多少条数据
    *         就不知道要使用多少占位符！
    * 解决方案：
    *     使用动态SQL:
    *       <foreach collection="array" item="id" separator="," open="(" close=")">
    *           #{id}
    *       </foreach>
    *其中:
    *   collection: 要遍历的集合
    *       在MyBatis中会将数组参数, 封装成为一个Map集合
    *           默认: array = 数组
    *           或使用@Param注解改变Map集合的默认key的名称
    *   item: 遍历的每一个结果变量名
    *   separator: 没个占位符之间的分隔符 如 "," -> ?,?,?
    *   open: 开始时, 前面要加的东西
    *   close: 结束时, 后面要加的东西
    *
    * */


}
