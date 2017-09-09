<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo Usuario</title>
</head>
<body>
	<form action="/cic/user" method="post">
		Nombre: <input type="text" id="name" name="name" required placeholder="Juanito">
		<br />
		Apellido: <input type="text" id="lastName" name="lastName" required placeholder="Escarcha">
		<br />
		Edad: <input type="number" id="age" name="age" required>
		<br />
		<input type="submit" style="border: 4px;" >
	</form>
</body>
</html>