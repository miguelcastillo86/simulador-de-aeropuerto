public class Pasajero {
    int id;
    String nombre;
    String vuelo;

    public Pasajero(int id, String nombre, String vuelo) {
        this.id = id;
        this.nombre = nombre;
        this.vuelo = vuelo;

    }

    public String toString() {
        return id + " - " + nombre + "Vuelo: " + vuelo;
    }
}