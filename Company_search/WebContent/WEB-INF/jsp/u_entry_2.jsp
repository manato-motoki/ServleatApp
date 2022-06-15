<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "scopedata.Account" %>
<%
	Account account = (Account)session.getAttribute("LoginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録確認</title>
</head>
<body>
	<h3>登録確認</h3>
	<br>
	ログインID:<%= account.getId() %>で登録しますか？<br><br>
	<a href="/Login/RegisterUser?action=go">登録</a>
	<a href="/Login/RegisterUser">キャンセル</a>
</body>
</html>