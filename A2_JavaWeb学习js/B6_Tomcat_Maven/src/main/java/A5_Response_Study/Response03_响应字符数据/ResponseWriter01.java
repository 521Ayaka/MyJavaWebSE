package A5_Response_Study.Response03_响应字符数据;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/write01")
public class ResponseWriter01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取字符流对象
        PrintWriter writer = resp.getWriter();
        //写数据
        writer.write("EDG NB...\n");
        writer.write("<h1 align=\"center\">EDG NB...</h1><br>");
        writer.write("\n");

        //让浏览器识别出html文件
        resp.setHeader("content-type","text/html");
        writer.write("<h1 align=\"center\">EDG NB...</h1><br>");

        //不用结束资源
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }


}

