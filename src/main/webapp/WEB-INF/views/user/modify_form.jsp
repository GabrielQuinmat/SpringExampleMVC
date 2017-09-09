<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Usuario</title>
</head>
<body>
	<form action="/user/${user.id}" method="post">
		Nombre: <input type="text" id="name" name="name" value="${user.name}" required>
		<br />
		Apellido: <input type="text" id="lastName" name="lastName" value="${user.lastname}" required>
		<br />
		Edad: <input type="text" id="age" name="age" value="${user.age}" required>
		
		<input type="submit" >
	</form>
</body>
</html>