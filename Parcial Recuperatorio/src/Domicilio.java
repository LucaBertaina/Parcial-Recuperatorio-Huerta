public class Domicilio {
    private String calle;
    private String numero;
    private String localidad;
    private String domicilio;

    public Domicilio(String calle, String numero, String localidad, String domicilio) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.domicilio = domicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
