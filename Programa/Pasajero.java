public class Pasajero {
    int id;
    String nombre;
    String vuelo;
    int prioridad;

    public Pasajero(int id, String nombre, String vuelo, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.vuelo = vuelo;
        this.prioridad = prioridad;
    }

    public String toString() {
        return id + " - " + nombre + "Vuelo: " + vuelo;
    }
}