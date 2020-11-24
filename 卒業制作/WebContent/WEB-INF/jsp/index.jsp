<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./resource/css/main.css" />
<title>ログイン画面</title>
</head>

<body>
<div class="box" align="center">
    <h1>ログイン画面</h1>
    <form action="LoginServlet" method="post">
	<table>
	<tr>
	<td>
				<label>ログインID</label>
				<input size="20" type="text" name="loginID" /></td>
    </tr>
    <tr>
	<td>
				<label>パスワード</label>
				<input size="20" type="text" name="loginPass" /></td>
    </tr>
    <tr>
     <td align="center"><c:out value="${error}"/></td>
     </tr>
	</table>

	<input type="submit" name="login_btn" value="ログイン">
</form>
</div>
</body>

</html>

