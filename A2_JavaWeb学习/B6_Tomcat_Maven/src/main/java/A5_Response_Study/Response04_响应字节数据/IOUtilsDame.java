package A5_Response_Study.Response04_响应字节数据;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/lpm")
public class IOUtilsDame extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* pom.xml 导入工具坐标
        *     <dependency>
        *       <groupId>commons-io</groupId>
        *       <artifactId>commons-io</artifactId>
        *       <version>2.5</version>
        *     </dependency>
        *
        *   使用 IOUtils 工具类的 copy方法 进行对流的 对拷...
        *
        * */

        //创建字节输入流 读取数据
        FileInputStream fis = new FileInputStream("D:\\源代码\\A2_JavaWeb学习\\B6_Tomcat_Maven\\src\\main\\java\\A5_Response_Study\\Response04_响应字节数据\\imgs.jpg");

        //获取字节输入流 写入数据
        ServletOutputStream sos = response.getOutputStream();

        //copy
        IOUtils.copy(fis,sos);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
