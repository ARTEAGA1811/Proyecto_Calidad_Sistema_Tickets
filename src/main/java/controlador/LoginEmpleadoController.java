package controlador;

import modelo.dao.EmpleadoDAO;
import modelo.entidad.Empleado;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Locale;

@WebServlet(name = "LoginEmpleadoController", value = "/LoginEmpleadoController")
public class LoginEmpleadoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp/moduloEmpleado/loginEmpleado.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreUsuario = request.getParameter("nombreUsuario");
        String clave = request.getParameter("clave");
        EmpleadoDAO empleadodao = new EmpleadoDAO();
        Empleado miEmpleado = empleadodao.autenticar(nombreUsuario, clave);

        if (miEmpleado != null) {
            HttpSession miSesion = request.getSession();
            miSesion.setAttribute("miEmpleado", miEmpleado);
            request.setAttribute("nombreEmpleado", miEmpleado.getNombre().toUpperCase());

            //getServletContext().getRequestDispatcher("/jsp/moduloEmpleado/listaTickets.jsp").forward(request, response);
            request.getRequestDispatcher("ListarTicketsController").forward(request, response);
        }else{
            System.out.println("No se encontro el empleado");
            getServletContext().getRequestDispatcher("/jsp/moduloEmpleado/loginEmpleado.jsp").forward(request, response);
        }

    }
}
