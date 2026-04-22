import java.util.LinkedList;
import java.util.Queue;

public class ControlDespegue {
    Queue<Avion> cola = new LinkedList<>();

    public void agregarAvion(Avion newAvion) {
        cola.add(newAvion);
    }

    public Avion procesarDespegue() {
        return cola.poll();
    }

    public void mostrar() {
        System.out.println("Cola Despegue: " + cola);
    }
}
