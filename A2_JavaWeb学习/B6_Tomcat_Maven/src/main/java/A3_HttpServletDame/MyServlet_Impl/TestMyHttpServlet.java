package A3_HttpServletDame.MyServlet_Impl;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/dame03") //这里要加上 实现类(父类)不需要加
public class TestMyHttpServlet extends MyHttpServlet/*继承实现接口*/{

    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        //写get的逻辑
        System.out.println("is Get...");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        //写post的逻辑
        System.out.println("is Post...");
    }
}
