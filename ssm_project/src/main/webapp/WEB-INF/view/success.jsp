<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<!-- 引入bootstrap样式 -->
<link href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/static/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript" src="/static/js/jquery-1.8.3.min.js"></script>

<!-- 查詢請求 -->




<body>
<h2>Hello World!</h2>
<form action="index.action">
用戶：
<input type="text" name="username"/>
密碼：
<input type="text" name="password"/>

<input type="submit" value="Submit" />
</form>
按鈕
 <%-- ${user.userId}<br>
 ${user.userName}<br>
 ${user.userPassword}<br>
 ${user.userEmail}<br> --%>
</body>
</html>
