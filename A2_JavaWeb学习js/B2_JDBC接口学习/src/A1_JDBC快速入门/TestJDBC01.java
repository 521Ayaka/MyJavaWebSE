package A1_JDBC快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJDBC01 {


    //通过Java控制 [关系型数据库] mysql 的步骤
    public static void main(String[] args) throws Exception {

        //1: 注册驱动
        Class.forName("com.mysql.jdbc.Driver"); //jar5后 可以省略这行

        //2: 获取连接
        String url = "jdbc:mysql://172.20.48.100/testsql";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password); //获取Connection对象

        //3. 定义sql语句
        String sql = "update student set math = 100 where id = 8"; //sql后不用分号

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
    /*
    Host is not allowed to connect to this MySQL server解决方法

    执行use mysql;
    执行update user set host = '%' where user = 'root';这一句执行完可能会报错，不用管它。
    执行FLUSH PRIVILEGES;

    */

}
