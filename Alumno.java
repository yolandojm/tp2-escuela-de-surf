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
        setNivelAlumno(nivelAlumno);
        this.numeroAlumno = proximoNumero++;
    }

    public void setNivelAlumno(String nivelAlumno) {
        if (nivelAlumno.equalsIgnoreCase("principiante") || nivelAlumno.equalsIgnoreCase("intermedio")) {
            this.nivelAlumno = nivelAlumno;
        } else {
            throw new IllegalArgumentException("El nivel debe ser 'principiante' o 'intermedio'.");
        }
    }

    public Alumno(String nombreAlumno, String apellidoAlumno, String dniAlumno) {
        this(nombreAlumno, apellidoAlumno, dniAlumno, "principiante");
    }

}
