package A4_Request_Study.Request05_请求转发_重定向.请求转发.DespatcherMethod;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/dis002")
public class DispatcherMethod02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("use dis002...");

        //接收转发参数
        Object valueObj = request.getAttribute("key");
        System.out.println(valueObj);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
