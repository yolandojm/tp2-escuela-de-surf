public class Turno {
    private String fechaTurno;
    private String horarioTurno;
    private int cupoMaximo;
    private Instructor instructor;

    public Turno(String fechaTurno, String horarioTurno, int cupoMaximo, Instructor instructor) {
        this.fechaTurno = fechaTurno;
        this.horarioTurno = horarioTurno;
        this.cupoMaximo = cupoMaximo;
        this.Instructor = instructor;
    }

}
