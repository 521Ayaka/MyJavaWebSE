package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.添加;

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
*   1. 需要查询的sql语句:  insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?);
*   2. 需要的参数:   除id外的所有参数
*   3. 需要表达的结果: boolean值
* */

public class TestAdd_JDBC {

    @Test
    public void addTest() throws Exception{

        //1. 获取Connection连接对象
        //1.1 配置 德鲁伊配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取连接池配置文件
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 通过ds对象获取Connection连接对象
        Connection conn = ds.getConnection();

        //定义sql语句
        String addSql = "insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";

        //3. 获取Statement连接对象
        PreparedStatement ps = conn.prepareStatement(addSql);

        //4. 设置参数
        ps.setString(1,"LOL");
        ps.setString(2,"Riot Games");
        ps.setInt(3,2);
        ps.setString(4, "good LOL");
        ps.setInt(5,1);

        //5. 执行sql
        int i = ps.executeUpdate();

        //6. 判断结果是否成功
        if (i == 1){
            System.out.println("数据添加成功");
        }else{
            System.out.println("数据添加失败");
        }

        //释放资源
        ps.close();
        conn.close();

    }


}
