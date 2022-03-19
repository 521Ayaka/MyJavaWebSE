package A2_JDBC_API详解.B4_ResultSet.案例.Test;

import A2_JDBC_API详解.B4_ResultSet.案例.pojo.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RS_List {

    public static void main(String[] args) throws SQLException {
        new RS_List().method();
    }

    public void method() throws SQLException {
        Scanner sc = new Scanner(System.in);

        //创建一个list集合 存放Account对象
        ArrayList<Account> accountList = new ArrayList<>();

        System.out.println("请输入密码:");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ling?useSSL=false", "root", sc.next());
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from sta");

        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            double salary = rs.getDouble(3);

            //创建 并 放入 Account集合当中
            Account account = new Account();
            account.setId(id);
            account.setName(name);
            account.setSalary(salary);

            accountList.add(account);
        }

        //释放资源
        rs.close();
        stat.close();
        conn.close();

        System.out.println("要查询的id");
        Account acc = ofID(accountList, sc.nextInt());

        //打印查询结果
        if (acc != null){
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getSalary());
        }else{
            System.out.println("无查询结果");
        }


    }

    //判断id
    public Account ofID(ArrayList<Account> list , int uid){
        Iterator<Account> iter = list.iterator();
        while(iter.hasNext()){
            Account acc = iter.next();
            if (acc.getId() == uid){
                return acc;
            }
        }
        return null;
    }

}
