<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form:form action="Nuevo" method="post" modelAttribute="empleado">
		<form:label path="nombre">Nombre: </form:label>
		<form:input path="nombre" />
		<br>

		<form:label path="apellido">Apellido: </form:label>
		<form:input path="apellido" />
		<br>

		<form:label path="dni">Dni: </form:label>
		<form:input path="dni" />
		<br>
	
		<input type="submit" value="Guardar" />
	</form:form>
</body>
</html>