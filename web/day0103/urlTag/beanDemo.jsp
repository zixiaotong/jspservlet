<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>姓名：${emp.name}</li>
		<li>Email：${emp.email}</li>
		<li>电话：${emp.phone}</li>
		<li>地址：
			<ul>
				<li>城市：${requestScope.emp.address.city}</li>
				<li>街道：${emp.address.street}</li>
				<li>邮编：${emp.address.zipCode}</li>
			</ul>
		</li>
	</ul>
</body>
</html>