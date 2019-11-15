<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<% request.setAttribute("path", request.getContextPath()); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>index</title>
</head>
<body>
    <h1>所有的演示例子</h1>
    <h3>
        <a href="${path}/daodb">处理dao中数据库异常</a>
    </h3>
    <h3>
        <a href="${path}/daomy">处理dao中自定义异常</a>
    </h3>
    <h3>
        <a href="${path}/daono">处理dao中未知错误</a>
    </h3>
    <h3>
        <a href="${path}/servicedb">处理service中数据库异常</a>
    </h3>
    <h3>
        <a href="${path}/servicemy">处理service中自定义异常</a>
    </h3>
    <h3>
        <a href="${path}/serviceno">处理service中未知错误</a>
    </h3>
    <h3>
        <a href="${path}/db">处理controller中数据库异常</a>
    </h3>
    <h3>
        <a href="${path}/my">处理controller中自定义异常</a>
    </h3>
    <h3>
        <a href="${path}/no">处理controller中未知错误</a>
    </h3>
    <!--在web.xml中配置404-->
    <h3>
        <a href="${path}/404">404错误</a>
    </h3>
</body>
</html>