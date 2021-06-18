<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>grades_result.jsp페이지</h1>
	<h2>
		<li>이름 : ${name }</li>
		<li>국어 : ${kor }</li>
		<li>영어 : ${eng }</li>
		<li>수학 : ${math }</li>
		<li>총점 : ${sum }</li>
		<li>평균 : ${avg }</li>
		<li>학점 : ${hak }</li>
	</h2>
</body>
</html>