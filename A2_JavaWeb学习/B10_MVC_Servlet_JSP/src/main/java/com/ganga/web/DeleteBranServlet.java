package com.ganga.web;

import com.ganga.service.BranService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteBranServlet extends HttpServlet {

    private BranService branService = new BranService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取用户删除商品的id
        int id = Integer.parseInt(request.getParameter("id"));
        //执行语句
        branService.deleteById(id);
        //转发页面
        request.getRequestDispatcher("/bran").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
