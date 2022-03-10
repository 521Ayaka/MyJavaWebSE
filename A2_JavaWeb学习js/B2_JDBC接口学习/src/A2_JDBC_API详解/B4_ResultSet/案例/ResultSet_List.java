package A2_JDBC_API详解.B4_ResultSet.案例;

import A2_JDBC_API详解.B4_ResultSet.案例.pojo.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResultSet_List {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //创建连接对象
        String url = "jdbc:mysql:///ling?useSSL=false";
        String user = "root";
        String password = sc.next();
        Connection conn = DriverManager.getConnection(url,user,password);

        //获取sql连接对象
        Statement statement = conn.createStatement();

        //创建sql查询语句
        String sqlDQL = "select * from sta";

        //获取查询对象ResultSet对象
        ResultSet rs = statement.executeQuery(sqlDQL);

        //创建List对象 用于接收获取结果
        List<Account> list = new ArrayList<>();

        //获取结果 并封装为对象
        while(rs.next()){
            //创建Account对象
            Account account = new Account();

            //获取查询结果
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double salary = rs.getDouble(3);

            //写入对象
            account.setId(id);
            account.setName(name);
            account.setSalary(salary);

            //将Account对象添加到集合
            list.add(account);
        }


        //释放资源
        rs.close();
        statement.close();
        conn.close();


        //查看list集合
        System.out.println(list);
        /*
        [
          Account{id=1, name='永恩', salary=10000.0},
          Account{id=2, name='瑞文', salary=9999.0},
          Account{id=3, name='亚索', salary=9999.99}
        ]
       */

    }

}
