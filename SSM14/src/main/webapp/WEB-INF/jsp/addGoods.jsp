<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/8
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>addGoods</title>
</head>
<body>
    <form:form modelAttribute="goods" action="${pageContext.request.contextPath}/goods2/save" method="post">
        <fieldset>
            <legend>添加一件商品</legend>
            <p>
                <label>商品名：</label>
                <form:input path="name" />
            </p>
            <p>
                <label>商品详情：</label>
                <form:input path="description" />
            </p>
            <p>
                <label>商品价格：</label>
                <form:input path="price" />
            </p>
            <p id="buttons">
                <input id="reset" type="reset" />
                <input id="submit" type="submit" value="添加" />
            </p>
        </fieldset>
        <!--取出所有验证错误-->
        <form:errors path="*" />
    </form:form>
</body>
</html>
