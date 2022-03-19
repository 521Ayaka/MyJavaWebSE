package A2_Servlet_urlPatterns;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
* 3. 扩展名匹配：
*
*   【注意】：
*       1. 格式是没有前缀的 "LOL\*.html" 是错误的
*           只能是 "*.文件扩展名"
*
*       2. 访问的页面前面不管是什么目录 后面的文件是该扩展名即可访问
*           如: LOL/index.html   可以
*             : LOL/GanGa/Saber/Love.html 也可以
*
* */
//@WebServlet(urlPatterns = "*.html")
public class UrlPatternsDame003 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dame003 doGet ...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
