package com.ganga.web;

import com.ganga.pojo.Bran;
import com.ganga.service.BranService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/bran")
public class BranServlet extends HttpServlet {

    //Service多次使用 扩大作用域 放到成员变量上
    BranService branService = new BranService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //从 业务逻辑层(service层) 获取商品数据
        List<Bran> brands = branService.selectAll();

        //将数据放入request域
        request.setAttribute("brands",brands);

        //转发到 /brands.jsp 中
        request.getRequestDispatcher("/brands.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
