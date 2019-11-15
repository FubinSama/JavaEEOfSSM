<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>showDownFiles</title>
</head>
<body>
    <table>
        <tr>
            <td>被下载的文件名</td>
        </tr>
        <c:forEach items="${files}" var="filename">
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/down?filename=${filename}">${filename}</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
