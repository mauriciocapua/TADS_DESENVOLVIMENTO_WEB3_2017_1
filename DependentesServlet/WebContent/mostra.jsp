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
	<i>Lista de Clientes:</i>
	<table style="width: 100%">
		<tr>
			<th>ID</th>
			<th>Nome</th>
		</tr>
		<c:forEach var="cliente" items="${vetCliente}">
			<tr>
				<td>${cliente.id}</td>
				<td>${cliente.nome}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="DeletarDependentes">
		<br> <br> <i>Lista de Dependentes:</i>
		<table style="width: 100%">
				<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Id Cliente</th>
		</tr>
			<c:forEach var="dependente" items="${vetDependente}">
				<tr>
					<td><input type=text name=id value="${dependente.id}"></td>
					<td><input type=text name=nome value="${dependente.nome}"></td>
					<td><input type=text name=idCliente value="${dependente.id_cliente}"></td>
					<td><input type=radio name=codigo value="${dependente.id}"></td>
				</tr>
			</c:forEach>
		</table>
	<input type="submit" name="escolha" value="Deletar" />
	<input type="submit" name="escolha" value="Alterar" />
	</form>
</body>
</html>