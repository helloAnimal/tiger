<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2015/8/21
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<body>
<a href="update.action?category.type=4567&category.id=1&category.hot=2">更新</a>
<a href="delete.action?category.id=1">删除</a>
<a href="query.action">查询所有账户</a>
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
