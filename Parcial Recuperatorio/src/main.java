import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Sector sectorFrutal = new Sector("Sector Manzanas", "Roble manzanas");
        Sector sectorAromatico = new Sector("Sector Rosas", "Rosas de muchos colores");

        Cultivo cultivoRosas1 = new Cultivo("Rosas Rojas", TipoCultivo.AROMATICA, LocalDate.of(2004, 11,5));
        Cultivo cultivoRosas2 = new Cultivo("Rosas Blancas", TipoCultivo.AROMATICA, LocalDate.of(2004, 11,2));
        Cultivo cultivoRoble1 = new Cultivo("Roble", TipoCultivo.FRUTAL, LocalDate.of(2000, 11,1));

        cultivoRoble1.addCosechas(new Cosecha(LocalDate.of(2015,10,14),15.4));
        cultivoRoble1.addCosechas(new Cosecha(LocalDate.of(2016,10,24),12.1));

        sectorFrutal.addCultivos(cultivoRoble1);
        sectorAromatico.addCultivos(cultivoRosas1);
        sectorFrutal.addCultivos(cultivoRosas2);

        Turno turnoCuidadoRosas = new Turno(LocalDate.now(),"12:00-16:00");

        Voluntario voluntario1 = new Voluntario("Pepe argento", "24557582","pepearg@gmail.com",turnoCuidadoRosas);
        Voluntario voluntario2 = new Voluntario("Paola argento", "245324582","paoargento@gmail.com",turnoCuidadoRosas);
        voluntario2.realizarTarea(new Tarea("regar Rosas", LocalDate.of(2025,6,1)));
        voluntario1.realizarTarea(new Tarea("cortar espinas rosas",LocalDate.now()));
        voluntario1.realizarTarea(new Tarea("cosechar rosas rojas",LocalDate.of(2025, 6, 4)));

        Capacitador coqui = new Capacitador("coqui argento", "36234567","coqui@gmail.com","rosas");
        Capacitacion rosas = new Capacitacion("Aprender sobre las Rosas", LocalDate.of(2025,6,1));
        rosas.setCapacitador(coqui);
        rosas.addVoluntario(voluntario1);
        rosas.addVoluntario(voluntario2);

        Donante donante1 = new Donante("Luca Bertaina", "46620867", "mnea479@gmail.com");
        donante1.addDonacion(new Donacion(TipoDonacion.HERRAMIENTAS, "Pico y Pala",LocalDate.of(2024,6,1)));

        Domicilio casaluca = new Domicilio("Eusebio blanco", "233", "Dorrego", "Mendoza");
        Domicilio casaArgento = new Domicilio("la florinda", "1923", "Recoleta", "CABA");
        voluntario1.setDomicilio(casaArgento);
        voluntario2.setDomicilio(casaArgento);
        coqui.setDomicilio(casaArgento);
        donante1.setDomicilio(casaluca);

        donante1.mostrarDonaciones();

        rosas.mostratAsistentes();

        sectorFrutal.getCosechaDelSector();





    }

}
