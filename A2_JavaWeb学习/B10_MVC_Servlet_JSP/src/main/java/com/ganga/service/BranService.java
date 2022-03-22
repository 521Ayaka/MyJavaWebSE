package com.ganga.service;

import com.ganga.mapper.BranMapper;
import com.ganga.pojo.Bran;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BranService {

    //获取 SqlSession 工厂
    public SqlSessionFactory factory = MyBatisUtils.getSqlSessionFactory();

    /**
     * 一般用大注释
     *
     * 查询所有
     * @return
     */
    public List<Bran> selectAll(){

        //获取SqlSessionFactory对象 并 从工厂中创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取Mapper代理对象
        BranMapper mapper = sqlSession.getMapper(BranMapper.class);
        //查询并封装
        List<Bran> brands = mapper.selectAll();
        //释放资源
        sqlSession.close();
        return brands;

    }


    /**
     * 添加商品
     * @param bran
     */
    public int add(Bran bran){
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取Mapper代理对象
        BranMapper mapper = sqlSession.getMapper(BranMapper.class);
        //添加数据
        int num = mapper.add(bran);

        //不要忘了提交事务
        sqlSession.commit();

        //释放资源
        sqlSession.close();
        return num;
    }

    /**
     * 通过id获取要修改的商品 并封装成Bran对象
     * @param id
     * @return
     */
    public Bran selectById(int id){
        SqlSession sqlSession = factory.openSession();
        BranMapper mapper = sqlSession.getMapper(BranMapper.class);
        Bran bran = mapper.selectById(id);
        sqlSession.close();
        return bran;
    }

    /**
     * 修改商品数据
     * @return
     */
    public int update(Bran bran){
        //获取工厂创建 SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取Mapper代理对象
        BranMapper mapper = sqlSession.getMapper(BranMapper.class);
        int num = mapper.update(bran);
        //提交事务！！！
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        return num;
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    public int deleteById(int id){
        SqlSession sqlSession = factory.openSession();
        BranMapper mapper = sqlSession.getMapper(BranMapper.class);
        int num = mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
        return num;
    }

}
