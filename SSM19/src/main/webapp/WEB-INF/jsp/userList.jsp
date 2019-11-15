<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>userList</title>
</head>
<body>
    用户信息<br/>
    <c:forEach items="${userList}" var="user">
        ${user.uid}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.uname}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.usex}<br/>
    </c:forEach>
</body>
</html>
