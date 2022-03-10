package A4_Request_Study.Request05_请求转发_重定向.请求转发.DespatcherMethod;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*  请求转发资源间共享数据: 使用Request对象的 几个方法:
*
*   void setAttribute(String name, Object o): 存储数据到request域中
*   Object getAttribute(String name): 根据key, 获取值
*   void removeAttribute(String name): 根据key, 删除该键值对
*
* */
@WebServlet("/dis001")
public class DispatcherMethod01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("use dis001...");

        //存储转发共享数据
        request.setAttribute("key","value_Obj");

        //请求转发
        request.getRequestDispatcher("dis002").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
