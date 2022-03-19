package A1_ServletMethod;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/dame2", loadOnStartup = -1)
public class ServletDame2 implements Servlet {

    /* 初始化方法
    * 1.调用时机: 在默认情况下，Servlet被第一次访问时，调用
    *       lodeOnStartup 修改默认值
    * 2.调用次数: 1次
    * */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init...");
    }

    /* 提供服务
    * 1.调用时机: 每一次在Servlet被访问时,调用
    * 2.调用次数: 多次
    * */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Hello Servlet ...");
    }

    /* 销毁方法
    * 1.调用时机: 内存释放(少数) 或者 服务器关闭的时候, Servlet对象会被销毁, 调用
    * 2.调用次数: 1次
    * */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }


    @Override
    public String getServletInfo() {
        return null;
    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

}




