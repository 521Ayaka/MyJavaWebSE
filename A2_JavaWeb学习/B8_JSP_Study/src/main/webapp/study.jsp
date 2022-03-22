<%--
  Created by IntelliJ IDEA.
  User: Saber
  Date: 2022/3/19
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>

    <h1>Hello JSP</h1>
    <%
        System.out.println("第一种方式: 内容直接写在 _jspServlet()方法中");
    %>

    <%= "第二中方式: 作为out.print(); 的参数" %>

    <%!
        String str = "成员方法";
        public void method1(String string){
            System.out.println("调用:"+string);
            System.out.println("成员方法");
        }
    %>

    <%
        System.out.println(str);
        method1(str);
    %>

</body>
</html>
