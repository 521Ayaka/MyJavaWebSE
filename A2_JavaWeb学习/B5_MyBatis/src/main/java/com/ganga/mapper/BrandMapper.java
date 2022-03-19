package com.ganga.mapper;

import com.ganga.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

    /*
     * 查询所有
     * */
    List<Brand> selectAll();

    /*
     * 通过id查询
     * */
    Brand selectById(int id);

    /*
     *使用到特殊字符
     * 判断ordered>=50的数据
     */
    List<Brand> selectByOrdered();

    /**
     * 条件查询
     *
     * MyBatis 参数封装：
     *
     * 单个参数：
     *      1. POJO类型：直接使用，属性名 和 参数占位符名称 一致
     *      2. Map集合：直接使用，键名 和 参数占位符名称 一致
     *      3. Collection：封装为Map集合，可以使用@Param注解，替换Map集合中默认的arg键名
     *          map.put("arg0",collection集合);
     *          map.put("collection",collection集合);
     *      4. List：封装为Map集合，可以使用@Param注解，替换Map集合中默认的arg键名
     *          map.put("arg0",list集合);
     *          map.put("collection",list集合);
     *          map.put("list",list集合);
     *      5. Array：封装为Map集合，可以使用@Param注解，替换Map集合中默认的arg键名
     *          map.put("arg0",数组);
     *          map.put("array",数组);
     *      6. 其他类型：直接使用
     *
     *
     *   多个参数：封装为Map集合,可以使用@Param注解，替换Map集合中默认的arg键名
     *          	以 arg 开头  ：第一个参数就叫 arg0，第二个参数就叫 arg1，以此类推。如：
     * 	                map.put("arg0"，参数值1);
     * 	                map.put("arg1"，参数值2);
     * 	            以 param 开头 ： 第一个参数就叫 param1，第二个参数就叫 param2，依次类推。如：
     * 	                map.put("param1"，参数值1);
     * 	                map.put("param2"，参数值2);
     *
     *            @Param 注解后--------------------------------------
     * 	            map.put("自定义key1"，参数值1);
     * 	            map.put("自定义key2"，参数值2);
     * 	            map.put("param1"，参数值1);
     * 	            map.put("param2"，参数值2);
     *
     *
     * 常用的三种:
     *      1. 散装参数: 如果方法中有多个参数, 需要使用( @Param("SQL参数占位符名称")数据类型 参数名称一般和占位符名称相同 )
     *      2. 对象参数: 对象的属性名称要和参数占位符名称一致
     *      3. map集合参数: Map map = new HashMap(); map.put("占位符名称",参数);
     *
     * @param status
     * @param companyName
     * @param brandName
     * @return
     */

    /*
    *
    * 默认时Map集合
	*       以 arg 开头  ：第一个参数就叫 arg0，第二个参数就叫 arg1，以此类推。如：
	*	        map.put("arg0"，参数值1);
	*	        map.put("arg1"，参数值2);
	*       以 param 开头 ： 第一个参数就叫 param1，第二个参数就叫 param2，依次类推。如：
	*	        map.put("param1"，参数值1);
	*	        map.put("param2"，参数值2);
	*
    *  @Param 注解后--------------------------------------
	*	    map.put("自定义key1"，参数值1);
	*	    map.put("自定义key2"，参数值2);
	*	    map.put("param1"，参数值1);
	*	    map.put("param2"，参数值2);
    *
    * */
    List<Brand> selectByCondition1(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    List<Brand> selectByCondition2(Brand brand);

    List<Brand> selectByCondition3(Map map);


    /**
     * 动态获取SQL
     */
    /*
     * 这种查询方式 用户必须要输入全部数据 而不能只输入一个
     * */
    List<Brand> selectDynamicSQL01(Map map);

    /*
     * 解决方案: 态标签<if>
     *   依然纯在问题:
     *   如果不查询第一个参数 后面的语句会有一个 and 组成了 where and 不合法
     * */
    List<Brand> selectDynamicSQL02(Map map);

    /*
     * 解决方案: 动态标签<where>
     *           会自动替换 没用的and等
     * */
    List<Brand> selectDynamicSQL03(Map map);


    /**
     * 动态获取SQL 查询条件: 单条件动态查询
     */
    /*
     * 需求: 3个公司中选择出一个公司
     *       再从该公司中模糊查询该商品
     *
     *
     * */
    List<Brand> selectDynamicSQL001(Brand brand);

    List<Brand> selectDynamicSQL002(Brand brand);


    /**
     * 添加数据操作
     * 返回值: 是int 受影响的行数
     * <p>
     * 在 insert 标签中添加两个参数
     * <insert id="addAll" useGeneratedKeys="true" keyProperty="id">
     */
    int addAll(Brand brand);


    /**
     * 修改操作:
     */
    int updateBrand(Brand brand);
    /*
    * 动态sql 修改数据
    *   使用 <set> 标签
    * */
    int updateBrandDynamic(Brand brand);



    /**
     *
     * 删除语句
     *
     */
    /* 单个删除 */
    int deleteById(int id);

    /*
    * 批量删除
    *   问题：不知道用户要删除多少条数据
    *           就不知道要使用多少占位符！
    *   解决方案：
    *       使用动态SQL:
    * <foreach collection="array" item="id" separator="," open="(" close=")">
    *       #{id}
    * </foreach>
    *
    * */
    int deleteByIdAll(@Param("ids")int[] ids);


    /**
     *
     *使用注解开发
     *  一些简单的sql语句
     *
     */
    @Select("select * from tb_brand where id = #{id}")
    List<Brand> selectByIdAnnotation(int id);
}
