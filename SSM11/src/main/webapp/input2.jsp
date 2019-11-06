<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/6
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input2</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/my/formatter" method="post">
        商品名称：<input type="text" name="goodsName" /> <br />
        商品价格：<input type="text" name="goodsPrice" /> <br />
        商品数量：<input type="text" name="goodsNumber" /> <br />
        商品日期：<input type="text" name="goodsDate" />(yyyy-MM-dd)<br />
        <input type="submit" value="提交">
    </form>
</body>
</html>
