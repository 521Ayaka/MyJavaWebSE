package A3_JDBC_数据库连接池.德鲁伊;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/*
*
* Druid的使用方法
*
* */
public class TestDruid {

    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("user.dir"));

        //1.导入jar包

        //2.定义配置文件

        //3.加载配置文件
        Properties/*属性*/ prop = new Properties();
        prop.load/*装载*/(new FileInputStream("D:\\源代码\\A2_JavaWeb学习js\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));

        //4.获取连接池对象
        DataSource dataSource/*来源*/ =
                DruidDataSourceFactory/*德鲁伊 数据 来源 工厂*/.createDataSource/*创建 数据 来源*/(prop);

        //5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        //查看conn对象
        System.out.println(conn);

        /* 结果
        2月 22, 2022 8:23:42 上午 com.alibaba.druid.pool.DruidDataSource info
        信息: {dataSource-1} inited
        com.mysql.jdbc.JDBC4Connection@75f9eccc
        */

    }

}
