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
		String name = request.getParameter("username");
		byte[] bytes = name.getBytes("iso-8859-1");
		name = new String(bytes,"utf-8");
		out.print(name);
	%>
	<br>
	${param.username}<br>
	${param.password}<br>
</body>
</html>