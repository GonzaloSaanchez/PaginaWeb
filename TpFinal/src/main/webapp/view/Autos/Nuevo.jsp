<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Autos</title>
</head>

<body>
	<form:form action="Nuevo" method="post" modelAttribute="auto">
		<form:label path="patente">Patente: </form:label>
		<form:input path="patente" />
		<br>

		<form:label path="marca">Marca: </form:label>
		<form:input path="marca" />
		<br>

		<form:label path="modelo">Modelo: </form:label>
		<form:input path="modelo" />
		<br>
		
				<tr>
					<th>Propietario: </th>
				</tr>
			<form:select path="propietario.dni">
			<c:forEach items="${listaPropietarios}" var="prop">
				<form:option value="${prop.dni}">
					<c:out value="${prop-nombre}"></c:out>
				</form:option>
			</c:forEach>
		</form:select>
		<br>	
		<br>
	
		<input type="submit" value="Guardar" />
	</form:form>
</body>
</html>