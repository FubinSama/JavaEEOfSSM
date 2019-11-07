<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/7
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>login</title>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="name" /> <br />
        密码：<input type="text" name="pwd" /> <br />
        <input type="submit" value="登录" />
    </form>
</body>
</html>
