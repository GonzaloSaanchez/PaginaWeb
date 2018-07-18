<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"/>

<style type="text/css">
body {
	margin-top: 70px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Lista de Autos</h1>
		</div>
		<div>
			<a class="btn btn-default" href="Nuevo" role="button">Nuevo
				Auto</a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Patente</th>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Propietario</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listaAutos}">
					<c:forEach items="${listaAutos}" var="aut">
						<tr>
							<td><c:out value="${aut.patente}"></c:out></td>
							<td><c:out value="${aut.marca}"></c:out></td>
							<td><c:out value="${aut.modelo}"></c:out></td>
							<td><c:out value="${aut.propietario.nombre}"></c:out></td>
							<td><a href="Update/${aut.patente}">Modificar</a></td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listaAutos}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>