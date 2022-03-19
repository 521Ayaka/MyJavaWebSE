package A3_HttpServletDame.MyServlet_Impl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class MyHttpServlet implements Servlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        //获取HttpServletRequest 对象   【ServletRequest强转】
        HttpServletRequest request = (HttpServletRequest) req;

        //获取请求方式
        String method = request.getMethod();

        //判断请求方式
        if ("GET".equals(method)){
            doGet(req,res);
        }else if ("POST".equals(method)){
            doPost(req,res);
        }

    }

    //Get请求方式逻辑
    protected/*改为protected修饰符 子类可以查看*/ void doGet(ServletRequest req, ServletResponse res) {
    }


    //Post请求方式逻辑
    protected/*改为protected修饰符 子类可以查看*/ void doPost(ServletRequest req, ServletResponse res) {
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
