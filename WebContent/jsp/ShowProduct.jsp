<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>名字</td>
			<td>成本</td>
			<td>价格</td>
		</tr>
		<s:iterator value="list" var="p" status="st">
			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${p.cost}</td>
				<td>${p.price}</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>