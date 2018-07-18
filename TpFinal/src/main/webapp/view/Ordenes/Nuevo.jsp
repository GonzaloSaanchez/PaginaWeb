<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ordenes</title>
</head>
<div>
			<a class="btn btn-default" href="../Propietarios/Nuevo" role="button">Nuevo Propietario</a>
		</div>
<body>
	<form:form action="Nuevo" method="post" modelAttribute="orden">
		<form:label path="falla">Falla: </form:label>
		<form:input path="falla" />
		<br>
		
		<form:label path="estado">Estado: </form:label>
		<form:input path="estado" />
		<br>
		<tr>
					<th>Dni Empleado: </th>
				</tr>
			<form:select path="empleado.dni">
			<c:forEach items="${listaEmpleados}" var="emp">
				<form:option value="${emp.dni}">
					<c:out value="${emp.nombre}"></c:out>
				</form:option>
			</c:forEach>
		</form:select>
		<br>	
		<tr>
			<th>Patente: </th>
				</tr>
			<form:select path="patenteAuto">
			<c:forEach items="${listaAutos}" var="aut">
				<form:option value="${aut.patente}">
					<c:out value="${aut.patente}"></c:out>
				</form:option>
			</c:forEach>
		</form:select>
		<br>	

		<form:label path="fechaingreso">Fecha Ingreso (A-M-D): </form:label>
		<form:input path="fechaingreso" />
		<br>
		<form:label path="cantidadHoras">Cantidad horas de trabajo: </form:label>
		<form:input path="cantidadHoras" />
		<br>
		<form:label path="precioFinal">Precio Final: </form:label>
		<form:input path="precioFinal" />
		<br>

				
	
	
	
		<input type="submit" value="Guardar" />
	</form:form>
</body>
</html>