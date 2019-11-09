<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/9
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<% request.setAttribute("path", request.getContextPath());  %>
<html>
<head>
    <title>first</title>
</head>
<body>
    <a href="${path}/i18nTest?locale=zh_CN">
        <spring:message code="language.cn" />
    </a> --
    <a href="${path}/i18nTest?locale=en_US">
        <spring:message code="language.en" />
    </a> <br/> <br/>
    <spring:message code="first" /> <br/> <br/>
    <a href="${path}/my/second">
        <spring:message code="second" />
    </a>
</body>
</html>
