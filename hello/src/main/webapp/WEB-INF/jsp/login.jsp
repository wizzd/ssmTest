<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="http://localhost:8000/success.html" method="post">
    用户名：
    <input type="text" name="name">
    <br>
    密 码：
    <input type="password" name="pass">
    <br>
    <input type="submit" value="登录" />
    <input type="reset" value="重置" />
</form>

</body>
</html>