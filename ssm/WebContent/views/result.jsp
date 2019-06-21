<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<%
	//String a=requestScope.student.stuNo;
	
	%>
	${requestScope.student.stuNo }-
	<br>${requestScope.student.stuName }-<br>
	${requestScope.student.stuAge }-
</body>
</html>