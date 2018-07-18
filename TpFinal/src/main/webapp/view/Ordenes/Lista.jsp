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
			<h1>Lista de Ordenes</h1>
		</div>
		<div>
			<a class="btn btn-default" href="Nuevo" role="button">Nueva Orden</a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nª</th>
					<th>Fecha</th>
					<th>Estado</th>
					<th>Falla</th>
					<th>Cantidad horas</th>
					<th>Cantidad repuestos</th>
					<th>Precio final</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listaOrdenes}">
					<c:forEach items="${listaOrdenes}" var="ord">
						<tr>
							<td><c:out value="${ord.id}"></c:out></td>
							<td><c:out value="${ord.fechaingreso}"></c:out></td>
							<td><c:out value="${ord.estado}"></c:out></td>
							<td><c:out value="${ord.falla}"></c:out></td>
							<td><c:out value="${ord.cantidadHoras}"></c:out></td>
							<td><c:out value="${ord.precioFinal}"></c:out></td>
						</tr>

					</c:forEach>
				</c:if>
				<c:if test="${empty listaOrdenes}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>

			</tbody>
		</table>

	</div>

</body>
</html>