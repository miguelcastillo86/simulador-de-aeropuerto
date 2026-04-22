import java.util.Stack;

public class GestionEquipaje {
    Stack<Equipaje> pila = new Stack<>();

    public void registrarEquipaje(Equipaje newEquipaje) {
        pila.push(newEquipaje);
    }

    public Equipaje retirarEquipaje() {
        return pila.pop();
    }

    public void mostrar() {
        System.out.println("Equipaje:" + pila);
    }
}
