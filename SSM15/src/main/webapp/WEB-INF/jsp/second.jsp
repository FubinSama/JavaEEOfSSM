<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/9
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<% request.setAttribute("path", request.getContextPath());  %>
<html>
<head>
    <title>second</title>
</head>
<body>
    <spring:message code="second" /> <br/><br/>
    <a href="${path}/my/third">
        <spring:message code="third" arguments="888,999" />
    </a>
</body>
</html>
