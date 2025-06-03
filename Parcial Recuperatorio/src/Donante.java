import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona{
    private List<Donacion> donaciones= new ArrayList<>();

    public Donante(String nombre, String dni, String email) {
        super(nombre, dni, email);
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    public void addDonacion(Donacion donacion){
        this.donaciones.add(donacion);
    }
    public void mostrarDonaciones(){
        System.out.println("Donaciones de "+ this.getNombre()+": " );
        for(Donacion d : donaciones){
            System.out.println(d.toString());
        }
    }
}
