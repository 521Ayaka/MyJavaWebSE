package A4_Request_Study.Request04_中文解码;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/code")
public class ServletCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1. 解决乱码: POST方式 获取方式: getReader 解决方案: setCharacterEncoding("编码集")
        //System.out.println("POST..未设置编码:" + request.getParameter("username"));
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        System.out.println("POST..进行设置编码:" + username);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
