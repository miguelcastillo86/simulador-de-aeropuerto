public class Avion {
    int codigo;
    int capacidad;
    String destino;
    String estado;

    public Avion(int codigo, int capacidad, String destino, String estado) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.destino = destino;
        this.estado = estado;
    }

    public String toString() {
        return "Avion" + codigo + " - " + destino + " - " + estado;
    }
}
