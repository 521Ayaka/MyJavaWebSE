<%--
  Created by IntelliJ IDEA.
  User: Saber
  Date: 2022/3/21
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<head>
    <meta charset="UTF-8">
    <title>添加品牌</title>
</head>
<body style="background: bisque">

<br><br><br><br><br>
<h3 align="center">添加品牌</h3>
<br>
<div align="center">

    <form action="/B10_MVC_Servlet_JSP_war/addBran" method="post" style="align-content: center">
        品牌名称：<input name="brandName"><br>
        企业名称：<input name="companyName"><br>
        商品排序：<input name="ordered"><br>
        描述信息：<textarea rows="5" cols="20" name="description"></textarea><br>
        状态：
        <input type="radio" name="status" value="0">禁用
        <input type="radio" name="status" value="1">启用<br>

        <input type="submit" value="提交">
    </form>

</div>


</body>
</html>