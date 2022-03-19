package A2_JDBC_API详解.B2_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class TestCT {

    public static void main(String[] args) throws Exception{

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接对象
        String url = "jdbc:mysql:///testsql?useSSL=false";
        String user = "root";
        String password = new Scanner(System.in).next();
        Connection conn = DriverManager.getConnection(url, user, password);

        //定义执行的sql语句
        String executeOne = "update student set math = 95 where id = 8";
        String executeTwo = "update student set english = 60 where id = 8";

        //获取连接对象
        Statement statement = conn.createStatement();

        //开始执行sql
        try{
            //开启事务
            conn.setAutoCommit(false);

            //执行第一个sql
            int numOne = statement.executeUpdate(executeOne);
            System.out.println(numOne);

            //执行第二个sql
            int numTwo = statement.executeUpdate(executeTwo);
            System.out.println(numTwo);

            //提交事务
            conn.commit();

        }catch (Exception e){

            //如果出现一次 则回滚事务
            conn.rollback();
            e.printStackTrace();
        }

        //释放资源
        statement.close();
        conn.close();

    }

}
