package A5_Response_Study.Response04_响应字节数据;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/老婆们")
public class ResponseOutputStream01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //1. 创建字节输入流 来 读取文件
        FileInputStream fis = new FileInputStream("D:\\源代码\\A2_JavaWeb学习js\\B6_Tomcat_Maven\\src\\main\\java\\A5_Response_Study\\Response04_响应字节数据\\imgs.jpg");

        //2. 获取字节输出流 来 写入文件
        ServletOutputStream sos = resp.getOutputStream();

        //3. copy
        byte[] bytes = new byte[1024];
        int len = 0;
        while( (len = fis.read(bytes)) != -1 ){
            //copy
            sos.write(bytes,0,len);
        }

        //只释放fis的流资源
        fis.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
