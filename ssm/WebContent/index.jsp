<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="controller/queryStuddentByNo/1"> 查询1号学生</a>
	<form action="controller/queryStuddentByNo">
		学生学号：
		<input type="text" name="stuno">
		<input type="submit" value="提交">


	</form>


	<form action="controller/queryAddStudent">
		姓名:
		<input type="text" name="stuName">
		<br>
		年纪:
		<input type="number" name="stuAge">
		<br>
		<input type="submit" value="提交">

	</form>

</body>
</html>