package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.删除;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/*
 *
 * [增删改查] 分析三要素:
 *   1. 需要查询的sql语句: delete from tb_brand where id = 4
 *   2. 需要的参数: id
 *   3. 需要表达的结果: boolean
 *
 * */
public class TestDelete_JDBC {

    @Test
    public void deleteTest() throws Exception{

        //1. 获取Connection连接对象
        //1.1 配置德鲁伊Druid配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习js\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取连接池
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 获取Connection对象
        Connection conn = ds.getConnection();

        //2. 定义sql语句
        String deleteSql = "delete from tb_brand where id = ?";

        //3. 获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(deleteSql);

        //4. 设置参数
        ps.setInt(1,4);

        //5. 执行语句
        int num = ps.executeUpdate();

        //6. 分析结果
        if (num == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //7. 释放资源
        ps.close();
        conn.close();

    }

}
