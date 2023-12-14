<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Operaciones Clientes</title>
</head>
<body>
	<form method="post" action="ControladorOperaciones">
		<label for="capacidadDisco">La suma en romanos es :</label> . <input
			type="text" id="numromano" name="x"> <input type="text"
			id="numromano" name="y"> <br> <input type="submit"
			value="Convertir a ROMANO">
	</form>

	<%
	String result = (String) request.getAttribute("resultado");
	String strResponse = "";
	
	if (result != null)
		strResponse = result;
	%>
	<h2 align="center">
		<%=strResponse %>	
	</h2>
</body>
</html>


