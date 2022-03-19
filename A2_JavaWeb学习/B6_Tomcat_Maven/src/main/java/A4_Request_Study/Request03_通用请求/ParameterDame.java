package A4_Request_Study.Request03_通用请求;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/*
* Request 通用方式获取请求参数
*
*   Map<String,String[]> getParameterMap(): 获取所有参数Map集合
*   String[] getParameterValues(String name): 根据名称获取参数值[数组]
*   String getParameter(): 根据名称获取参数值(单个)
*
* */

@WebServlet("/ganga")
public class ParameterDame extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //get请求逻辑方法
        System.out.println("get...");

        //打印所有参数的Map集合
        //Map<String,String[]> getParameterMap(): 获取所有参数Map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            //以 username:ganga 的格式进行输出
            System.out.print(key + ":");
            //值 的 泛型 是String[] 是一个数组的泛型！！！
            String[]/*用数组*/ values = map.get(key);
            for (String value :values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        //根据名称获取一个键对应的多个值的参数
        //String[] getParameterValues(String name): 根据名称获取参数值[数组]
        String[] hobby = req.getParameterValues("hobby");
        for (String ho :hobby) {
            System.out.println(ho);
        }

        //根据名称获取单个键值对参数
        //String getParameter(): 根据名称获取参数值(单个)
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);
        System.out.println("====================");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //post请求逻辑方法
        System.out.println("post...");

        //打印所有参数的Map集合
        //Map<String,String[]> getParameterMap(): 获取所有参数Map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            //以 username:ganga 的格式进行输出
            System.out.print(key + ":");
            String[] values = map.get(key);
            for (String value :values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        //根据名称获取一个键对应的多个值的参数
        //String[] getParameterValues(String name): 根据名称获取参数值[数组]
        String[] hobby = req.getParameterValues("hobby");
        for (String ho :hobby) {
            System.out.println(ho);
        }

        //根据名称获取单个键值对参数
        //String getParameter(): 根据名称获取参数值(单个)
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        System.out.println("====================");

    }
}
