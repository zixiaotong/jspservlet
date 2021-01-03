<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("pa_aaa", "page_aaa");
		pageContext.setAttribute("aaa", "page_aaa");
	%>
	
	<ul>
		<li>${pa_aaa}</li>
		<li>${re_aaa}</li>
		<li>${se_aaa}</li>
		<li>${ap_aaa}</li>
		<li>${aaa}</li>
		
		<li>${applicationScope.aaa}</li>
		<li>${sessionScope.aaa}</li>
		<li>${requestScope.aaa}</li>
		<li>${pageScope.aaa}</li>
	</ul>
</body>
</html>