<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/public/head.jspf" %>
</head>
<frameset border="5" rows="15%,*">
    <frame src="send_main_top.action">
    <frameset border="5" cols="20%,*" >
        <frame src="send_main_left.action">
        <frame src="send_main_right.action">
    </frameset>
</frameset>
</html>
