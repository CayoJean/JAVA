/*import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SistemaTurnos {
    private static ArrayList<Integer> turnos = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Asignación de Turnos");
            System.out.println("1. Emitir nuevo turno");
            System.out.println("2. Realizar sorteo");
            System.out.println("3. Mostrar lista de turnos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    emitirTurno();
                    break;
                case 2:
                    realizarSorteo();
                    break;
                case 3:
                    mostrarTurnos();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para emitir un nuevo turno
    private static void emitirTurno() {
        int nuevoTurno = turnos.size() + 1; // Asignar el siguiente número de turno
        turnos.add(nuevoTurno);
        System.out.println("Nuevo turno emitido: " + nuevoTurno);
    }

    // Método para realizar un sorteo
    private static void realizarSorteo() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos disponibles para sorteo.");
            return;
        }

        int indice = random.nextInt(turnos.size());
        int turnoSorteado = turnos.get(indice);
        turnos.remove(indice); // Elimina el turno de la lista después de atenderlo
        System.out.println("Turno sorteado y atendido: " + turnoSorteado);
    }

    // Método para mostrar la lista de turnos
    private static void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos en la lista.");
        } else {
            System.out.println("Lista de turnos:");
            for (Integer turno : turnos) {
                System.out.println("Turno: " + turno);
            }
        }
    }
}*/












import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SistemaTurnos {
    private static ArrayList<Integer> turnos = new ArrayList<>();
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println();
            System.out.println("\n--- Actividad: Turner ---");
            System.out.println("\nSistema de Asignación de Turnos");
            System.out.println("1. Emitir nuevo turno");
            System.out.println("2. Realizar sorteo");
            System.out.println("3. Mostrar lista de turnos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    emitirTurno();
                    break;
                case 2:
                    realizarSorteo();
                    break;
                case 3:
                    mostrarTurnos();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para leer una opción numérica
    private static int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Por favor ingresa un número entero válido.");
            scanner.next(); // Limpia la entrada no válida
        }
        return scanner.nextInt();
    }

    // Método para emitir un nuevo turno
    private static void emitirTurno() {
        int nuevoTurno = turnos.size() + 1; // Asignar el siguiente número de turno
        turnos.add(nuevoTurno);
        System.out.println("Nuevo turno emitido: " + nuevoTurno);
    }

    // Método para realizar un sorteo
    private static void realizarSorteo() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos disponibles para sorteo.");
            return;
        }

        int indice = random.nextInt(turnos.size());
        int turnoSorteado = turnos.get(indice);
        turnos.remove(indice); // Elimina el turno de la lista después de atenderlo
        System.out.println("Turno sorteado y atendido: " + turnoSorteado);
    }

    // Método para mostrar la lista de turnos
    private static void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos en la lista.");
        } else {
            System.out.println("Lista de turnos:");
            for (Integer turno : turnos) {
                System.out.println("Turno: " + turno);
            }
        }
    }
}




