package A2_JDBC_API详解.B2_Connection;

import com.mysql.jdbc.exceptions.MySQLDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestConnection {

    //通过Java控制 [关系型数据库] mysql 的步骤
    public static void main(String[] args) throws Exception {

        //1: 注册驱动
        //Class.forName("com.mysql.jdbc.Driver"); //jar5后 可以省略这行         */

        //2: 获取连接
        String url = "jdbc:mysql:///testsql?false";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password); //获取Connection对象

        //3. 定义sql语句
        String sql1 = "update student set math = 99 where id = 8"; //sql后不用分号
        String sql2 = "update student set math = 101 where id = 7";

        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();

        /*
        */

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
