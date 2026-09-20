public class Tabla {
    private String codigoTabla;
    private double medidaEnPies;
    private boolean disponibilidad;

    public Tabla(String codigoTabla, double medidaEnPies, boolean disponibilidad) {
        this.codigoTabla = codigoTabla;
        setMedidaEnPies(medidaEnPies);
        this.disponibilidad = disponibilidad;
    }

    public void setMedidaEnPies(double medidaEnPies) {
        if (medidaEnPies >= 5 && medidaEnPies <= 10) {
            this.medidaEnPies = medidaEnPies;
        } else {
            throw new IllegalArgumentException("El largo de la tabla debe estar entre 5 y 10 pies.");
        }
    }
}
