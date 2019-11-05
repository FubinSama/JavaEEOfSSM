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
    <title>register</title>
    <script>
        function isNotNull(x) {
            if (x != null && x != "") return true;
            else return false;
        }
        function allIsNull() {
            var uname = document.registerForm.uname.value;
            var upass = document.registerForm.upass.value;
            var reupass = document.registerForm.reupass.value;
            console.log(uname + ":" + upass + ":" + reupass);
            if (isNotNull(uname) && isNotNull(upass) && isNotNull(reupass) && upass == reupass) {
                console.log("准备注册！！！");
                document.registerForm.submit();
            }
        }
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/register" method="post" name="registerForm">
        <table border="1" bgcolor="#add8e6" align="center">
            <tr>
                <td>姓名：</td>
                <td>
                    <input class="textSize" type="text" name="uname" value="${uname}" />
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>
                    <input class="textSize" type="password" name="upass" maxlength="20" />
                </td>
            </tr>
            <tr>
                <td>确认密码：</td>
                <td>
                    <input class="textSize" type="password" name="reupass" maxlength="20" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="button" value="注册" onclick="allIsNull()" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
