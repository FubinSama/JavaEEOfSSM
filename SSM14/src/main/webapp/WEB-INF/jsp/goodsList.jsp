<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/8
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>goodsList</title>
</head>
<body>
    <table>
        <tr>
            <td>商品名</td>
            <td>商品详情</td>
            <td>商品价格</td>
            <td>创建日期</td>
        </tr>
        <c:forEach items="${goodsList}" var="goods">
            <tr>
                <td>${goods.name}</td>
                <td>${goods.description}</td>
                <td>${goods.price}</td>
                <td>${goods.date}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
