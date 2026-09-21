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
        if (cantidadInscripciones < CUPO_MAXIMO) {
            inscripciones[cantidadInscripciones] = inscripcion;
            cantidadInscripciones++;
        } else {
            System.out.println("El turno está completo.");
        }
    }

    public String descripcion() {
        return "Fecha: " + fechaTurno + " - Horario: " + horarioTurno + " - " + instructor.descripcion();
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getFechaTurno() {
        return fechaTurno;
    }

    public int getCantidadInscripciones() {
        return cantidadInscripciones;
    }

    public Inscripcion[] getInscripciones() {
        return inscripciones;
    }

    public double getPorcentajeAsistencia() {
        if (cantidadInscripciones == 0) return 0.0;
        int asistencias = 0;
        for (int i = 0; i < cantidadInscripciones; i++) {
            if (inscripciones[i].isAsistencia()) {
                asistencias++;
            }
        }
        return (double) asistencias / cantidadInscripciones * 100;
    }
}
