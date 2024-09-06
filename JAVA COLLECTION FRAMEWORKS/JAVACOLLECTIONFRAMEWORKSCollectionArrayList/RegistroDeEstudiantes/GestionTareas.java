package RegistroDeEstudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionTareas {
    private static ArrayList<Tarea> tareas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nGestión de Tareas Pendientes");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar lista de tareas pendientes");
            System.out.println("5. Mostrar lista de tareas completadas");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    marcarTareaComoCompletada();
                    break;
                case 3:
                    eliminarTarea();
                    break;
                case 4:
                    mostrarTareasPendientes();
                    break;
                case 5:
                    mostrarTareasCompletadas();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 6.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Por favor ingresa un número entero válido.");
            scanner.next(); // Limpia la entrada no válida
        }
        return scanner.nextInt();
    }

    private static void agregarTarea() {
        System.out.print("Ingrese descripción de la tarea: ");
        scanner.nextLine(); // Limpiar buffer
        String descripcion = scanner.nextLine();
        tareas.add(new Tarea(descripcion));
        System.out.println("Tarea agregada.");
    }

    private static void marcarTareaComoCompletada() {
        System.out.print("Ingrese ID de la tarea a completar: ");
        int idTarea = leerEntero();
        boolean encontrada = false;

        for (Tarea t : tareas) {
            if (t.getIdTarea() == idTarea) {
                t.marcarComoCompletada();
                System.out.println("Tarea marcada como completada.");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void eliminarTarea() {
        System.out.print("Ingrese ID de la tarea a eliminar: ");
        int idTarea = leerEntero();
        boolean eliminada = false;

        for (Tarea t : tareas) {
            if (t.getIdTarea() == idTarea) {
                tareas.remove(t);
                System.out.println("Tarea eliminada.");
                eliminada = true;
                break;
            }
        }

        if (!eliminada) {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void mostrarTareasPendientes() {
        System.out.println("Lista de tareas pendientes:");
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                System.out.println(t);
            }
        }
    }

    private static void mostrarTareasCompletadas() {
        System.out.println("Lista de tareas completadas:");
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                System.out.println(t);
            }
        }
    }

    private static Integer leerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Por favor ingresa un número entero válido.");
            scanner.next(); // Limpia la entrada no válida
        }
        return scanner.nextInt();
    }
}
