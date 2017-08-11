<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="MostrarDependentes">
		Cliente: <select name="idCliente">
			<c:forEach var="cliente" items="${vetCliente}">
				<option value="${cliente.id}">${cliente.nome}</option>
			</c:forEach>
		</select> <br> Nome do dependente: <input type="text" name="nome">
		<br> <input type="submit" value="Carregar" />
	</form>
</body>
</html>