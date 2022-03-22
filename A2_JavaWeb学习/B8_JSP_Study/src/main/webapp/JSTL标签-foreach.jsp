<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>JSTL标签-foreach</title>
</head>
<body>

<input type="button" value="新增" align="center"><br>
<hr>
<table border="1" cellspacing="0" width="800" align="center">
    <tr align="center">
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${brands}" var="brand" varStatus="序号">

        <tr align="center">
            <%--<td>${brand.id}</td>--%> <%-- varStatus="" 遍历数 解决:id主键不一定是连续的 --%>
            <td>${序号.index}&nbsp;|<%--从0开始的异世界--%>
                ${序号.count} <%--从1开始的生活--%>
            </td>
            <td>${序号.count}</td>
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
            <td><a href="#">修改</a> <a href="#">删除</a></td>
        </tr>

    </c:forEach>


</table>


</body>
</html>
