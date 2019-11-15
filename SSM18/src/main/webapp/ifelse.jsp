<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>ifelse</title>
</head>
<body>
    <c:set value="if" var="firstNumber" scope="request" />
    <c:set value="else" var="secondNumber" scope="request" />
    <c:if test="${firstNumber>secondNumber}">
        最大值为${firstNumber}
    </c:if>
    <c:if test="${firstNumber<secondNumber}">
        最大值为${secondNumber}
    </c:if>
<c:choose>
    <c:when test="${firstNumber < secondNumber}">
        最小值为${firstNumber}
    </c:when>
    <c:otherwise>
        最小值为${secondNumber}
    </c:otherwise>
</c:choose>
</body>
</html>
