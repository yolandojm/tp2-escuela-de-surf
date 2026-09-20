public class Instructor {
    private String nombreInstructor;
    private String apellidoInstructor;
    private String matriculaInstructor;
    private Turno[] turnos;
    private int cantidadTurnos;


    public Instructor(String nombreInstructor, String apellidoInstructor, String matriculaInstructor) {
        this.nombreInstructor = nombreInstructor;
        this.apellidoInstructor = apellidoInstructor;
        this.matriculaInstructor = matriculaInstructor;
        this.turnos = new Turno[50];
    }

    public void agregarTurno(Turno turno) {
        turnos[cantidadTurnos] = turno;
        cantidadTurnos++;
    }

    public String descripcion(){
        return "Instructor: " + nombreInstructor + " " + apellidoInstructor + " - Matricula: " + matriculaInstructor;
    }
}
