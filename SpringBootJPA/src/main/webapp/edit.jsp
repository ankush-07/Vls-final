<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h1 align="center">Edit Data</h1>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<table border="1" align="center">
<input type="hidden" name="sid" value="${data.sid}">
<tr>
<td>name</td>
<td><input type="text" name="name" value="${data.name}" ></td>
</tr>

<tr>
<td>address</td>
<td><input type="text" name="addr" value="${data.addr}"></td>
</tr>

<tr>
<td>mobile No</td>
<td><input type="text" name="mobino" value="${data.mobino}"></td>
</tr>

<tr>
<td>Username</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="pass" value="${data.pass}"></td>
</tr>

<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>

</form>

</body>
</html>