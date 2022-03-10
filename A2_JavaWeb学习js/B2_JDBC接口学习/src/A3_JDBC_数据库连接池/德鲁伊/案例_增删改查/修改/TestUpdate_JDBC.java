package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.修改;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*
*
* [增删改查] 分析三要素:
*   1. 需要查询的sql语句:
*       update tb_brand set
*           brand_name = ?,
*           company_name = ?,
*           ordered = ?,
*           description = ?,
*           status = ?
*       where id = ?;
*
*   2. 需要的参数: 全部
*   3. 需要表达的结果: boolean
*
* */

public class TestUpdate_JDBC {

    @Test
    public void updateTest() throws Exception{

        //1. 获取Connection连接对象
        //1.1 配置 德鲁伊配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习js\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取数据库连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 通过 连接池 获取Connection连接对象
        Connection conn = ds.getConnection();

        //2. 定义sql语句
        String updateSql = "update tb_brand set \n" +
                           "    brand_name = ?,\n" +
                           "    company_name = ?,\n" +
                           "    ordered = ?,\n" +
                           "    description = ?,\n" +
                           "    status = ?\n" +
                           "where id = ?;";

        //3. 获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(updateSql);

        //4. 设置参数
        ps.setString(1,"英雄联盟");
        ps.setString(2,"拳头游戏");
        ps.setInt(3,1);
        ps.setString(4,"赏金yyds");
        ps.setInt(5,1);
        ps.setInt(6,4);

        //5. 执行语句
        int num = ps.executeUpdate();

        //6. 判断结果
        if (num == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //释放资源
        ps.close();
        conn.close();

    }

}
