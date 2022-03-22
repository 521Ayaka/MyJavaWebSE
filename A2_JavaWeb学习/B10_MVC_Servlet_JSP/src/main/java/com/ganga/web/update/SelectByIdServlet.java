package com.ganga.web.update;

import com.ganga.pojo.Bran;
import com.ganga.service.BranService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/getId")
public class SelectByIdServlet extends HttpServlet {

    private BranService branService = new BranService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //第一次 获取用户获取数据参数
        int id = Integer.parseInt(request.getParameter("id"));

        //通过id获取商品对象
        Bran bran = branService.selectById(id);
        System.out.println(bran);

        //提供页面商品数据信息
        request.setAttribute("bran",bran);

        //转发页面
        request.getRequestDispatcher("/updateBran.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
