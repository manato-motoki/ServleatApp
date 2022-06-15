<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>ログイン</h3>
	<form action="/Company_search/UserServlet" method="post">
		ログインID&nbsp;:<input type ="text" name ="id"><br><br>
		パスワード :<input type ="text" name = "pass"><br><br>
		<input type="submit" value="ログイン">
		<a href="/Login/RegisterUser">ユーザー登録</a>
	</form>
</body>
</html>