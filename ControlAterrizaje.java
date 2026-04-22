import java.util.LinkedList;
import java.util.Queue;

public class ControlAterrizaje {
    Queue<Avion> cola = new LinkedList<>();

    public void agregarAvion(Avion newAvion) {
        cola.add(newAvion);
    }

    public Avion procesarAterrizaje() {
        return cola.poll();
    }

    public void mostrar() {
        System.out.println("Cola Aterrizaje: " + cola);
    }
}
