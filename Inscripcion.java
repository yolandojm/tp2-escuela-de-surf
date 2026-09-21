public class Inscripcion {
    private String fechaInscripcion;
    private boolean asistencia;
    private Tabla tablaAsignada;
    private Alumno alumno;
    private Turno turno;

    public Inscripcion(String fechaInscripcion, boolean asistencia, Tabla tablaAsignada, Alumno alumno, Turno turno) {
        this.fechaInscripcion = fechaInscripcion;
        this.asistencia = asistencia;
        this.tablaAsignada = tablaAsignada;
        this.alumno = alumno;
        this.turno = turno;
    }

}
