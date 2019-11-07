<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>index</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript">
        function testJson() {
            console.log("执行testJson()");
            var name = $("#name").val();
            console.log(name);
            var pass = $("#password").val();
            console.log(pass);
            var age = $("#age").val();
            console.log(age);
            var data = JSON.stringify({
                name:name,
                password:pass,
                age:age
            });
            console.log(data);
            $.ajax({
                url: "${pageContext.request.contextPath}/testJson",
                type: "POST",
                contentType: "application/json",
                data: data,
                dataType: "json",
                success:function (data) {
                    if(data != null) {
                        alert("输入的用户名：" + data.name + "，密码：" + data.password + "，年龄：" + data.age);
                    }
                }
            });
        }
    </script>
</head>
<body>
    <form action="">
        用户名：<input type="text" name="name" id="name" />
        密码：<input type="password" name="password" id="password" />
        年龄：<input type="text" name="age" id="age" />
        <input type="button" value="测试" onclick="testJson()" />
    </form>
</body>
</html>