package com.ganga.mapper;

import com.ganga.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUser(@Param("username")String username, @Param("password")String password);

    User selectByUsername(String username);

    //这里复习一下注解开发
    @Insert("insert into tb_user (username, password) values (#{username},#{password});")
    int selectAdd(@Param("username")String username, @Param("password")String password);

}
