public class Main {
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

    }
}