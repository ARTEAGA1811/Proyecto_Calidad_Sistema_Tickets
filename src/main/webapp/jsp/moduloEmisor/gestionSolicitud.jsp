<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 02-mar.-22
  Time: 5:07 p. m.
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
  <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>

  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/gestionSolicitud.css">
</head>
<body>
<div class="login">
  <header class="header">
    <h1 class="titulo">Sistema de Tickets</h1>
    <nav class="sub-header">
      <h2>Bienvenido/a ${nombreEmisor}</h2>
      <form method="POST" action="LogoutEmisorController">
        <input type="submit" value="Salir" class="boton">
      </form>
    </nav>
  </header>
  <main class="container">
    <section class="principal">
      <div class="principal_container">
        <form method="POST" action="SolicitarTicketController"  class="datos_container" >
          <h2 class="datos_container--titulo">Nueva solicitud</h2>
          <label>Título</label>
          <input type="text" name="titulo" class="dato">
          <label>Descripción</label>
          <textarea class="dato" placeholder="Agrega una descripción" name="descripcion" required></textarea>

          <input type="submit" value="Enviar" class="enviar">
        </form>

        <div class="historial_container">
          <h2>Mis Tickets</h2>
          <table class="tabla">
            <tr>
              <td class="tabla_titulo td">Título</td>
              <td class="tabla_titulo td titulo_acciones">Acciones</td>
            </tr>
            <c:forEach items="${tickets}" var="ticket">
              <tr>
                <td class="td">${ticket.titulo}</td>
                <td class="td acciones"><a href="" class="a_abrir">Abrir</a></td>
              </tr>
            </c:forEach>
          </table>


        </div>
      </div>
    </section>
  </main>
</div>
</body>
</html>