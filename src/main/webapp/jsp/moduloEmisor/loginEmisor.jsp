<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 02-mar.-22
  Time: 4:00 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;700;800&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginEmisor.css">
</head>
<body>
<div class="container">
  <main class="body_container">
    <section class="login">
      <h1 class="titulo">Sistema de Tickets</h1>
      <div class="form_container">
        <h2>Solicitud de ticket</h2>
        <form method="POST" action="LoginEmisorController" class="formulario">
          <label for="txtNombreUsuario">Correo</label>
          <input type="text" name="nombreUsuario" id="txtNombreUsuario" class="input">

          <label for="txtContrasena">Contraseña</label>
          <input type="password" name="clave" id="txtContrasena" class="input">
          <div class="contenedor-recordarme">
            <input type="checkbox" id="check">
            <label for="check">Recordarme</label>
          </div>
          <p class="error_mensaje">${mensaje}</p>
          <input type="submit" value="Ingresar" class="btn-enviar">
        </form>
      </div>
    </section>
    <section class="img_container">
      <span class="img_ticket"></span>
    </section>
  </main>
  <footer class="cambio_modulo">
    <a href="LoginEmpleadoController">Acceder como empleado</a>
  </footer>
</div>
</body>