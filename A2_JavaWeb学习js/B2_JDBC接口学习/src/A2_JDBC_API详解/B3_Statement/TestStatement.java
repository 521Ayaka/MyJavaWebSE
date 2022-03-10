package A2_JDBC_API详解.B3_Statement;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {


    @Test
    public void TestDML() throws SQLException {
        //1: 注册驱动
        //Class.forName("com.mysql.jdbc.Driver"); //jar5后 可以省略这行         */

        //2: 获取连接
        //获取Connection对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///testsql?useSSL=false","root", "ganga");

        //3. 定义sql语句
        String sql1 = "update student set math = 99 where id = 8"; //sql后不用分号

        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();

        //5. 执行sql语句
        int num = stmt.executeUpdate(sql1);

        //6. 结果
        if (num == 1){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }

        //7. 释放资源
        //stmt对象是由conn对象得到的, 所以先释放stmt对象
        stmt.close();
        conn.close();

    }

    @Test
    public void TestDDL() throws Exception {

        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///testsql?useSSL=false", "root", "ganga");
    }

}


