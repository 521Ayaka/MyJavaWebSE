package com.ganga.mapper;

import com.ganga.pojo.Brand;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
*
* 由于java使用的是驼峰命名发 而 sql用的是 _ 命名
* 会发生映射不上问题
* 可以配置BrandMapper.xml文件 来解决映射问题
*
* */

public class BrandMapperSelectTest {


    /*
    * selectAll查询所有
    * */
    @Test
    public void getBrandSelectTest(){

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //Mapper代理方式 执行
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        //释放资源
        sqlSession.close();
        //查看验证结果
        for (Brand brand : brands) {
            System.out.println(brand);
        }

        /*
        Brand{id=1, brand_name='三只松鼠', company_name='三只松鼠股份有限公司', ordered=5, description='好吃不上火', status=0}
        Brand{id=2, brand_name='华为', company_name='华为技术有限公司', ordered=100, description='华为致力于把数字世界带入每个人、每个家庭、每个组织，构建万物互联的智能世界', status=1}
        Brand{id=3, brand_name='小米', company_name='小米科技有限公司', ordered=50, description='are you ok', status=1}
        */

    }

    /*
    * selectById 通过id查询
    * */
    @Test
    public void selectByIdTest(){

        //要查询的id
        int id = 1;
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行sql 并返回封装Brand对象
        Brand brand = brandMapper.selectById(id);
        //释放资源
        sqlSession.close();
        //查看资源
        System.out.println(brand);

    }

    /*
    * 特殊字符问题 测试
    * */
    @Test
    public void selectByOrderedTest(){
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectByOrdered();
        //释放资源
        sqlSession.close();
        //参看结果集
        for (Brand brand : brands) {
            System.out.println(brand);
        }

    }

    /**
     *
     * 条件查询
     *  参数接收方式
     *      1. 散装参数: 如果方法中有多个参数, 需要使用( @Param("SQL参数占位符名称")数据类型 参数名称一般和占位符名称相同 )
     *      2. 对象参数: 对象的属性名称要和参数占位符名称一致
     *      3. map集合参数: Map map = new HashMap(); map.put("占位符名称",参数);
     *
     */
    /*
    * 1. 散装参数: 如果方法中有多个参数, 需要使用( @Param("SQL参数占位符名称")数据类型 参数名称一般和占位符名称相同 )
    * */
    @Test
    public void selectByCondition1Test(){
        //用户查询的数据
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //数据处理
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectByCondition1(status, companyName, brandName);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand brand :brands) {
            System.out.println(brand);
        }
    }
    /*
    * 2. 对象参数: 对象的属性名称要和参数占位符名称一致
    * */
    @Test
    public void selectByCondition2Test(){
        //用户查询的数据
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //数据处理
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装参数对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectByCondition2(brand);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand bra :brands) {
            System.out.println(bra);
        }
    }
    /*
    * 3. map集合参数: Map map = new HashMap(); map.put("占位符名称",参数);
    * */
    @Test
    public void selectByCondition3Test(){
        //用户查询的数据
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //数据处理
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装为Map集合
        Map map = new HashMap();
        map.put("status",status);
        map.put("companyName",companyName);
        map.put("brandName",brandName);

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectByCondition3(map);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand brand :brands) {
            System.out.println(brand);
        }
    }


    /**
     *
     *
     * 动态获取Sql
     *
     *
     */
    /*
     * 这种查询方式 用户必须要输入全部数据 而不能只输入一个
     * */
    @Test
    public void selectDynamicSQL01(){
        //用户查询的数据
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //数据处理
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        //封装为Map集合
        Map map = new HashMap();
        map.put("status",status);
        //map.put("companyName",companyName);
        //map.put("brandName",brandName);
        /*查询失败 无匹配结果*/

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectDynamicSQL01(map);
        //释放资源
        sqlSession.close();
        //查看结果集
        if (!brands.isEmpty()){
            System.out.println("查询成功:");
            for (Brand brand :brands) {
                System.out.println(brand);
            }
        }else {
            System.out.println("查询失败 无匹配结果!");
        }
    }
    /*
     * 解决方案: 态标签<if>
     *   依然纯在问题:
     *   如果不查询第一个参数 后面的语句会有一个 and 组成了 where and 不合法
     * */
    @Test
    public void selectDynamicSQL02(){
        //用户查询的数据
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //数据处理
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装为Map集合
        Map map = new HashMap();
        //map.put("status",status);
        map.put("companyName",companyName);
        map.put("brandName",brandName);
        /*如果不查询第一个参数status 则sql语法发生错误*/

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectDynamicSQL02(map);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand brand :brands) {
            System.out.println(brand);
        }/*如果不查询第一个参数status 则sql语法发生错误*/
    }
    /*
     * 解决方案: 动态标签<where>
     *              会自动替换 没用的and等
     * */
    @Test/**问题解决！*/
    public void selectDynamicSQL03(){
        //用户查询的数据
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //数据处理
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装为Map集合
        Map map = new HashMap();
        //map.put("status",status);
        map.put("companyName",companyName);
        map.put("brandName",brandName);
        /**问题解决*/

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectDynamicSQL03(map);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand brand :brands) {
            System.out.println(brand);
        }
    }

    /**
     *
     * 动态获取SQL 查询条件: 单条件动态查询
     *
     */
    /*
     * 需求: 3个公司中选择出一个公司
     *       再从该公司中模糊查询该商品
     *
     *
     * */
    @Test
    public void selectDynamicSQL001(){
        //用户查询的数据
        //int status = 1;
        //String companyName = "华为";
        //String brandName = "华为";
        //数据处理
        //companyName = "%" + companyName + "%";
        //brandName = "%" + brandName + "%";
        /*
        * 选择一个选项
        *   查询商品 返回结果
        *
        * 无选择选项 sql sql: select * from 表名 where 1 = 1;
        *   查询商品 返回所有结果
        *
        * 无法多个选项
        * */
        //封装参数对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);
        //brand.setBrandName(brandName);
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectDynamicSQL001(brand);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand bra :brands) {
            System.out.println(bra);
        }
    }

    /*改进优化*/
    @Test
    public void selectDynamicSQL002(){
        //用户查询的数据
        //int status = 1;
        //String companyName = "华为";
        String brandName = "华为";
        //数据处理
        //companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        /*
         * 选择一个选项
         *   查询商品 返回结果
         *
         * 无选择选项 sql: select * from 表名;
         *   查询商品 返回所有结果
         *
         * 无法多个选项
         * */

        //封装参数对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);
        brand.setBrandName(brandName);

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //执行并封装
        List<Brand> brands = brandMapper.selectDynamicSQL002(brand);
        //释放资源
        sqlSession.close();
        //查看结果集
        for (Brand bra :brands) {
            System.out.println(bra);
        }

    }


}
