<%--
  Created by IntelliJ IDEA.
  User: 13609
  Date: 2020/5/15
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>学生信息获取</title>
</head>
<body>

<form action="getInfoServlet" method="post">

    姓名：<input type="text" name="username">
    描述：<input type="text" name="userdesc">

    <input type="submit" value="提交">
</form>
</body>
</html>
