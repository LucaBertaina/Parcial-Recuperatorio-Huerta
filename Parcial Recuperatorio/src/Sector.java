import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombre;
    private String descripcion;
    private List<Cultivo> cultivos = new ArrayList<>();

    public Sector(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }
    public void addCultivos(Cultivo cultivo){
        this.cultivos.add(cultivo);
    }
    public void remCultivos(Cultivo cultivo){
        this.cultivos.remove(cultivo);
    }
    public List<Cosecha> getCosechaDelSector(){
        List<Cosecha> listaCosechas = new ArrayList<>();
        for(Cultivo cul : cultivos ){
            for (Cosecha cos : cul.getCosechas()){
                listaCosechas.add(cos);
            }

        }
        return listaCosechas;
    }
}
