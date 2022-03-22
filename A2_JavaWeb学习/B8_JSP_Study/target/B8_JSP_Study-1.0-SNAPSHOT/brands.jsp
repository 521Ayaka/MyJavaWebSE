<%@ page import="com.ganga.util.MyBatisUtils" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.ganga.mapper.BrandsMapper" %>
<%@ page import="com.ganga.pojo.Brands" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Saber
  Date: 2022/3/20
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>

<%
    //从数据库中 获取brands
    SqlSessionFactory sqlSessionFactory = MyBatisUtils.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    BrandsMapper BrandsMapper = sqlSession.getMapper(BrandsMapper.class);
    //返回查询对象
    List<Brands> brands = BrandsMapper.selectAll();
    //释放资源
    sqlSession.close();
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息</title>
</head>
<body>

<input type="button" value="新增" align="center"><br>
<hr>
<table border="1" cellspacing="0" width="800" align="center" >
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

    <%--插入java代码--%>
    <%
        for (int i = 0; i < brands.size(); i++) {
            Brands brand = brands.get(i);
    %><%--断开java--%>
    <%--接上html--%>
    <tr align="center">
        <td><%= brand.getId() %></td>
        <td><%= brand.getBrandName()%></td>
        <td><%= brand.getCompanyName()%></td>
        <td><%= brand.getOrdered() %></td>
        <td><%= brand.getDescription()%></td>
        <td><%= brand.getStatus() == 1 ? "启动":"关闭"%></td>
        <td><a href="#">修改</a> <a href="#">删除</a></td>
    </tr>
    <%--断开html--%>
    <%--接上java--%>
    <%
        }
    %>


</table>

</body>
</html>
