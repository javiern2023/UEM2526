package EjercicioListaUsuariosColeccionDatos;

public class Participante {

    private String dni;
    private String nombre;

    public Participante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre;
    }
}
