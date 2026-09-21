public class main {
    public static void main(String[] args) {

        Escuela escuela = new Escuela("Escuela de Surf", "Playa Norte");

        Instructor instructor1 = new Instructor("Carlos", "Gomez", "MAT001");
        Instructor instructor2 = new Instructor("Juan", "Perez", "MAT002");

        Tabla tabla1 = new Tabla("T001", 6.5, true);
        Tabla tabla2 = new Tabla("T002", 7.0, true);
        Tabla tabla3 = new Tabla("T003", 8.0, false);
        Tabla tabla4 = new Tabla("T004", 9.0, true);

        Turno turno1 = new Turno("22/9", "5pm", instructor1);
        Turno turno2 = new Turno("22/9", "5pm", instructor2);
        Turno turno3 = new Turno("23/9", "6pm", instructor1);

        Alumno alumno1 = new Alumno("Luis", "Rodriguez", "40111222", "principiante");
        Alumno alumno2 = new Alumno("Martin", "Palermo", "40222333", "intermedio");
        Alumno alumno3 = new Alumno("Sofia", "Lopez", "40333444", "principiante");
        Alumno alumno4 = new Alumno("Ana", "Diaz", "40444555", "intermedio");
        Alumno alumno5 = new Alumno("Roman", "Riquelme", "40555666", "principiante");

        Inscripcion inscripcion1 = new Inscripcion("21/9", true, tabla1, alumno1, turno1);
        turno1.agregarInscripcion(inscripcion1);

        Inscripcion inscripcion2 = new Inscripcion("21/9", true, tabla2, alumno2, turno1);
        turno1.agregarInscripcion(inscripcion2);

        Inscripcion inscripcion3 = new Inscripcion("21/9", false, tabla3, alumno3, turno2);
        turno2.agregarInscripcion(inscripcion3);

        Inscripcion inscripcion4 = new Inscripcion("21/9", true, tabla4, alumno4, turno2);
        turno2.agregarInscripcion(inscripcion4);

        Inscripcion inscripcion5 = new Inscripcion("21/9", true, tabla1, alumno5, turno3);
        turno3.agregarInscripcion(inscripcion5);

        Inscripcion inscripcion6 = new Inscripcion("21/9", true, tabla1, alumno1, turno2);
        turno2.agregarInscripcion(inscripcion6);

        Inscripcion inscripcion7 = new Inscripcion("21/9", true, tabla2, alumno3, turno1);
        turno1.agregarInscripcion(inscripcion7);

        Inscripcion inscripcion8 = new Inscripcion("21/9", true, tabla4, alumno4, turno1);
        turno1.agregarInscripcion(inscripcion8);

        Inscripcion inscripcion9 = new Inscripcion("21/9", false, tabla1, alumno5, turno1);
        turno1.agregarInscripcion(inscripcion9);

        Inscripcion inscripcion10 = new Inscripcion("21/9", true, tabla2, alumno2, turno1);
        turno1.agregarInscripcion(inscripcion10);

        Inscripcion inscripcion11 = new Inscripcion("21/9", true, tabla4, alumno3, turno1);
        turno1.agregarInscripcion(inscripcion11);

        Inscripcion inscripcion12 = new Inscripcion("21/9", false, tabla1, alumno4, turno1);
        turno1.agregarInscripcion(inscripcion12);

        Inscripcion inscripcion13 = new Inscripcion("21/9", true, tabla3, alumno5, turno1);
        turno1.agregarInscripcion(inscripcion13);

        Inscripcion inscripcion14 = new Inscripcion("21/9", true, tabla2, alumno2, turno1);
        turno1.agregarInscripcion(inscripcion14);

        Inscripcion inscripcion15 = new Inscripcion("21/9", true, tabla2, alumno2, turno1);
        turno1.agregarInscripcion(inscripcion15);

        escuela.agregarTabla(tabla1);
        escuela.agregarTabla(tabla2);
        escuela.agregarTabla(tabla3);
        escuela.agregarTabla(tabla4);

        escuela.agregarTurno(turno1);
        escuela.agregarTurno(turno2);
        escuela.agregarTurno(turno3);

        System.out.println("=== D.4.1 Lista de turnos ===");
        for (int i = 0; i < escuela.getCantidadTurnos(); i++) {
            Turno t = escuela.getTurnos()[i];
            System.out.println("Turno " + t.getFechaTurno() + " - Instructor: " + t.getInstructor().descripcion() + " - Inscriptos: " + t.getCantidadInscripciones());
        }

        System.out.println("\n=== D.4.2 Datos de un alumno (alumno1) y sus turnos ===");
        System.out.println(alumno1.descripcion());
        for (int i = 0; i < escuela.getCantidadTurnos(); i++) {
            Turno t = escuela.getTurnos()[i];
            for (int j = 0; j < t.getCantidadInscripciones(); j++) {
                if (t.getInscripciones()[j].getAlumno() == alumno1) {
                    System.out.println("Inscripto en: " + t.descripcion());
                }
            }
        }

        System.out.println("\n=== D.4.3 Tablas en reparación ===");
        int tablasEnReparacion = 0;
        for (int i = 0; i < escuela.getCantidadTablas(); i++) {
            if (!escuela.getTablas()[i].isDisponibilidad()) {
                tablasEnReparacion++;
            }
        }
        System.out.println("Cantidad de tablas en reparación: " + tablasEnReparacion);

        System.out.println("\n=== D.4.4 Porcentaje de asistencia de un turno (turno1) ===");
        System.out.printf("Porcentaje de asistencia: %.2f%%\n", turno1.getPorcentajeAsistencia());

    }
}
