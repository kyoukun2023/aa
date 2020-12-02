<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<table>
		<tr>
			<td>　　　ＩＤ<input type="text" name="ID"></td>
		</tr>
		<tr>
			<td>教員名<input type="text" name="sensei"></td>
			</tr>
		<tr>
			<td>
		<input type="radio" name="kyouin" value="1" checked="checked" class="teachar">教員
		<input type="radio" name="kyouin" value="2">AD
		<input type="radio" name="kyouin" value="3">教員/AD
		<input type="radio" name="kyouin" value="4">管理者
			</td>
		</tr>
		</table>
	<input type="button" onclick="history.back()"  value="戻る">
	<input type="button" value="登録">
</body>
</html>