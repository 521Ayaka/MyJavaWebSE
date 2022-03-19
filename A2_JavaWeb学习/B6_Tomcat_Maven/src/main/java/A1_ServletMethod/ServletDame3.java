package A1_ServletMethod;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/dame3", loadOnStartup = 0)
public class ServletDame3 implements Servlet {

    /*提取Tomcat调用Service方法时 的ServletConfig对象*/
    private ServletConfig config;

    /* 初始化方法
     * 1.调用时机: 在默认情况下，Servlet被第一次访问时，调用
     *       lodeOnStartup 修改默认值
     * 2.调用次数: 1次
     * */
    @Override
    public void init(ServletConfig config) throws ServletException {

        //提取Tomcat调用Service方法时 的ServletConfig对象
        this.config = config;
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


    /*
    * 获取Servlet对象的信息
    * */
    @Override
    public String getServletInfo() {
        return null;
    }

    /*
    * 获取Servlet配置对象
    * */
    @Override
    public ServletConfig getServletConfig() {
        return config;//返回的是Tomcat生成的配置对象
    }

}
