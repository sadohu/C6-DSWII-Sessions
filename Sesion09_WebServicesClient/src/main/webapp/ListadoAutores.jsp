<%@page import="Model.Autor"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de autores</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center">Consumiendo WEB SERVICE REST con Base de Datos</h1>
	<h2 align="center">Listado de autores</h2>
	<a href="AutorController?action=create">Registrar nuevo Autor</a>
	<table>
		<tr>
			<th>Codigo</th>
			<th>Nombre del Autor</th>
			<th>Descripcion</th>
			<th colspan="2">Acciones</th>
		</tr>

		<%
		
		List<Autor> autors = (List<Autor>) request.getAttribute("list");
		if(autors != null){
			for(Autor item : autors){
		%>

		<tr>
			<td><%=item.getIdautor()%></td>
			<td><%=item.getNomautor()%></td>
			<td><%=item.getDescrip()%></td>
			<td>Eliminar</td>
			<td>Actualizar</td>
		</tr>

		<%	
			}	
		}
		%>
	</table>
</body>