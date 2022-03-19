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
