package modelo.dao;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDAO {

    private ResultSet rs = null;
    private PreparedStatement pstmt = null;

    String SQLSELECT = "SELECT * FROM empleado WHERE id_empleado = ?";


    public EmpleadoDAO() {
    }


    public Empleado autenticar(String usuario, String clave){
        Empleado miEmpleado = null;

        try {
            pstmt = ConexionBDD.getConexion().prepareStatement("SELECT * FROM empleado WHERE usuario = ? AND clave = ?");
            pstmt.setString(1, usuario);
            pstmt.setString(2, clave);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                miEmpleado = new Empleado();
                miEmpleado.setIdEmpleado(rs.getInt("id_empleado"));
                miEmpleado.setNombre(rs.getString("nombre"));
                miEmpleado.setApellido(rs.getString("apellido"));
                miEmpleado.setNombreUsuario(rs.getString("nombre_usuario"));
                miEmpleado.setClave(rs.getString("contrasenia"));
                miEmpleado.setCorreo(rs.getString("correo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al autenticar el empleado");
        }

        return miEmpleado;

    }

    public Empleado obtenerEmpleado(int idEmpleado){
        Empleado miEmpleado = null;

        try {
            pstmt = ConexionBDD.getConexion().prepareStatement(SQLSELECT);
            pstmt.setInt(1, idEmpleado);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                miEmpleado = new Empleado();
                miEmpleado.setIdEmpleado(rs.getInt("id_empleado"));
                miEmpleado.setNombre(rs.getString("nombre"));
                miEmpleado.setApellido(rs.getString("apellido"));
                miEmpleado.setNombreUsuario(rs.getString("nombre_usuario"));
                miEmpleado.setClave(rs.getString("contrasenia"));
                miEmpleado.setCorreo(rs.getString("correo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener el empleado");
        }

        return miEmpleado;
    }



}