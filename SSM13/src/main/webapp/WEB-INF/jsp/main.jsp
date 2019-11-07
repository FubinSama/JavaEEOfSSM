<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/7
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>main</title>
</head>
<body>
    当前用户：${user.name} <br/>
    <a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>
