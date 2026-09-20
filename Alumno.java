public class Alumno {
    private String nombreAlumno;
    private String apellidoAlumno;
    private String dniAlumno;
    private String nivelAlumno;
    private int numeroAlumno;
    private static int proximoNumero = 1;

    public Alumno(String nombreAlumno, String apellidoAlumno, String dniAlumno, String nivelAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.dniAlumno = dniAlumno;
        this.nivelAlumno = nivelAlumno;
        this.numeroAlumno = proximoNumero++;

    }

    public Alumno(String nombreAlumno, String apellidoAlumno, String dniAlumno) {
        this(nombreAlumno, apellidoAlumno, dniAlumno, "principiante");
    }

}
