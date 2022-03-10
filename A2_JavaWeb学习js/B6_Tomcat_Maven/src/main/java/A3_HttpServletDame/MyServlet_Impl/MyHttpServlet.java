package A3_HttpServletDame.MyServlet_Impl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class MyHttpServlet implements Servlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        //寮鸿浆
        HttpServletRequest request = (HttpServletRequest) req;

        //鑾峰彇鏂规硶鍚�
        String method = request.getMethod();

        //鍒ゆ柇閫昏緫鏂瑰紡
        if ("GET".equals(method)){
            doGet(req,res);
        }else if ("POST".equals(method)){
            doPost(req,res);
        }

    }

    //Get閫昏緫鏂规硶
    protected/*鏀逛负protected淇グ绗� 瀛愮被鍙互鏌ョ湅*/ void doGet(ServletRequest req, ServletResponse res) {
    }


    //Post閫昏緫鏂规硶
    protected/*鏀逛负protected淇グ绗� 瀛愮被鍙互鏌ョ湅*/ void doPost(ServletRequest req, ServletResponse res) {
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
