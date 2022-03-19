package A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.查询;

import A3_JDBC_数据库连接池.德鲁伊.案例_增删改查.Brand;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
*
* [增删改查] 分析三要素:
*   1. 需要查询的sql语句: select * from tb_brand;
*   2. 需要的参数: 不需要
*   3. 需要表达的结果: 封装成 List<brand>
*
* */
public class TestQuery_JDBC {

    @Test
    public void query() throws Exception{

        //1. 创建connection连接
        //1.1 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B2_JDBC接口学习\\src\\A3_JDBC_数据库连接池\\德鲁伊\\配置文件\\druid.properties"));
        //1.2 获取数据库连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //1.3 获取连接对象
        Connection conn = ds.getConnection();

        //2. 定义sql语句
        String querySQL = "select * from tb_brand";

        //3. 获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(querySQL);

        //4. 设置参数
        //ps.setInt(1, );
        //ps.setString(2," ");

        //5. 获取结果对象ResultSet
        ResultSet rs = ps.executeQuery();

        //6. 创建封装对象
        List<Brand> list = new ArrayList<>();
        Brand brand = null;

        //7. 查询结果 并封装
        while(rs.next()){

            //获取数据
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");

            //封装对象
            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);

            list.add(brand);

        }

        //8. 释放资源
        rs.close();
        ps.close();
        conn.close();


        //遍历查看结果
        for (Brand br: list) {
            System.out.println(br);
        }

    }

}
