public class Pista {
    int id;
    String nombre;
    boolean ocupada;

    public Pista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        ocupada = false;
    }

    public boolean disponible() {
        return !ocupada;
    }

    public void ocupar() {
        ocupada = true;
    }

    public void liberar() {
        ocupada = false;
    }
}
