package RegistroDeEstudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiantes {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nGestión de Estudiantes");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar lista de estudiantes");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    eliminarEstudiante();
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    buscarEstudiantePorNombre();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 5.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Por favor ingresa un número entero válido.");
            scanner.next(); // Limpia la entrada no válida
        }
        return scanner.nextInt();
    }

    private static void agregarEstudiante() {
        System.out.print("Ingrese documento: ");
        String documento = scanner.next();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese edad: ");
        Integer edad = leerEntero();

        estudiantes.add(new Estudiante(documento, nombre, edad));
        System.out.println("Estudiante agregado.");
    }

    private static void eliminarEstudiante() {
        System.out.print("Ingrese documento del estudiante a eliminar: ");
        String documento = scanner.next();
        Estudiante estudianteAEliminar = null;

        for (Estudiante e : estudiantes) {
            if (e.getDocumento().equals(documento)) {
                estudianteAEliminar = e;
                break;
            }
        }

        if (estudianteAEliminar != null) {
            estudiantes.remove(estudianteAEliminar);
            System.out.println("Estudiante eliminado.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (Estudiante e : estudiantes) {
                System.out.println(e);
            }
        }
    }

    private static void buscarEstudiantePorNombre() {
        System.out.print("Ingrese nombre del estudiante a buscar: ");
        String nombre = scanner.next();
        boolean encontrado = false;

        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(e);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante no registrado.");
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
