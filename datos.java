public class datos {
    private String Nombre;
    private String Calificacion;

    public datos(String nombre, String calificacion) {
        Nombre = nombre;
        Calificacion = calificacion;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCalificacion() {
        return Calificacion;
    }
    public void setCalificacion(String calificacion) {
        Calificacion = calificacion;
    }

    public datos() {
    }

    
}