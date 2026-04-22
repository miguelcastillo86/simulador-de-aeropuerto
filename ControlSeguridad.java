import java.util.LinkedList;
import java.util.Queue;

public class ControlSeguridad {
    Queue<Pasajero> cola = new LinkedList<>();

    public void ingresarPasajero(Pasajero newPasajero) {
        cola.add(newPasajero);
    }

    public Pasajero atenderPasajero() {
        return cola.poll();
    }

    public void mostrar() {
        System.out.println("Seguridad: " + cola);
    }
}
