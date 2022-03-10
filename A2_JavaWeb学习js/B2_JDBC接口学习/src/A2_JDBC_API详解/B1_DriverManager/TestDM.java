package A2_JDBC_API详解.B1_DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDM {

    public static void main(String[] args) throws Exception{


        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接对象
        String url = "jdbc:mysql:///testsql?useSSL=false";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password);

        //定义sql语句
        String execute = "update student set math = 90 where id = 8";

        //获取执行sql语句对象
        Statement stat = conn.createStatement();

        //执行sql语句
        int num = stat.executeUpdate(execute);

        //查看处理结果
        System.out.println(num);

        //释放资源
        stat.close();
        conn.close();





    }

}
