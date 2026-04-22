import java.util.LinkedList;
import java.util.Queue;

public class GestionAbordaje {
    Queue<Pasajero> cola = new LinkedList<>();

    public void agregarPasajero(Pasajero newPasajero) {
        cola.add(newPasajero);
    }

    public Pasajero abordarPasajero() {
        return cola.poll();
    }

    public void mostrar() {
        System.out.println("Abordaje: " + cola);
    }
}
