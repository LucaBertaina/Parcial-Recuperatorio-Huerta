import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cultivo {
    private String especie;
    private TipoCultivo tipoCultivo;
    private LocalDate fechaSiembra;
    private List<Cosecha> cosechas= new ArrayList<>();

    public Cultivo(String especie, TipoCultivo tipoCultivo, LocalDate fechaSiembra) {
        this.especie = especie;
        this.tipoCultivo = tipoCultivo;
        this.fechaSiembra = fechaSiembra;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(TipoCultivo tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public List<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(List<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    public void addCosechas(Cosecha cosecha){
        this.cosechas.add(cosecha);
    }
    public void remCosechas(Cosecha cosecha){
        this.cosechas.remove(cosecha);
    }
}
