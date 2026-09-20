public class Escuela {
    private String nombreEscuela;
    private String playa;

    public Escuela(String nombreEscuela, String playa) {
        this.nombreEscuela = nombreEscuela;
        this.playa = playa;
    }
    public String descripcion(){
        return "Escuela: " + nombreEscuela + " - playa: " + playa;
    }
}