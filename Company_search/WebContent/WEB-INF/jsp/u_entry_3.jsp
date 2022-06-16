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
<title>Insert title here</title>
</head>
<body>
	<h3>登録結果</h3>
	<br>
	ログインID:<%= account.getId() %>で登録しました。<br><br>
	<a href="/Company_search/UserServlet">ログイン画面</a>
</body>
</html>