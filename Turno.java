public class Turno {
    private String fechaTurno;
    private String horarioTurno;
    private Instructor instructor;
    private Inscripcion[] inscripciones;
    private int cantidadInscripciones;

    public static final int CUPO_MAXIMO = 10;

    public Turno(String fechaTurno, String horarioTurno, Instructor instructor) {
        this.fechaTurno = fechaTurno;
        this.horarioTurno = horarioTurno;
        this.instructor = instructor;
        this.inscripciones = new Inscripcion[CUPO_MAXIMO];
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones[cantidadInscripciones] = inscripcion;
        cantidadInscripciones++;
    }

    public String descripcion() {
        return "Fecha: " + fechaTurno + " - Horario: " + horarioTurno + " - " + instructor.descripcion();
    }
}
