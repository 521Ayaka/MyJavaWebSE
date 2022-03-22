<%--
  Created by IntelliJ IDEA.
  User: Saber
  Date: 2022/3/21
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>商品数据</title>
</head>

<body style="background: bisque">

<br>
<center>
    <input type="button" value="新增" align="center" id="addBrand"><br>
</center>

<hr>
<table border="1" cellspacing="0" width="800" align="center">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${brands}" var="brand" varStatus="uid">
        <tr align="center">
            <td>${uid.count}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status == 1}">
                <td>开启</td>
            </c:if>
            <c:if test="${brand.status != 1}">
                <td>关闭</td>
            </c:if>
            <td><a href="/B10_MVC_Servlet_JSP_war/getId?id=${brand.id}">修改</a>
                <a href="/B10_MVC_Servlet_JSP_war/delete?id=${brand.id}">删除</a>
            </td>
        </tr>
    </c:forEach>


</table>

<script>
    document.getElementById("addBrand").onclick = function(){
        location.href = "/B10_MVC_Servlet_JSP_war/addBrand.jsp";
    }
</script>

</body >
</html>
