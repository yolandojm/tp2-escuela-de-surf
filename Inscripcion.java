public class Inscripcion {
    private String fechaInscripcion;
    private boolean asistencia;
    private Tabla tablaAsignada;
    private Alumno alumno;

    public Inscripcion(String fechaInscripcion, boolean asistencia, Tabla tablaAsignada, Alumno alumno) {
        this.fechaInscripcion = fechaInscripcion;
        this.asistencia = asistencia;
        this.tablaAsignada = tablaAsignada;
        this.alumno = alumno;
    }

    public String descripcion(){
        return "fecha de inscripcion: " + fechaInscripcion + " - Asistencia: " + asistencia + " - Tabla: " + tablaAsignada.descripcion() + " - Alumno: " + alumno.descripcion();
    }
}
