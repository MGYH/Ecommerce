<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Ecommerce/Product_addProduct.action">
		<table>
			<tr>
				<td>id</td>
				<td>名字</td>
				<td>成本</td>
				<td>价格</td>
			</tr>

			<tr>
				<td><input type="text" name="id" /></td>
				<td><input type="text" name="name" /></td>
				<td><input type="text" name="cost" /></td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>