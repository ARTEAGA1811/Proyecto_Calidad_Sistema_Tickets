package modelo.entidad;

import java.io.Serializable;

public class Emisor implements Serializable {
    private int idEmisor;
    private String nombre;
    private String apellido;
    private String correo;

    public Emisor(){

    }

    public Emisor(int idEmisor, String nombre, String apellido, String correo){
        this.idEmisor = idEmisor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    public Emisor(String nombre, String apellido, String correo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Emisor{" +
                "idEmisor=" + idEmisor +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
