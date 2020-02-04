<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="com.uniovi.sdi.* , java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>JSP</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<jsp:useBean id="contador" class="com.uniovi.sdi.Contador" />
	<jsp:setProperty name="contador" property="incremento" value="1" />


	<!--  Barra de Navegación superior  -->
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<ul class="nav navbar-nav">

			<li><a href="agregarComentario.jsp">Añadir comentario</a></li>

		</ul>
		<div class="nav navbar-right">
			<jsp:getProperty name="contador" property="total" />
			Visitas
		</div>
	</div>
	</nav>

	<!-- Contenido -->
	<div class="container" id="contenedor-principal">
		<h2>Comentarios</h2>
		<div class="row ">

			<jsp:useBean id="comentariosService"
				class="com.uniovi.sdi.blog.ComentariosService" />
			<c:forEach var="comentario" begin="0"
				items="${comentariosService.comentarios}">
				<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
					<div>
						<li><c:out value="${comentario.nombre}" /></li>
						<div>
							<c:out value="${comentario.mensaje}" />
						</div>
					</div><br/>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>