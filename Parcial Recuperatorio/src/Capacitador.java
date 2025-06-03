public class Capacitador extends Persona{
    private String especialidad;

    public Capacitador(String nombre, String dni, String email, String especialidad) {
        super(nombre, dni, email);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
