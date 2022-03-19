# JDBC复习



## 单词

---

|          单词          |        解释        |
| :--------------------: | :----------------: |
|     DriverManager      |      驱动管理      |
|       Connection       |        连接        |
|       Statement        |     陈述；说明     |
|        execute         |        处决        |
|         Update         |        修改        |
|         Query          |        查询        |
|       ResultSet        |       结果集       |
|  Prepare**d**Stement   |  预备 & 说明 [类]  |
|     prepareStement     | 准备 & 说明 [方法] |
|     setAutoCommit      |    设置自动提交    |
|         commit         |        提交        |
|        rollback        |        回滚        |
|                        |                    |
|         Druid          |       德鲁伊       |
|       Properties       |        属性        |
|          load          |        装载        |
|       DataSource       |       数据源       |
| DruidDataSourceFactory |  德鲁伊数据源工厂  |
|                        |                    |
|                        |                    |







## 单独连接

```java
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

```





## 事务提交&回滚

```java
package A2_JDBC_API详解.B2_Connection;

import com.mysql.jdbc.exceptions.MySQLDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class TestConnection {

    //通过Java控制 [关系型数据库] mysql 的步骤
    public static void main(String[] args) throws Exception {

/*      Scanner sc = new Scanner(System.in);
        System.out.print("请输入密码: ");

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql:///testsql?userSSL=true";
        String user = "root";
        //获取输入的密码
        String password = sc.next();
        Connection conn = DriverManager.getConnection(url,user,password);

        //定义sql语句
        String executeUpdateOne = "update student set math = 90 where id = 7";
        String executeUpdateTwo = "update student set math = 100 where id = 8";

        //获取执行sql语句对象
        Statement statement = conn.createStatement();

        //使用手动开启事务 执行sql语句。
        try{
            //开启事务
            conn.setAutoCommit(false); //参数是false

            //使用Statement 执行sql语句1
            int num1 = statement.executeUpdate(executeUpdateOne);
            System.out.println(num1);

            //执行sql语句2
            int num2 = statement.executeUpdate(executeUpdateTwo);
            System.out.println(num2);

            //关闭事务 并提交事务
            conn.commit();

        }catch (Exception e){

            //如果出现异常 则回滚事务
            conn.rollback();
            e.printStackTrace();

        }

        //释放资源
        statement.close();
        conn.close();*/

        //1: 注册驱动
        //Class.forName("com.mysql.jdbc.Driver"); //jar5后 可以省略这行         */

        //2: 获取连接
        String url = "jdbc:mysql:///testsql?useSSL=false";
        String user = "root";
        String password = "ganga";
        //获取Connection对象
        Connection conn = DriverManager.getConnection(url, user, password);

        //3. 定义sql语句
        String sql1 = "update student set math = 99 where id = 8"; //sql后不用分号
        String sql2 = "update student set math = 101 where id = 7";

        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();



        //使用异常处理
        try {

            //开启事务
            conn.setAutoCommit(false);

            //5-1. 执行sql
            int count1 = stmt.executeUpdate(sql1); //执行sql 返回值是 受影响的行数
            //6-1. 处理结果
            System.out.println(count1);

            //5-2. 执行sql
            int count2 = stmt.executeUpdate(sql2); //执行sql 返回值是 受影响的行数
            //6-2. 处理结果
            System.out.println(count2);

            //提交事务
            conn.commit();

        }catch(Exception e){

            //出现异常 回滚
            conn.rollback();
            //打印异常问题
            e.printStackTrace();
        }



        //7. 释放资源
        //stmt对象是由conn对象得到的, 所以先释放stmt对象
        stmt.close();
        conn.close();

    }

}

```



## 查询结果

```java
package A2_JDBC_API详解.B4_ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestResultSet {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接对象
        String url = "jdbc:mysql:///ling?useSSL=false";
        String user = "root";
        String password = sc.next();
        Connection conn = DriverManager.getConnection(url,user,password);

        //获取sql对象
        Statement stat = conn.createStatement();

        //创建sql语句
        String sql = "select * from stu";

        //获取查询结果对象 ResultSet对象
        ResultSet rs = stat.executeQuery(sql);

        System.out.println("==========================");

        //获取结果
        while (rs.next()){
            int id = rs.getInt("id");//可以是列名称
            String name = rs.getString(2);//可以是第几列
            double score = rs.getDouble(3);//列从1开始

            System.out.println(id);
            System.out.println(name);
            System.out.println(score);
            System.out.println("=======================");
        }

        //释放资源
        rs.close();
        stat.close();
        conn.close();

    }


}

```





## SQL注入 & 防SQL注入

```java
package A2_JDBC_API详解.B5_PreparedStatement;


import java.sql.*;
import java.util.Scanner;

public class TestSQL_Injection {

    public static void main(String[] args) throws Exception {

        //SQL注入
        new TestSQL_Injection().TestLogin_Injection();

        //防止SQL注入
        //new TestSQL_Injection().TestLogin();

    }

    //SQL注入演示
    public void TestLogin_Injection() throws Exception {

        System.out.println("SQL注入演示使用： ' or '1' = '1 登录成功！");
        Scanner sc = new Scanner(System.in);

        //获取账号
        System.out.print("请入账户：");
        String user = sc.nextLine();
        //获取密码
        System.out.print("请输入密码：");
        String password = sc.nextLine();

        //开始执行JDBC操作

        Connection conn = DriverManager.getConnection("jdbc:mysql:///ling?useSSL=false", "root", "ganga");
        Statement statement = conn.createStatement();

        String sql = "select * from user_password where user = '" + user + "' and password = '" + password + "'";
        ResultSet rs = statement.executeQuery(sql);


        if (rs.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }

        rs.close();
        statement.close();
        conn.close();

    }

    public void TestLogin() throws Exception {
        System.out.println("防止SQL注入演示使用： ' or '1' = '1 登录失败！");
        //获取键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请入账户：");
        String user = sc.nextLine();
        //获取密码
        System.out.print("请输入密码：");
        String password = sc.nextLine();

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");


        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ling?useSSL=false", "root", "ganga");

        //DQL语句
        String sql = "select * from user_password where user = ? and password = ? ";

        //获取sql执行对象statement对象
        PreparedStatement ps = conn.prepareStatement(sql);

        //设置统配符
        ps.setString(1,user);
        ps.setString(2,password);

        //查看是否有数据
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }


        //释放资源
        rs.close();
        ps.close();
        conn.close();


    }


    public void TestPrepared_other(){



    }

}
```





---

---

---





## 连接池 Druid 德鲁伊连接池



### 配置文件

![image-20220224091820621](D:\源代码\img\MDimg\image-20220224091820621.png)



### 通过Druid获取Connection连接对象

```java
package A3_JDBC_数据库连接池.德鲁伊;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/*
*
* Druid的使用方法
*
* */
public class TestDruid {

    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("user.dir"));

        //1.导入jar包

        //2.定义配置文件

        //3.加载配置文件
        Properties/*属性*/ prop = new Properties();
        prop.load/*装载*/(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));

        //4.获取连接池对象
        DataSource dataSource/*来源*/ =
                DruidDataSourceFactory/*德鲁伊 数据 来源 工厂*/.createDataSource/*创建 数据 来源*/(prop);

        //5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        //查看conn对象
        System.out.println(conn);

        /* 结果
        2月 22, 2022 8:23:42 上午 com.alibaba.druid.pool.DruidDataSource info
        信息: {dataSource-1} inited
        com.mysql.jdbc.JDBC4Connection@75f9eccc
        */

    }

}
```



### 案例

![img](D:\源代码\img\MDimg\img-16456656721101.png)



查询

```java
package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.查询;

import A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.Brand;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
*
* [增删改查] 分析三要素:
*   1. 需要查询的sql语句: select * from tb_brand;
*   2. 需要的参数: 不需要
*   3. 需要表达的结果: 封装成 List<brand>
*
* */
public class TestQuery_JDBC {

    @Test
    public void query() throws Exception{

        //1. 创建connection连接
        //1.1 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取数据库连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 获取连接对象
        Connection conn = ds.getConnection();

        //2. 定义sql语句
        String querySQL = "select * from tb_brand";

        //3. 获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(querySQL);

        //4. 设置参数
        //ps.setInt(1, );
        //ps.setString(2," ");

        //5. 获取结果对象ResultSet
        ResultSet rs = ps.executeQuery();

        //6. 创建封装对象
        List<Brand> list = new ArrayList<>();
        Brand brand = null;

        //7. 查询结果 并封装
        while(rs.next()){

            //获取数据
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");

            //封装对象
            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);

            list.add(brand);

        }

        //8. 释放资源
        rs.close();
        ps.close();
        conn.close();


        //遍历查看结果
        for (Brand br: list) {
            System.out.println(br);
        }

    }

}

```





修改

```java
package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.修改;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*
*
* [增删改查] 分析三要素:
*   1. 需要查询的sql语句:
*       update tb_brand set
*           brand_name = ?,
*           company_name = ?,
*           ordered = ?,
*           description = ?,
*           status = ?
*       where id = ?;
*
*   2. 需要的参数: 全部
*   3. 需要表达的结果: boolean
*
* */

public class TestUpdate_JDBC {

    @Test
    public void updateTest() throws Exception{

        //1. 获取Connection连接对象
        //1.1 配置 德鲁伊配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取数据库连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 通过 连接池 获取Connection连接对象
        Connection conn = ds.getConnection();

        //2. 定义sql语句
        String updateSql = "update tb_brand set \n" +
                           "    brand_name = ?,\n" +
                           "    company_name = ?,\n" +
                           "    ordered = ?,\n" +
                           "    description = ?,\n" +
                           "    status = ?\n" +
                           "where id = ?;";

        //3. 获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(updateSql);

        //4. 设置参数
        ps.setString(1,"英雄联盟");
        ps.setString(2,"拳头游戏");
        ps.setInt(3,1);
        ps.setString(4,"赏金yyds");
        ps.setInt(5,1);
        ps.setInt(6,4);

        //5. 执行语句
        int num = ps.executeUpdate();

        //6. 判断结果
        if (num == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //释放资源
        ps.close();
        conn.close();

    }

}

```





添加

```java
package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.添加;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/*
*
* [增删改查] 分析三要素:
*   1. 需要查询的sql语句:  insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?);
*   2. 需要的参数:   除id外的所有参数
*   3. 需要表达的结果: boolean值
* */

public class TestAdd_JDBC {

    @Test
    public void addTest() throws Exception{

        //1. 获取Connection连接对象
        //1.1 配置 德鲁伊配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取连接池配置文件
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 通过ds对象获取Connection连接对象
        Connection conn = ds.getConnection();

        //定义sql语句
        String addSql = "insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";

        //3. 获取Statement连接对象
        PreparedStatement ps = conn.prepareStatement(addSql);

        //4. 设置参数
        ps.setString(1,"LOL");
        ps.setString(2,"Riot Games");
        ps.setInt(3,2);
        ps.setString(4, "good LOL");
        ps.setInt(5,1);

        //5. 执行sql
        int i = ps.executeUpdate();

        //6. 判断结果是否成功
        if (i == 1){
            System.out.println("数据添加成功");
        }else{
            System.out.println("数据添加失败");
        }

        //释放资源
        ps.close();
        conn.close();

    }


}

```





删除

```java
package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.删除;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/*
 *
 * [增删改查] 分析三要素:
 *   1. 需要查询的sql语句: delete from tb_brand where id = 4
 *   2. 需要的参数: id
 *   3. 需要表达的结果: boolean
 *
 * */
public class TestDelete_JDBC {

    @Test
    public void deleteTest() throws Exception{

        //1. 获取Connection连接对象
        //1.1 配置德鲁伊Druid配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取连接池
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 获取Connection对象
        Connection conn = ds.getConnection();

        //2. 定义sql语句
        String deleteSql = "delete from tb_brand where id = ?";

        //3. 获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(deleteSql);

        //4. 设置参数
        ps.setInt(1,4);

        //5. 执行语句
        int num = ps.executeUpdate();

        //6. 分析结果
        if (num == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //7. 释放资源
        ps.close();
        conn.close();

    }

}

```

