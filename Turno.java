public class Turno {
    private String fechaTurno;
    private String horarioTurno;
    private int cupoMaximo;
    private Instructor instructor;

    public Turno(String fechaTurno, String horarioTurno, int cupoMaximo, Instructor instructor) {
        this.fechaTurno = fechaTurno;
        this.horarioTurno = horarioTurno;
        setCupoMaximo(cupoMaximo);
        this.instructor = instructor;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo >= 1) {
            this.cupoMaximo = cupoMaximo;
        } else {
            throw new IllegalArgumentException("El cupo de un turno no puede ser menor que 1.");
        }
    }

}
