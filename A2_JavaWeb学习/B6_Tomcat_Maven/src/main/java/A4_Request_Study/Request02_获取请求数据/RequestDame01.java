package A4_Request_Study.Request02_获取请求数据;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1") //B6_Tomcat_Maven\src\main\webapp\request01.html
public class RequestDame01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*========= 请求头 =========
        *
        *         GET /B6_Tomcat_Maven/req1?username=ganga&password=123 HTTP/1.1
        *    GET请求方式               请求参数                           请求协议及版本号
        *
        *   String getMethod(): 获取请方式: GET
        *   String getContextPath(): 获取虚拟目录[项目访问路径]: /B6_Tomcat_Maven
        *   StringBuffer getRequestURL(): 获取URL[统一资源定位符]:
        *   String getRequestURI(): 获取URI[统一资源标识符]: /B6_Tomcat_Maven/req1
        *   ✳String getQueryString(): 获取请求参数[GET方式的请求参数]: username=ganga&password=123
        *
        *   GET
        *   /B6_Tomcat_Maven_war
        *   http://localhost:8080/B6_Tomcat_Maven_war/req1
        *   /B6_Tomcat_Maven_war/req1
        *   username=ganga&password=123
        *
        * */
        // String getMethod(): 获取请方式: GET
        String method = request.getMethod();
        System.out.println(method);

        // String getContextPath(): 获取虚拟目录[项目访问路径]: /B6_Tomcat_Maven
        String path = request.getContextPath();
        System.out.println(path);

        // StringBuffer getRequestURL(): 获取URL[统一资源定位符]:
        StringBuffer url = request.getRequestURL();
        System.out.println(url.toString());

        // String getRequestURI(): 获取URI[统一资源标识符]: /B6_Tomcat_Maven/req1
        String uri = request.getRequestURI();
        System.out.println(uri);

        // String getQueryString(): 获取请求参数[GET方式的请求参数]: username=ganga&password=123
        String query = request.getQueryString();
        System.out.println(query);

        System.out.println("===============================================================");

        /*
        * 获取请求头
        * String getHeader(): 根据请求头名称, 获取值
        * */

        String header = request.getHeader("user-agent");
        System.out.println(header);
        //Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36 Edg/98.0.1108.62

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        * 请求体 [GET方式没有请求体 post有请求体]
        *
        *   ServletInputStream getInputStream(): 获取字节输入流
        *           一般用于上传文件
        *   BufferedRead getReader(): 获取字符输入流
        *           一般用于获取请求体(请求参数)
        *
        *   不需要释放资源,request对象会销毁时,流会自动释放资源
        *
        * */

        BufferedReader re = request.getReader();
        String getParameter = re.readLine();
        System.out.println("post... " + getParameter);

    }
}
