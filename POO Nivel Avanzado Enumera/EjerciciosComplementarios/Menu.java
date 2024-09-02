package EjerciciosComplementarios;

// Menu.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println();
            System.out.println("\n" +
                                "--- Gestión de Estaciones del Año ---");
            System.out.println();
            System.out.println("1. Mostrar estaciones y meses correspondientes");
            System.out.println("2. Determinar estación por número de mes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                    System.out.println();
                        EstacionDelAño.imprimirEstaciones();
                        break;
                    case 2:
                        determinarEstacionPorMes();
                        break;
                    case 0:
                    System.out.println();
                        System.out.println("¡VUELE PRONTO! Saliste del Programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpiar el buffer en caso de entrada inválida
                opcion = -1;
            }

        } while (opcion != 0);
    }

    private void determinarEstacionPorMes() {
        System.out.println();
        System.out.print("Ingrese el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Número de mes no válido. Debe estar entre 1 y 12.");
            return;
        }

        Mes mesSeleccionado = null;
        for (Mes mes : Mes.values()) {
            if (mes.getNumero() == numeroMes) {
                mesSeleccionado = mes;
                break;
            }
        }

        if (mesSeleccionado != null) {
            System.out.println();
            Estacion estacion = EstacionDelAño.obtenerEstacion(mesSeleccionado);
            System.out.println("El mes " + mesSeleccionado + " corresponde a la estación " + estacion + ".");
        } else {
            System.out.println("Mes no encontrado.");
        }
    }
}
