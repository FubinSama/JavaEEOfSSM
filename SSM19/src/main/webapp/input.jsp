<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>input</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/select" method="post">
        输入用户名：<input type="text" name="uname" />
        <input type="submit" value="提交" />
    </form>
</body>
</html>
