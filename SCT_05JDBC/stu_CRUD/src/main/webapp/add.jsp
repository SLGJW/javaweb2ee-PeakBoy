<%--
  Created by IntelliJ IDEA.
  User: 13609
  Date: 2020/5/9
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addServlet">
    姓名：<input type="text" name="username">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
<div>${message}</div>
</body>
</html>
