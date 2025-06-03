import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Capacitacion {
    private String tema;
    private LocalDate fecha;
    private Capacitador capacitador;
    private List<Voluntario> voluntarios = new ArrayList<>();

    public Capacitacion(String tema, LocalDate fecha) {
        this.tema = tema;
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(List<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }
    public void addVoluntario(Voluntario voluntario){
        this.voluntarios.add(voluntario);
    }
    public void mostratAsistentes(){
        System.out.println("Los asistentes de la capacitacion sobre "+ this.tema + " son:");
        for(Voluntario v : voluntarios){
            System.out.println(v.toString());
        }
    }
}
