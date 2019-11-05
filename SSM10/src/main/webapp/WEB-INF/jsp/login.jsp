<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/5
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post" name="loginForm">
    <table border="1" bgcolor="#add8e6" align="center">
        <tr>
            <td>姓名：</td>
            <td>
                <input class="textSize" type="text" name="uname" />
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input class="textSize" type="password" name="upass" maxlength="20" />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="登录" onclick="javascript:submit()" />
            </td>
        </tr>
    </table>
    ${messageError}
</form>
</body>
</html>
