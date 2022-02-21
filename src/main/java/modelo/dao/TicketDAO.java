package modelo.dao;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Ticket;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO {

    private String SQL_INSERT = "INSERT INTO ticket (fecha_creacion , titulo, estado, prioridad, descripcion, solucion, fecha_cierre, id_empleado, id_emisor) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)";
    private String SQL_SELECTALL = "SELECT * FROM ticket WHERE id_empleado = ?";
    private ResultSet rs = null;
    private PreparedStatement pstmt = null;


    public TicketDAO() {
    }

    public boolean crearTicket(Ticket ticket){
        try {
            pstmt = ConexionBDD.getConexion().prepareStatement(SQL_INSERT);
            pstmt.setString(1, ticket.getFechaCreacion());
            pstmt.setString(2, ticket.getTitulo());
            pstmt.setString(3, ticket.getEstado());
            pstmt.setString(4, ticket.getPrioridad());
            pstmt.setString(5, ticket.getDescripcion());
            pstmt.setString(6, ticket.getSolucion());
            pstmt.setString(7, ticket.getFechaCierre());
            pstmt.setInt(8, ticket.getEmpleadoEncargado().getIdEmpleado());
            pstmt.setInt(9, ticket.getEmisor().getIdEmisor());

            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al crear el ticket");
            e.printStackTrace();
        }
        return false;
    }

    public boolean actualizarTicket(){
        return true;
    }

    public Ticket obtenerTicket(){
        return null;
    }

    public List<Ticket> obtenerTodosTickets(int idEmpleado){
        List<Ticket> listaTickets = new ArrayList<>();
        try {
            pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECTALL);
            pstmt.setInt(1, idEmpleado);
            rs = pstmt.executeQuery();
            while (rs.next()){
                Ticket ticket = new Ticket();
                ticket.setIdTicket(rs.getInt("id_ticket"));
                ticket.setFechaCreacion(rs.getString("fecha_creacion"));
                ticket.setTitulo(rs.getString("titulo"));
                ticket.setEstado(rs.getString("estado"));
                ticket.setPrioridad(rs.getString("prioridad"));
                ticket.setDescripcion(rs.getString("descripcion"));
                ticket.setSolucion(rs.getString("solucion"));
                ticket.setFechaCierre(rs.getString("fecha_cierre"));
                ticket.setEmpleadoEncargado(new EmpleadoDAO().obtenerEmpleado(rs.getInt("id_empleado")));
                ticket.setEmisor(new EmisorDAO().obtenerEmisor(rs.getInt("id_emisor")));
                listaTickets.add(ticket);
            }

        }catch (SQLException e){
            System.out.println("Error al obtener todos los tickets");
            e.printStackTrace();
        }
        return listaTickets;
    }

    public boolean cambiarResponsable(){
        return true;
    }
}
