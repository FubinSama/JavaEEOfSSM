<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/15
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>multiFiles</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/multifile" method="post" enctype="multipart/form-data">
        选择文件1：<input type="file" name="myfile" /> <br/>
        文件描述1：<input type="text" name="description" /> <br/>
        选择文件2：<input type="file" name="myfile" /> <br/>
        文件描述2：<input type="text" name="description" /> <br/>
        选择文件3：<input type="file" name="myfile" /> <br/>
        文件描述3：<input type="text" name="description" /> <br/>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
