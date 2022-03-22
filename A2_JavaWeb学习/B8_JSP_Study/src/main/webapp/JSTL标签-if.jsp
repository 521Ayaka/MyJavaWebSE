<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- 第一步: 在pom.xml文件当中 导入jstl依赖桌标坐标 --%>

<%-- 第二步: 导入标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>JSTL标签-if</title>
</head>
<body>
    <h1 align="center">是否启用</h1>

    <%-- 第三步: 使用jstl标签 --%>

    <%-- 演示<if>标签: 代替java中的if --%>
    <c:if test="${数据 == 1}">
        <%--从域当中获取资源 进行逻辑判断--%>
        <h1 align="center"> 启动... </h1>
        <% System.out.println("启动..."); %>
    </c:if>
    <c:if test="${数据 != 1}">
        <%--从域当中获取资源 进行逻辑判断--%>
        <h1 align="center"> 关闭... </h1>
        <% System.out.println("关闭..."); %>
    </c:if>


<%-- 注意：

     在EL表达式当中进行逻辑判断
     <c:if test="${数据 != 1}">
     而不是
     <c:if test="${数据} != 1">

--%>

</body>
</html>
