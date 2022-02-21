<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 16-feb.-22
  Time: 8:04 p. m.
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

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;700;800&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginEmpleado.css">
</head>
<body>
<div class="login">
    <header class="header">
        <h1 class="titulo">Sistema de Tickets</h1>
        <nav class="sub-header">
            <h2>Módulo: Empleados</h2>
        </nav>
    </header>
    <main class="container">
        <figure class="container_img">
            <img src="${pageContext.request.contextPath}/assets/ticket2.png" alt="ticket" class="ticket-img">
        </figure>
        <section class="form_container">
            <h2>Login</h2>
            <form method="POST" action="LoginEmpleadoController" class="formulario">
                <label for="txtNombreUsuario">Nombre de Usuario</label>
                <input type="text" name="nombreUsuario" id="txtNombreUsuario" class="input">

                <label for="txtContrasena">Contraseña</label>
                <input type="password" name="clave" id="txtContrasena" class="input">
                <div class="contenedor-recordarme">
                    <input type="checkbox">
                    <label>Recordarme</label>
                </div>
                <input type="submit" value="Ingresar" class="btn-enviar">
            </form>
        </section>
    </main>
</div>
</body>
</html>