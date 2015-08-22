<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2015/8/21
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf"%>
</head>
<body>
<a href="update.action?category.type=4567&category.id=1&category.hot=2">更新</a>
<a href="delete.action?category.id=1">删除</a>
<a href="query.action">查询所有账户</a>
<a href="mainIndex.action">跳转框架</a>
<a href="send_main_mainIndex.action">直接访问后台DIV</a>
<a href="send_main_index.action">直接访问后台EasyUI</a>
<br/>
<c:forEach items="${requestScope.accountList}" var="account">
    ${account.id}|${account.login}|${account.name}|${account.pass}<br/>
</c:forEach>
<hr/>
<c:forEach items="${sessionScope.accountList}" var="account">
    ${account.id}|${account.login}|${account.name}|${account.pass}<br/>
</c:forEach>
<hr/>
<c:forEach items="${applicationScope.accountList}" var="account">
    ${account.id}|${account.login}|${account.name}|${account.pass}<br/>
</c:forEach>
</body>
</html>
