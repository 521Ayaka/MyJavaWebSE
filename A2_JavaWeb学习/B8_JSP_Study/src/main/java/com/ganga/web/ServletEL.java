package com.ganga.web;

import com.ganga.mapper.BrandsMapper;
import com.ganga.pojo.Brands;
import com.ganga.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/el01")
public class ServletEL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //从数据库获取商品数据
        SqlSessionFactory sqlSessionFactory = MyBatisUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper brandsMapper = sqlSession.getMapper(BrandsMapper.class);
        List<Brands> brands = brandsMapper.selectAll();
        sqlSession.close();

        //将数据放入到 request域当中
        request.setAttribute("用户数据",brands);

        //转发到jsp文件中
        request.getRequestDispatcher("/EL表达式-dame01.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
