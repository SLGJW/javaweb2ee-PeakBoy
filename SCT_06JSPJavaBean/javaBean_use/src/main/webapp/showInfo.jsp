<%--
  Created by IntelliJ IDEA.
  User: 13609
  Date: 2020/5/15
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息展示</title>
</head>
<body>
<jsp:useBean id="user" class="com.danger.domain.User" scope="page">
    <jsp:setProperty name="user" property="username"/>
    <jsp:setProperty name="user" property="userdesc"/>
</jsp:useBean>
<h1>信息展示页面</h1>
用户名：<h3>
    <jsp:getProperty name="user" property="username"/>
</h3>
介绍：<h3>
    <jsp:getProperty name="user" property="userdesc"/>
</h3>

</body>
</html>
