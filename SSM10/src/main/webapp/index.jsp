<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>My JSP 'index.jsp' starting page</title>
</head>
<body>
未注册的用户，请<a href="${ pageContext.request.contextPath }/index/register">注册</a>！<br />
已注册的用户，去<a href="${ pageContext.request.contextPath }/index/login">登录</a>！<br />
</body>
</html>