package A4_Request_Study.Request01_继承体系;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
*   ServletRequest          java提供接口
*        ↓↓↓
*   HttpServletRequest      java提供接口
*        ↓↓↓
*   RequestFacade           Tomcat提供的实现类
*
* */

@WebServlet(urlPatterns = "/test02")
public class Request01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(req);
        //org.apache.catalina.connector.RequestFacade@7288f0af
        //

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO:
    }
}
