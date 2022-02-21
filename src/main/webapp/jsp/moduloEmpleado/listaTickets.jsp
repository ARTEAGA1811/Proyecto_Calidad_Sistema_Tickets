<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 16-feb.-22
  Time: 8:04 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;700;800&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/listaTickets.css">
</head>
<body>
<div class="login">
    <header class="header">
        <h1 class="titulo">Sistema de Tickets</h1>
        <nav class="sub-header">
            <h2>Bienvenido ${nombreEmpleado}</h2>
            <a href="LogoutEmpleadoController">Salir</a>
        </nav>
    </header>
    <main class="container">
        <section class="principal">
            <div class="encabezado">
                <h2>Tickets</h2>
                <p>Ordenar por</p>
                <select name="" id="">
                    <option value="">Todos</option>
                    <option value="">Abiertos</option>
                    <option value="">Cerrados</option>
                </select>
            </div>
            <table class="tabla">
                <tr>
                    <td class="tabla_titulo td">ID</td>
                    <td class="tabla_titulo td">Título</td>
                    <td class="tabla_titulo td">Fecha Creacion</td>
                    <td class="tabla_titulo td">Prioridad</td>
                    <td class="tabla_titulo td">Estado</td>
                    <td class="tabla_titulo td">Acciones</td>
                </tr>
                <c:forEach items="${misTickets}" var="tickets">
                    <tr>
                        <td class="td">${tickets.idTicket}</td>
                        <td class="td">${tickets.titulo}</td>
                        <td class="td">${tickets.fechaCreacion}</td>
                        <td class="td">${tickets.prioridad}</td>
                        <td class="td">${tickets.estado}</td>
                        <td class="td"><a href="">Resolver</a> <a href="">Cambiar Responsable</a></td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </main>
</div>
</body>
</html>
