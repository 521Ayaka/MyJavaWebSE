package com.ganga.mapper;

import com.ganga.pojo.Bran;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BranMapper {

    /*
    * 查询所有
    * */
    List<Bran> selectAll();


    /*演示使用 可以使用@ResultMap注解 转化映射属性名*/
    @Select("select * from tb_brands;")
    @ResultMap("brandsResultMap")
    List<Bran> selectAllDame();


    @Insert("insert into tb_brands values (null,#{brandName},#{companyName},#{ordered},#{description},#{status});")
    int add(Bran bran);

    Bran selectById(int id);

    int update(Bran bran);

    @Delete("delete from tb_brands where id = #{id};")
    int deleteById(int id);



}
