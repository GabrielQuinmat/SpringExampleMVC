
<%@page import="mx.ipn.cic.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	List<User> users = (List<User>)request.getAttribute("users");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos los usuarios</title>
</head>
<body>
	
	<a href="/cic/user/newUserForm" >Nuevo Usuario</a>
	<br>
	
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
			<%
				for (User user: users){
			%>
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.lastName}</td>
				<td>${user.age}</td>
				<td><a href="/cic/user/${user.id}/modifyForm">Modificar</a></td>
				<td><a href="/cic/user/delete/${user.id}">Eliminar</a></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>