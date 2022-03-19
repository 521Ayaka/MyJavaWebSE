package A2_Servlet_urlPatterns;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
* 4. ：任意匹配:
*
*   一般不会配置这个的
* */
//@WebServlet(urlPatterns = "/")
//@WebServlet(urlPatterns = "/*")
public class UrlPatternsDame004 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dame004 doGet ...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
