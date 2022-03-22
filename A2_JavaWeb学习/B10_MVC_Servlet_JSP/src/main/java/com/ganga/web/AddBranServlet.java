package com.ganga.web;

import com.ganga.pojo.Bran;
import com.ganga.service.BranService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addBran")
public class AddBranServlet extends HttpServlet {

    private BranService branService = new BranService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        POST请求添加数据 要用到字符流
         所以 先设置字符流编码
        */
        request.setCharacterEncoding("UTF-8");

        //获取用户输入的数据
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        //封装参数
        Bran branNew = new Bran();
        branNew.setBrandName(brandName);
        branNew.setCompanyName(companyName);
        branNew.setOrdered(Integer.parseInt(ordered));//转为int
        branNew.setDescription(description);
        branNew.setStatus(Integer.parseInt(status));//转为int

        //执行添加
        branService.add(branNew);

        //转发到 所有商品页面
        request.getRequestDispatcher("/bran").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
