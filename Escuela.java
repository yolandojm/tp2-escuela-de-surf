public class Escuela {
    private String nombreEscuela;
    private String playa;
    private Turno[] turnos;
    private int cantidadTurnos;

    public Escuela(String nombreEscuela, String playa) {
        this.nombreEscuela = nombreEscuela;
        this.playa = playa;
        this.turnos = new Turno[50];
    }
    public String descripcion(){
        return "Escuela: " + nombreEscuela + " - playa: " + playa;
    }

    public void agregarTurno(Turno turno) {
        turnos[cantidadTurnos] = turno;
        cantidadTurnos++;
    }
}