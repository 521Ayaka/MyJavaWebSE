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
