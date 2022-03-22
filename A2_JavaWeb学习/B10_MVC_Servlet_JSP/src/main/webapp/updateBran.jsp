<%--
  Created by IntelliJ IDEA.
  User: Saber
  Date: 2022/3/22
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>修改商品数据</title>
</head>

<body style="background: bisque">

<br><br><br><br><br>
<h3 align="center">修改品牌信息</h3>
<br>
<div align="center">

    <form action="/B10_MVC_Servlet_JSP_war/update" method="post" style="align-content: center">

        <%--使用隐藏域 提交id--%>
        <input type="hidden" name="id" value="${bran.id}">

        品牌名称：<input name="brandName" value="${bran.brandName}"><br>
        企业名称：<input name="companyName" value="${bran.companyName}"><br>
        商品排序：<input name="ordered" value="${bran.ordered}"><br>
        描述信息：<textarea rows="5" cols="20" name="description">${bran.description}</textarea><br>
        状态：
        <c:if test="${bran.status == 0}">
            <input type="radio" name="status" value="0" checked>禁用
            <input type="radio" name="status" value="1">启用<br>
        </c:if>
        <c:if test="${bran.status == 1}">
            <input type="radio" name="status" value="0">禁用
            <input type="radio" name="status" value="1" checked>启用<br>
        </c:if>

        <input type="submit" value="提交">
    </form>

</div>

</body>
</html>
