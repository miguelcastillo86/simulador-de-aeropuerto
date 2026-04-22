import java.util.LinkedList;
import java.util.Queue;

public class Checkln {
    Queue<Pasajero> cola = new LinkedList<>();

    public void registrarPasajero(Pasajero newPasajero) {
        cola.add(newPasajero);
    }

    public Pasajero atenderPasajero() {
        return cola.poll();
    }

    public void mostrar() {
        System.out.println("Check-In: " + cola);
    }
}
