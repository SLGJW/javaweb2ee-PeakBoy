<%--
  Created by IntelliJ IDEA.
  User: 13609
  Date: 2020/6/11
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理中心</title>
</head>
<body>
<h1>欢迎您, ${sessionScope.username}</h1>
<br>
<br>
<br>
<h2>操作选项</h2>
<br>
<br>
<a href="${pageContext.request.contextPath}/teacher/findAll.action">查看所有教师信息</a>
<c:if test="${teachers != null}">
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>科目</td>
            <td>状态</td>
            <td>注册日期</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${teachers}" var="t">
            <tr>
                <td>${t.id}</td>
                <td>${t.tname}</td>
                <td>${t.tsubject}</td>
                <td>${t.statusStr}</td>
                <td>${t.tdateStr}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/teacher/delete?id=${t.id}">移除该人员</a>
                    <a href="${pageContext.request.contextPath}/teacher/findOne?viewId=${t.id}">查看详情</a>
                    <a href="${pageContext.request.contextPath}/teacher/findOne?updateId=${t.id}">更新信息</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br>
<a href="${pageContext.request.contextPath}/student/findAll.action">查看所有学生信息</a>
<c:if test="${students != null}">
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>状态</td>
            <td>注册日期</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${students}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.sname}</td>
                <td>${s.statusStr}</td>
                <td>${s.sdateStr}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/student/delete?id=${s.id}">移除该人员</a>
                    <a href="${pageContext.request.contextPath}/student/findOne?viewId=${s.id}">查看详情</a>
                    <a href="${pageContext.request.contextPath}/student/findOne?updateId=${s.id}">更新信息</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br>
<a href="${pageContext.request.contextPath}/add.jsp">添加人员</a>
<br>
</body>
</html>
