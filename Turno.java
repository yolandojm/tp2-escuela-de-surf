public class Turno {
    private String fechaTurno;
    private String horarioTurno;
    private Instructor instructor;

    public static final int CUPO_MAXIMO = 10;

    public Turno(String fechaTurno, String horarioTurno, Instructor instructor) {
        this.fechaTurno = fechaTurno;
        this.horarioTurno = horarioTurno;
        this.instructor = instructor;
    }

    public String descripcion() {
        return "Fecha: " + fechaTurno + " - Horario: " + horarioTurno + " - " + instructor.descripcion();
    }
}
