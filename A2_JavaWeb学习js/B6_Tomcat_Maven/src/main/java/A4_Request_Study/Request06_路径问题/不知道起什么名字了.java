package A4_Request_Study.Request06_路径问题;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rrr")
public class 不知道起什么名字了 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("use rrr...");
        //重定向 获取为了避免虚拟目录的偶然性 可以动态获取虚拟目录
        //动态获取虚拟目录
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/rr2");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
