
<%@page import="Model.Autor"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Autor</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center">Registrar Autor</h1>

	<table border="2" align="center">
		<form action="AutorController" method="post">
			<tr>
				<td>Nombre de Autor</td>
				<td><input type="text" name="nomautor"></td>
			</tr>
			
			<tr>
				<td>Descripcion</td>
				<td><input type="text" name="descrip"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit"
					class="btn btn-primary" value="Registrar Autor"></td>
			</tr>
		</form>
	</table>
</body>