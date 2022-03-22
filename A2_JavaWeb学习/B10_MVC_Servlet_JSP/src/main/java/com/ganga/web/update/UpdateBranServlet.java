package com.ganga.web.update;

import com.ganga.pojo.Bran;
import com.ganga.service.BranService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/update")
public class UpdateBranServlet extends HttpServlet {

    private BranService branService = new BranService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //要用到post流提交数据 就先设置流的编码
        request.setCharacterEncoding("UTF-8");
        //获取页面数据
        String id = request.getParameter("id");
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        //封装数据
        Bran bran = new Bran();
        bran.setId(Integer.parseInt(id));
        bran.setBrandName(brandName);
        bran.setCompanyName(companyName);
        bran.setOrdered(Integer.parseInt(ordered));
        bran.setDescription(description);
        bran.setStatus(Integer.parseInt(status));
        //修改数据
        branService.update(bran);

        //转发到初始页面
        request.getRequestDispatcher("/bran").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
