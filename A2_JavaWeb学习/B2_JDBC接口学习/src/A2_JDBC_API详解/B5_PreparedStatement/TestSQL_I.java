package A2_JDBC_API详解.B5_PreparedStatement;

import java.sql.*;
import java.util.Scanner;

public class TestSQL_I {

    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        //new TestSQL_I().me01(); //' or '1' = '1

        new TestSQL_I().me02();

    }

    //SQL注入演示
    public void me01() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ling?useSSL=false", "root", "ganga");
        Statement stat = conn.createStatement();
        System.out.println("请输入账户:");
        String userSC = sc.nextLine();
        System.out.println("请输入密码:");
        String passSC = sc.nextLine();
        String getSql = "select * from user_password where user = '" + userSC + "' and password = '" + passSC+ "'";
        ResultSet rs = stat.executeQuery(getSql);
        //判断
        if(rs.next()){
            System.out.println("登录成功！");
        }else{
            System.out.println("登录失败！");
        }
    }


    //SQL防注入演示\
    public void me02() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ling?useSSL=false", "root", "ganga");
        System.out.println("请输入账户:");
        String userSC = sc.nextLine();
        System.out.println("请输入密码:");
        String passSC = sc.nextLine();

        String executeSQL = "select * from user_password where user = ? and password = ?";
        PreparedStatement ps = conn.prepareStatement(executeSQL);

        ps.setString(1 , userSC);
        ps.setString(2 , passSC);

        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            System.out.println("登录成功！");
        }else{
            System.out.println("登录失败！");
        }
    }

}
