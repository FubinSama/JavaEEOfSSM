<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>showMulti</title>
</head>
<body>
    <table>
        <tr>
            <td>详情</td>
            <td>文件名</td>
        </tr>
        <c:forEach items="${multiFileDomain.description}" var="description" varStatus="loop">
            <tr>
                <td>${description}</td>
                <td>${multiFileDomain.myfile[loop.index]}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
