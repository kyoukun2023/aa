<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" media="screen" href="./resouce/css/main.css"/>
<title>signup</title>
</head>
<body>
	 <h1>新規登録</h1>
    <form method="POST" action="/卒業制作/SignupServlet">
        <div>
        <table class="form-table">
            <tr>
                <td>教員名</td>
                <td><input size="40" type="text" name="教員名"  class="hoge"/></td>

                <td>ID</td>
               <td> <input size="10" type="text" name="ID" /></td>
            </tr>

            <tr>
                <td>パスワード</td>
                <td><input size="10" type="password" name="パスワード" /></td>

                <td>確認用パスワード</td>
                <td><input size="10" type="kakupass" name="確認用パスワード" /></td>
            </tr>
        </table>
        <p id="error"> が入力されていません</p>
        <div align="right"><input id="touroku" type="submit" value="新規登録" style="width:100px;height:40px"/></div>
    </div>
    </form>
</body>
</html>