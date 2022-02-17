package modelo.entidad;

public class CambioResponsables {
    private int idCambio;
    private int idTicket;
    private int idAntiguoResponsable;
    private int idNuevoResponsable;
    private String razonCambio;

    public CambioResponsables() {
    }

    public CambioResponsables(int idCambio, int idTicket, int idAntiguoResponsable, int idNuevoResponsable, String razonCambio) {
        this.idCambio = idCambio;
        this.idTicket = idTicket;
        this.idAntiguoResponsable = idAntiguoResponsable;
        this.idNuevoResponsable = idNuevoResponsable;
        this.razonCambio = razonCambio;
    }

    public int getIdCambio() {
        return idCambio;
    }

    public void setIdCambio(int idCambio) {
        this.idCambio = idCambio;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getIdAntiguoResponsable() {
        return idAntiguoResponsable;
    }

    public void setIdAntiguoResponsable(int idAntiguoResponsable) {
        this.idAntiguoResponsable = idAntiguoResponsable;
    }

    public int getIdNuevoResponsable() {
        return idNuevoResponsable;
    }

    public void setIdNuevoResponsable(int idNuevoResponsable) {
        this.idNuevoResponsable = idNuevoResponsable;
    }

    public String getRazonCambio() {
        return razonCambio;
    }

    public void setRazonCambio(String razonCambio) {
        this.razonCambio = razonCambio;
    }

    @Override
    public String toString() {
        return "CambioResponsables{" +
                "idCambio=" + idCambio +
                ", idTicket=" + idTicket +
                ", idAntiguoResponsable=" + idAntiguoResponsable +
                ", idNuevoResponsable=" + idNuevoResponsable +
                ", razonCambio='" + razonCambio + '\'' +
                '}';
    }
}
