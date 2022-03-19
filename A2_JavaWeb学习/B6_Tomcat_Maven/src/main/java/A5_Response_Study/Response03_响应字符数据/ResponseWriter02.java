package A5_Response_Study.Response03_响应字符数据;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/*
*
* 优化 并 解决中文乱码问题......
*
* */

@WebServlet("/write02")
public class ResponseWriter02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
        //获取字符流对象
        PrintWriter writer = response.getWriter();

        //让浏览器识别出html文件
        response.setHeader("content-type","text/html");

        //写数据
        writer.write("<h1 align=\"center\">腾讯用心创造快乐, 没钱玩尼玛批</h1><br>");

        //以上, 会出现乱码的格式！
        //而且, response.setHeader("content-type","text/html"); 不易写

*/      //解决方案:

        //使用 setContentType方法      中间用 ; 隔开
        response.setContentType("text/html;charset=utf-8");

        //获取字符流对象
        PrintWriter writer = response.getWriter();

        //直接写数据
        writer.write("<h1 align=\"center\">腾讯用心创造快乐, 没钱玩尼玛批</h1><br>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
