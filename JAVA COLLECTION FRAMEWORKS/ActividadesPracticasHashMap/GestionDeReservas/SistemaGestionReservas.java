package ActividadesPracticasHashMap.GestionDeReservas;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaGestionReservas {
    // HashMap para almacenar las reservas
    private HashMap<String, Reserva> reservas;

    // Constructor
    public SistemaGestionReservas() {
        this.reservas = new HashMap<>();
    }

    // Método para agregar una nueva reserva
    public void agregarReserva(String identificador, String fecha, String nombreReservante) {
        if (reservas.containsKey(identificador)) {
            System.out.println("Error: Ya existe una reserva con el identificador: " + identificador);
        } else {
            Reserva nuevaReserva = new Reserva(identificador, fecha, nombreReservante);
            reservas.put(identificador, nuevaReserva);
            System.out.println("Reserva agregada con éxito: " + nuevaReserva);
        }
    }

    // Método para obtener una reserva por su identificador
    public Reserva obtenerReserva(String identificador) {
        if (reservas.containsKey(identificador)) {
            return reservas.get(identificador);
        } else {
            System.out.println("No se encontró ninguna reserva con el identificador: " + identificador);
            return null;
        }
    }

    // Método para eliminar una reserva por su identificador
    public void eliminarReserva(String identificador) {
        if (reservas.containsKey(identificador)) {
            reservas.remove(identificador);
            System.out.println("Reserva con ID " + identificador + " eliminada.");
        } else {
            System.out.println("No se encontró ninguna reserva con el identificador: " + identificador);
        }
    }

    // Método para mostrar todas las reservas y la cantidad total
    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            System.out.println("\nListado de Reservas:");
            for (Reserva reserva : reservas.values()) {
                System.out.println(reserva);
            }
            System.out.println("Total de reservas: " + reservas.size());
        }
    }

    // Método main para demostrar el funcionamiento del sistema
    public static void main(String[] args) {
        SistemaGestionReservas sistema = new SistemaGestionReservas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("\n--- Actividad Gestión de Reservas ----");
            System.out.println();
            System.out.println("1. Agregar Reserva");
            System.out.println("2. Obtener Reserva");
            System.out.println("3. Eliminar Reserva");
            System.out.println("4. Mostrar todas las Reservas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                System.out.println();
                    // Agregar reserva
                    System.out.print("Ingresa el identificador de la reserva: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingresa la fecha de la reserva: ");
                    String fecha = scanner.nextLine();
                    System.out.print("Ingresa el nombre del reservante: ");
                    String nombre = scanner.nextLine();
                    sistema.agregarReserva(id, fecha, nombre);
                    break;

                case 2:
                System.out.println();
                    // Obtener reserva
                    System.out.print("Ingresa el identificador de la reserva: ");
                    String idBusqueda = scanner.nextLine();
                    Reserva reserva = sistema.obtenerReserva(idBusqueda);
                    if (reserva != null) {
                        System.out.println("Reserva encontrada: " + reserva);
                    }
                    break;

                case 3:
                System.out.println();
                    // Eliminar reserva
                    System.out.print("Ingresa el identificador de la reserva a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    sistema.eliminarReserva(idEliminar);
                    break;

                case 4:
                System.out.println();
                    // Mostrar todas las reservas
                    sistema.mostrarReservas();
                    break;

                case 5:
                System.out.println();
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
