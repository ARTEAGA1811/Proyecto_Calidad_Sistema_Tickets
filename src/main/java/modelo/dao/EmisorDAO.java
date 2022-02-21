package modelo.dao;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Emisor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmisorDAO {
    private ResultSet rs = null;
    private PreparedStatement pstmt = null;

    private String SQL_SELECT = "SELECT * FROM emisor WHERE id_emisor = ?";

    public Emisor obtenerEmisor(int idEmisor) {
        Emisor emisor = null;
        try {
            pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT);
            pstmt.setInt(1, idEmisor);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                emisor = new Emisor();
                emisor.setIdEmisor(rs.getInt("id_emisor"));
                emisor.setNombre(rs.getString("nombre"));
                emisor.setApellido(rs.getString("apellido"));
                emisor.setCorreo(rs.getString("correo"));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el emisor: " + e.getMessage());
            e.printStackTrace();
        }
        return emisor;
    }
}
