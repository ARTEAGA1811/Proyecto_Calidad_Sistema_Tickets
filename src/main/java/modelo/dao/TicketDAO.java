package modelo.dao;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Ticket;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TicketDAO {

    private String SQL_INSERT = "INSERT INTO ticket (fecha_creacion , titulo, estado, prioridad, descripcion, solucion, fecha_cierre, id_empleado, id_emisor) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)";

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

    public List<Ticket> obtenerTodosTickets(){
        return null;
    }

    public boolean cambiarResponsable(){
        return true;
    }
}
