public class Equipaje {
    int id;
    double peso;
    int idPasajero;

    public Equipaje(int id, double peso, int idPasajero) {
        this.id = id;
        this.peso = peso;
        this.idPasajero = idPasajero;
    }

    public String toString() {
        return "Maleta " + id + "Peso: " + peso + "kg";
    }
}
