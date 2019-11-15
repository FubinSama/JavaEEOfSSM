<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/13
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>error</title>
</head>
<body>
    <h1>未知错误：</h1><%= exception %>
    <h2>错误内容：</h2>
    <%
        exception.printStackTrace(response.getWriter());
    %>
</body>
</html>
