package A4_Request_Study.Request05_请求转发_重定向.重定向Response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/rr1")
public class ResponseRedirect01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("ues rr1...");

        //重定向 方式一:
        //1. 设置响应状态码 302 found
        response.setStatus(302); //302 状态码
        //2. 设置重定向的目录 url
        response.setHeader("Location", "/B6_Tomcat_Maven_war/rr2");

        //重定向 方式二:
        response.sendRedirect("/B6_Tomcat_Maven_war/rr2");

        //重定向 ： 路径可以是 服务器以外的资源
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
