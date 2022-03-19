package A2_JDBC_API详解.B4_ResultSet.案例.Test;

import java.sql.*;

public class TestRS {

    public static void main(String[] args) throws SQLException {
        new TestRS().method();
    }

    public void method() throws SQLException {

        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ling?useSSL=false", "root", "ganga");

        //定义查询语句
        String sqlDQL = "select * from stu";

        //获取sql连接对象
        Statement stat = conn.createStatement();

        //获取查询语句对象
        ResultSet rs = stat.executeQuery(sqlDQL);

        //使用while获取查询结果
        while(rs.next()){ //循环光标

            int id = rs.getInt("id"); //参数可以是列名
            String string = rs.getString(2);//参数可以是第一列 列从1开始
            double aDouble = rs.getDouble(3);//第三列

            //打印验证结果
            System.out.println(id);
            System.out.println(string);
            System.out.println(aDouble);
            System.out.println("==================");

        }

        //释放资源
        rs.close();
        stat.close();
        conn.close();

    }


}
