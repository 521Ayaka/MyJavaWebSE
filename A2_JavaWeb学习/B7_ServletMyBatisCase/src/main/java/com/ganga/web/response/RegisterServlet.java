package com.ganga.web.response;

import com.ganga.mapper.UserMapper;
import com.ganga.pojo.User;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("request ... ...");

        //获取用户输入的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
        //获取Mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //创建字符流
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        //判断用户名是否已经存在
        User userName = userMapper.selectByUsername(username);
        if (userName == null){
            //用户名不重复 可以添加 添加用户
            int i = userMapper.selectAdd(username, password);
            if (i != 0 ){
                writer.write("<h1 align=\"center\">恭喜你！注册成功！</h1>");
                //提交事务
                sqlSession.commit();
            }else {
                writer.write("<h1 align=\"center\">注册失败！</h1>");
            }
        }else{
            //用户名重复 无法添加
            writer.write("<h1 align=\"center\">该用户名已被注册! 请重新输入！</h1>");
        }
        //释放资源
        sqlSession.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
