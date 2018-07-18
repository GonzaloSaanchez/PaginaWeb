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
			<h1>Lista de Repuestos</h1>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Cantidad</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listaRepuestos}">
					<c:forEach items="${listaRepuestos}" var="rep">
						<tr>
							<td><c:out value="${rep.nombre}"></c:out></td>
							<td><c:out value="${rep.cantidad}"></c:out></td>
							<td><a href="Borrar/${rep.id}">Borrar</a></td>
						</tr>

					</c:forEach>
				</c:if>
				<c:if test="${empty listaRepuestos}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>

			</tbody>
		</table>

	</div>

</body>
</html>