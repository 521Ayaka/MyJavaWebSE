package A2_JDBC_API详解.B1_DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*  DriverManager详解

package com.mysql.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Driver extends NonRegisteringDriver implements java.sql.Driver {

    public Driver() throws SQLException {
    }

    static {
        try { //这里来调用DriverManager.registerDriver()方法来注册驱动
            DriverManager.registerDriver(new Driver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }
}

*/


public class TestDriverManager {

    //通过Java控制 [关系型数据库] mysql 的步骤
    public static void main(String[] args) throws Exception {

        //1: 注册驱动
        //Class.forName("com.mysql.jdbc.Driver"); //jar5后 可以省略这行
/*
        static {
            try { //这里来调用DriverManager.registerDriver()方法来注册驱动
                DriverManager.registerDriver(new Driver());
            } catch (SQLException var1) {
                throw new RuntimeException("Can't register driver!");
            }
        }
                                                                     */


        //2: 获取连接
        /*
        * url格式：
        *       jdbc:mysql:// 需要连接的ip或域名 : 端口号 / 要使用的数据库名称 ? 键值对[可不写]
        *
        * mysql的默认端口是3306 如果是默认端口 可以省略
        *       jdbc:mysql:// 需要连接的ip或域名 / 要使用的数据库名称 ? 键值对[可不写]
        *
        * 如果连接本机Host的mysql 则可以简化不写ip和端口号
        *       jdbc:mysql:/// 要使用的数据库名称 ? 键值对[可不写]
        *
        * 使用键值对 去除SSL的警告
        *       useSSL = false
        *
        *
        * */
        String url = "jdbc:mysql:///testsql?useSSL=false";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password); //获取Connection对象

        //3. 定义sql语句
        String sql = "update student set math = 99 where id = 8"; //sql后不用分号

        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();

        //5. 执行sql
        int count = stmt.executeUpdate(sql); //执行sql 返回值是 受影响的行数

        //6. 处理结果
        System.out.println(count);

        //7. 释放资源
        //stmt对象是由conn对象得到的, 所以先释放stmt对象
        stmt.close();
        conn.close();

    }

}
