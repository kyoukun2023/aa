<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./resource/css/main.css" />
<title>Insert title here</title>
</head>
<body>
	<h1>教員登録画面</h1>
		<h4>IDを入力してください</h4>
		<form action="/卒業制作/SenseiServlet" method="Post">
		<table>
		<tr>
			<td>　　　ＩＤ<input type="text" name="SenseID"></td>
		</tr>
		<tr>
			<td>教員名<input type="text" name="SenseName"></td>
			</tr>
		<tr>
			<td>
		<input type="radio" name="yakuwari" value="0" checked="checked" class="teachar">教員
		<input type="radio" name="yakuwari" value="1">AD
		<input type="radio" name="yakuwari" value="2">教員/AD
		<input type="radio" name="yakuwari" value="3">管理者

			</td>
		</tr>
		</table>
		<table>
			<c:forEach var="err" items="${errList}">
				<tr>
					<td>${err }</td>
				</tr>
			</c:forEach>

		</table>
	<input type="button" onclick="history.back()"  value="戻る">
	<input type="submit" value="登録">
	</form>
</body>
</html>