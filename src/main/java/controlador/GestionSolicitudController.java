package controlador;

import modelo.entidad.Emisor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GestionSolicitudController", value = "/GestionSolicitudController")
public class GestionSolicitudController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GestionSolicitudController - doGet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GestionSolicitudController - doPost");

        //Se accede al emisor que inicio la sesion.
        Emisor miEmisor = (Emisor) request.getSession().getAttribute("miEmisor");

        //Se cargan los tickets de este emisor.


        //Se envian los datos a la vista.
        request.setAttribute("nombreEmisor", miEmisor.getNombre().toUpperCase());

        //Se muestra la vista.
        request.getRequestDispatcher("/jsp/moduloEmisor/gestionSolicitud.jsp").forward(request, response);

    }
}
