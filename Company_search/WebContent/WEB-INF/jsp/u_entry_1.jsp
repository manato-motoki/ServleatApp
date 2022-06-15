<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>ユーザー登録画面</h3>
	<form action="/Login/RegisterUser" method="post">
		ログインID(必須) &emsp;:<input type="text" name="id" required><br>
		パスワード(必須) &nbsp;:<input type="text" name="pass" required><br>
		パスワード(確認) &emsp;:<input type="text" name="pass2" required><br>

		<br>
		<input type="submit" value="次へ">
	</form>
</body>
</html>