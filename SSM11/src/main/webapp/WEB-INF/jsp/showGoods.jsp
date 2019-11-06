<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/6
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showGoods</title>
</head>
<body>
    您创建的商品信息如下：<br />
    <!--使用EL表达式取出model中goods的信息-->
    商品名称为：${goods.goodsName},
    商品价格为：${goods.goodsPrice},
    商品数量为：${goods.goodsNumber}
</body>
</html>
