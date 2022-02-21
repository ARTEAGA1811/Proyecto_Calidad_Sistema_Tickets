package controlador;

import modelo.dao.TicketDAO;
import modelo.entidad.Empleado;
import modelo.entidad.Ticket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "ListarTicketsController", value = "/ListarTicketsController")
public class ListarTicketsController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet ListarTicketsController iniciado");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet ListarTicketsController GET");
        request.getRequestDispatcher("/jsp/moduloEmpleado/listaTickets.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet ListarTicketsController POST");

        Empleado miEmpleado = (Empleado) request.getSession().getAttribute("miEmpleado");
        TicketDAO ticketdao = new TicketDAO();
        List<Ticket> misTickets = ticketdao.obtenerTodosTickets(miEmpleado.getIdEmpleado());
        for (Ticket t : misTickets) {
            System.out.println(t);
        }

        request.setAttribute("misTickets", misTickets);
        request.setAttribute("nombreEmpleado", miEmpleado.getNombre().toUpperCase());

        doGet(request, response);

    }
}
