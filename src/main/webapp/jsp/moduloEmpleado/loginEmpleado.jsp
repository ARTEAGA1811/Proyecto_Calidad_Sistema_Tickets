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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginEmpleado.css">
</head>
<body>
<main class="login">
    <section class="contenedor__formulario">
        <img src="../ressources/ticket2.png" alt="ticket" class="ticket-img">
        <h1 class="titulo">Sistema de Tickets</h1>
        <form method="POST" action="LoginEmpleadoController" class="formulario">
            <label for="txtNombreUsuario">Nombre de Usuario</label>
            <input type="text" name="nombreUsuario" id="txtNombreUsuario" class="input">

            <label for="txtContrasena">Contraseña</label>
            <input type="password" name="clave" id="txtContrasena" class="input">
            <div class="contenedor-recordarme">
                <input type="checkbox">
                <label>Recordarme</label>
            </div>

            <input type="submit" value="Ingresar" class="ingresar">
        </form>

    </section>

</main>
</body>
</html>
