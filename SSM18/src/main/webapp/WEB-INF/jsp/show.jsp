<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>show</title>
</head>
<body>
    从Controller转发过来的request内置对象的数据如下：<br/>
    ${requestScope.name[0]}<br/>
    ${requestScope.name[1]}<br/>
    ${requestScope.name[2]}<br/>
    ${requestScope.name[3]}<br/>
    <hr/>
    从Controller转发过来的Model对象的数据如下：<br/>
    ${address[0]}<br/>
    ${address[1]}<br/>
    ${address[2]}<br/>
</body>
</html>
