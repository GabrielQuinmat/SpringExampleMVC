<%@page import="mx.ipn.cic.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    	User user = (User) request.getAttribute("user");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detalle de Usuario</title>
</head>
<body>
<table style="border: 1px; border-color: black;">
		<thead>
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Edad</th>
			<tr>
		</thead>
		<tbody>
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.lastName}</td>
				<td>${user.age}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>