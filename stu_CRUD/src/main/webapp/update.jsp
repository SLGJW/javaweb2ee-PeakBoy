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
    <title>修改学生信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateServlet">
    <input type="hidden" name="id" value="${param.id}">
    姓名：<input type="text" name="username" value="${param.username}">
    年龄：<input type="text" name="age" value="${param.age}">
    <input type="submit" value="提交">
</form>
<div>${message}</div>
</body>
</html>
