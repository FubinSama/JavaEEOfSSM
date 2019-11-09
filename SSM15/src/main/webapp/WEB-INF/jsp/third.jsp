<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/9
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<% request.setAttribute("path", request.getContextPath());  %>
<html>
<head>
    <title>third</title>
</head>
<body>
    <spring:message code="third" arguments="888,999" /><br/><br/>
    <a href="${path}/my/first">
        <spring:message code="first" />
    </a>
</body>
</html>
