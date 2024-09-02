/*import java.util.Scanner;
import java.util.ArrayList;

public class RegistroAlumnos {
    // ArrayList para almacenar los nombres de los alumnos
    private static ArrayList<String> nombres = new ArrayList<>();
    // ArrayList para almacenar las notas de los alumnos
    private static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción del usuario
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un número: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarAlumno(scanner);
                    break;
                case 2:
                    mostrarAlumnos();
                    break;
                case 3:
                    mostrarPromedioNotas();
                    break;
                case 4:
                    buscarAlumno(scanner);
                    break;
                case 5:
                    modificarNota(scanner);
                    break;
                case 6:
                    eliminarAlumno(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void registrarAlumno(Scanner scanner) {
        System.out.print("Ingresa el nombre del alumno: ");
        String nombre = scanner.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        System.out.print("Ingresa la nota del alumno (0.00 - 10.00): ");
        double nota = -1;
        try {
            nota = scanner.nextDouble();
            if (nota < 0.00 || nota > 10.00) {
                System.out.println("La nota debe estar entre 0.00 y 10.00.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingresa un número válido.");
            scanner.nextLine(); // Limpiar el buffer
            return;
        }

        nombres.add(nombre);
        notas.add(nota);
        System.out.println("Alumno registrado exitosamente.");
    }

    private static void mostrarAlumnos() {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        System.out.println("Lista de alumnos:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("%d. %s - %.2f\n", i + 1, nombres.get(i), notas.get(i));
        }
    }

    private static void mostrarPromedioNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.size();
        System.out.printf("El promedio de notas es: %.2f\n", promedio);
    }

    private static void buscarAlumno(Scanner scanner) {
        System.out.print("Ingresa el nombre del alumno a buscar: ");
        String nombre = scanner.nextLine().trim();
        int index = nombres.indexOf(nombre);
        if (index != -1) {
            System.out.printf("La nota de %s es: %.2f\n", nombre, notas.get(index));
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void modificarNota(Scanner scanner) {
        System.out.print("Ingresa el nombre del alumno cuya nota deseas modificar: ");
        String nombre = scanner.nextLine().trim();
        int index = nombres.indexOf(nombre);
        if (index != -1) {
            System.out.print("Ingresa la nueva nota (0.00 - 10.00): ");
            double nuevaNota = -1;
            try {
                nuevaNota = scanner.nextDouble();
                if (nuevaNota < 0.00 || nuevaNota > 10.00) {
                    System.out.println("La nota debe estar entre 0.00 y 10.00.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número válido.");
                scanner.nextLine(); // Limpiar el buffer
                return;
            }
            notas.set(index, nuevaNota);
            System.out.println("Nota modificada exitosamente.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void eliminarAlumno(Scanner scanner) {
        System.out.print("Ingresa el nombre del alumno a eliminar: ");
        String nombre = scanner.nextLine().trim();
        int index = nombres.indexOf(nombre);
        if (index != -1) {
            nombres.remove(index);
            notas.remove(index);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
*/






import java.util.Scanner;
import java.util.ArrayList;

public class RegistroAlumnos {
    private static ArrayList<String> nombres = new ArrayList<>();
    private static ArrayList<Integer> notas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        // Primer menú de opciones
        while (continuar) {
            System.out.println();
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Registrar Alumno(a)");
            System.out.println("2. Salir");
            System.out.print("Elige Una Opción: ");

            int opcion = obtenerOpcion(scanner, 2);

            switch (opcion) {
                case 1:
                    registrarAlumno(scanner);
                    mostrarSegundoMenu(scanner);
                    continuar = false;
                    break;
                case 2:
                    System.out.println("Saliste del Programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no Válida. Por Favor, Elige una Opción del Menú.");
            }
        }
        scanner.close();
    }

    // Segundo menú de opciones
    private static void mostrarSegundoMenu(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Mostrar Todos los Alumnos(as)");
            System.out.println("3. Mostrar Promedio de Notas");
            System.out.println("4. Buscar Alumno(a) por Nombre");
            System.out.println("5. Modificar Nota por Nombre");
            System.out.println("6. Eliminar Alumno(a) por Nombre");
            System.out.println("7. Salir");
            System.out.print("Elige Una Opción: ");

            opcion = obtenerOpcion(scanner, 7);

            switch (opcion) {
                case 1:
                    registrarAlumno(scanner);
                    break;
                case 2:
                    mostrarAlumnos();
                    break;
                case 3:
                    mostrarPromedioNotas();
                    break;
                case 4:
                    buscarAlumno(scanner);
                    break;
                case 5:
                    modificarNota(scanner);
                    break;
                case 6:
                    eliminarAlumno(scanner);
                    break;
                case 7:
                    System.out.println("Saliste del Programa...");
                    break;
                default:
                    System.out.println("Opción no Válida. Por Favor, Elige una Opción del Menú.");
            }
        } while (opcion != 7);
    }

    private static int obtenerOpcion(Scanner scanner, int maxOpcion) {
        int opcion;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Por Favor, Ingresa un Número: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            if (opcion >= 1 && opcion <= maxOpcion) {
                break;
            } else {
                System.out.print("Opción no Válida. Por Favor, Ingresa un Número Entre 1 y " + maxOpcion + ": ");
            }
        }
        return opcion;
    }

    private static void registrarAlumno(Scanner scanner) {
        System.out.print("Ingresa el Nombre del Alumno(a): ");
        String nombre = scanner.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("El Nombre no Puede Estar Vacío.");
            return;
        }

        System.out.print("Ingresa la Nota del Alumno(a) (0 - 10): ");
        int nota = -1;
        try {
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("La Nota Debe Estar Entre 0 y 10.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Entrada Inválida. Por Favor, Ingresa un Número Válido.");
            scanner.nextLine(); // Limpiar el buffer
            return;
        }

        nombres.add(nombre);
        notas.add(nota);
        System.out.println("Alumno(a) Registrado Exitosamente.");
    }

    private static void mostrarAlumnos() {
        if (nombres.isEmpty()) {
            System.out.println("No hay Alumnos(as) Registrados.");
            return;
        }
        System.out.println("Lista de Alumnos(as):");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("%d. %s - %d\n", i + 1, nombres.get(i), notas.get(i));
        }
    }

    private static void mostrarPromedioNotas() {
        if (notas.isEmpty()) {
            System.out.println("No Hay Notas Registradas.");
            return;
        }
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / notas.size();
        System.out.printf("El Promedio de Notas es: %.2f\n", promedio);
    }

    private static void buscarAlumno(Scanner scanner) {
        System.out.print("Ingresa el Nombre del Alumno(a) a Buscar: ");
        String nombre = scanner.nextLine().trim();
        int index = nombres.indexOf(nombre);
        if (index != -1) {
            System.out.printf("La Nota de %s es: %d\n", nombre, notas.get(index));
        } else {
            System.out.println("Alumno No Encontrado.");
        }
    }

    private static void modificarNota(Scanner scanner) {
        System.out.print("Ingresa el Nombre del Alumno(a) cuya Nota Deseas Modificar: ");
        String nombre = scanner.nextLine().trim();
        int index = nombres.indexOf(nombre);
        if (index != -1) {
            System.out.print("Ingresa la Nueva Nota (0 - 10): ");
            int nuevaNota = -1;
            try {
                nuevaNota = scanner.nextInt();
                if (nuevaNota < 0 || nuevaNota > 10) {
                    System.out.println("La Nota Debe Estar Entre 0 y 10.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Entrada Inválida. Por Favor, Ingresa un Número Válido.");
                scanner.nextLine(); // Limpiar el buffer
                return;
            }
            notas.set(index, nuevaNota);
            System.out.println("Nota Modificada Exitosamente.");
        } else {
            System.out.println("Alumno(a) No Encontrado.");
        }
    }

    private static void eliminarAlumno(Scanner scanner) {
        System.out.print("Ingresa el Nombre del Alumno(a) a Eliminar: ");
        String nombre = scanner.nextLine().trim();
        int index = nombres.indexOf(nombre);
        if (index != -1) {
            nombres.remove(index);
            notas.remove(index);
            System.out.println("Alumno(a) Eliminado Exitosamente.");
        } else {
            System.out.println("Alumno(a) No Encontrado.");
        }
    }
}

