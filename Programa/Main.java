import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Checkln checkIn = new Checkln();
        ControlSeguridad seguridad = new ControlSeguridad();
        GestionAbordaje abordaje = new GestionAbordaje();
        GestionEquipaje equipaje = new GestionEquipaje();

        ControlDespegue despegue = new ControlDespegue();
        ControlAterrizaje aterrizaje = new ControlAterrizaje();

        Pista pista = new Pista(1, "Principal");

        int opcion = 0;

        while (opcion != 13) {

            System.out.println("\n===== AEROPUERTO =====");
            System.out.println("1. Registrar pasajero");
            System.out.println("2. Pasar pasajero a seguridad");
            System.out.println("3. Pasar pasajero a abordaje");
            System.out.println("4. Abordar pasajero");
            System.out.println("5. Registrar equipaje");
            System.out.println("6. Retirar equipaje");
            System.out.println("7. Mostrar pasajeros");
            System.out.println("8. Registrar avion para despegue");
            System.out.println("9. Registrar avion para aterrizaje");
            System.out.println("10. Procesar despegue");
            System.out.println("11. Procesar aterrizaje");
            System.out.println("12. Mostrar aviones");
            System.out.println("13. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {

                int id;
                String nombre;
                String vuelo;

                System.out.print("ID: ");
                id = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Nombre: ");
                nombre = entrada.nextLine();

                System.out.print("Vuelo: ");
                vuelo = entrada.nextLine();

                Pasajero nuevoPasajero = new Pasajero(id, nombre, vuelo);

                checkIn.registrarPasajero(nuevoPasajero);

            } else if (opcion == 2) {

                Pasajero pasajero = checkIn.atenderPasajero();

                if (pasajero != null) {
                    seguridad.ingresarPasajero(pasajero);
                    System.out.println("Pasajero enviado a seguridad");
                } else {
                    System.out.println("No hay pasajeros en check-in");
                }

            } else if (opcion == 3) {

                Pasajero pasajero = seguridad.atenderPasajero();

                if (pasajero != null) {
                    abordaje.agregarPasajero(pasajero);
                    System.out.println("Pasajero enviado a abordaje");
                } else {
                    System.out.println("No hay pasajeros en seguridad");
                }

            } else if (opcion == 4) {

                Pasajero pasajero = abordaje.abordarPasajero();

                if (pasajero != null) {
                    System.out.println("Abordo: " + pasajero.nombre);
                } else {
                    System.out.println("No hay pasajeros para abordar");
                }

            } else if (opcion == 5) {

                int idMaleta;
                int idPasajero;
                int peso;

                System.out.print("ID maleta: ");
                idMaleta = entrada.nextInt();

                System.out.print("Peso: ");
                peso = entrada.nextInt();

                System.out.print("ID pasajero: ");
                idPasajero = entrada.nextInt();

                Equipaje maleta = new Equipaje(idMaleta, peso, idPasajero);

                equipaje.registrarEquipaje(maleta);

            } else if (opcion == 6) {

                if (!equipaje.pila.empty()) {
                    System.out.println("Equipaje retirado: " + equipaje.retirarEquipaje());
                } else {
                    System.out.println("No hay equipaje");
                }

            } else if (opcion == 7) {

                checkIn.mostrar();
                seguridad.mostrar();
                abordaje.mostrar();
                equipaje.mostrar();

            } else if (opcion == 8) {

                int codigo;
                int capacidad;
                String destino;

                System.out.print("Codigo avion: ");
                codigo = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Destino: ");
                destino = entrada.nextLine();

                System.out.print("Capacidad: ");
                capacidad = entrada.nextInt();

                Avion avion = new Avion(codigo, capacidad, destino, "Esperando despegue");

                despegue.agregarAvion(avion);

            } else if (opcion == 9) {

                int codigo;
                int capacidad;
                String origen;

                System.out.print("Codigo avion: ");
                codigo = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Origen: ");
                origen = entrada.nextLine();

                System.out.print("Capacidad: ");
                capacidad = entrada.nextInt();

                Avion avion = new Avion(codigo, capacidad, origen, "Esperando aterrizaje");

                aterrizaje.agregarAvion(avion);

            } else if (opcion == 10) {

                if (pista.disponible()) {

                    Avion avion = despegue.procesarDespegue();

                    if (avion != null) {
                        pista.ocupar();
                        System.out.println("Despegando: " + avion);
                        pista.liberar();
                    } else {
                        System.out.println("No hay aviones en cola");
                    }

                } else {
                    System.out.println("Pista ocupada");
                }

            } else if (opcion == 11) {

                if (pista.disponible()) {

                    Avion avion = aterrizaje.procesarAterrizaje();

                    if (avion != null) {
                        pista.ocupar();
                        System.out.println("Aterrizando: " + avion);
                        pista.liberar();
                    } else {
                        System.out.println("No hay aviones en cola");
                    }

                } else {
                    System.out.println("Pista ocupada");
                }

            } else if (opcion == 12) {

                despegue.mostrar();
                aterrizaje.mostrar();

            } else if (opcion == 13) {

                System.out.println("Sistema finalizado");

            } else {

                System.out.println("Opcion incorrecta");

            }

        }

    }

}
