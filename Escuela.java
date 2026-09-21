public class Escuela {
    private String nombreEscuela;
    private String playa;
    private Turno[] turnos;
    private int cantidadTurnos;
    private Tabla[] tablas;
    private int cantidadTablas;

    public Escuela(String nombreEscuela, String playa) {
        this.nombreEscuela = nombreEscuela;
        this.playa = playa;
        this.turnos = new Turno[50];
        this.tablas = new Tabla[50];
    }
    public String descripcion(){
        return "Escuela: " + nombreEscuela + " - playa: " + playa;
    }

    public void agregarTurno(Turno turno) {
        turnos[cantidadTurnos] = turno;
        cantidadTurnos++;
    }

    public void agregarTabla(Tabla tabla) {
        tablas[cantidadTablas] = tabla;
        cantidadTablas++;
    }

    public Turno[] getTurnos() {
        return turnos;
    }

    public int getCantidadTurnos() {
        return cantidadTurnos;
    }

    public Tabla[] getTablas() {
        return tablas;
    }

    public int getCantidadTablas() {
        return cantidadTablas;
    }
}