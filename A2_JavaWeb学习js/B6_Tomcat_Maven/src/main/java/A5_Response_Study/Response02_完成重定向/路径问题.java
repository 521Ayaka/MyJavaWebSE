package A5_Response_Study.Response02_完成重定向;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rrr001")
public class 路径问题 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("use rrr001...");
        //重定向 获取为了避免虚拟目录的偶然性 可以动态获取虚拟目录
        //动态获取虚拟目录
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/rr02");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
