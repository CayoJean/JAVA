import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import modelos.Empleado;
import modelos.MetodosEmpleado;

public class Application {

    private static List<Empleado> empleados = new ArrayList<>();
    private static List<Empleado> empleadosOriginales = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Empleados de ejemplo (puedes eliminarlos después de probar)
        empleados.add(new Empleado("Cayo", 30, 2500.50, "San Martín"));
        empleados.add(new Empleado("Jean", 40, 3000.00, "Lima"));
        empleados.add(new Empleado("Erick", 28, 2000.75, "Puno"));
        empleadosOriginales.addAll(empleados);  // Guarda la versión original

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Crear empleado");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Incrementar salario");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    MetodosEmpleado.mostrarTodosLosEmpleados(empleados.toArray(new Empleado[0]));
                    break;
                case 2:
                    crearEmpleado(scanner);
                    break;
                case 3:
                    filtrarEmpleados(scanner);
                    break;
                case 4:
                    ordenarEmpleados(scanner);
                    break;
                case 5:
                    incrementarSalario(scanner);
                    break;
                case 6:
                    limpiarFiltros();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void crearEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        // Validar si ya existe un empleado con el mismo nombre
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Error: Ya existe un empleado con ese nombre.");
                return;
            }
        }

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();  // Consumir el salto de línea

        System.out.print("Ingrese el departamento del empleado: ");
        String departamento = scanner.nextLine();

        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario, departamento);
        empleados.add(nuevoEmpleado);
        empleadosOriginales.add(nuevoEmpleado);  // Agrega a la lista original
        System.out.println("Empleado creado exitosamente.");
    }

    private static void filtrarEmpleados(Scanner scanner) {
        System.out.println("Seleccione el atributo por el cual desea filtrar:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        String atributo = "";
        String valorString = "";
        double min = 0, max = 0;

        switch (opcion) {
            case 1:
                atributo = "nombre";
                System.out.print("Ingrese el nombre a filtrar: ");
                valorString = scanner.nextLine();
                break;
            case 2:
                atributo = "edad";
                System.out.print("Ingrese la edad mínima: ");
                min = scanner.nextDouble();
                System.out.print("Ingrese la edad máxima: ");
                max = scanner.nextDouble();
                break;
            case 3:
                atributo = "salario";
                System.out.print("Ingrese el salario mínimo: ");
                min = scanner.nextDouble();
                System.out.print("Ingrese el salario máximo: ");
                max = scanner.nextDouble();
                break;
            case 4:
                atributo = "departamento";
                System.out.print("Ingrese el departamento a filtrar: ");
                valorString = scanner.nextLine();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        empleados = List.of(MetodosEmpleado.filtrarEmpleados(empleados.toArray(new Empleado[0]), atributo, valorString, min, max));
        System.out.println("Empleados filtrados:");
        MetodosEmpleado.mostrarTodosLosEmpleados(empleados.toArray(new Empleado[0]));
    }

    private static void ordenarEmpleados(Scanner scanner) {
        System.out.println("Seleccione el atributo por el cual desea ordenar:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        String atributo = "";

        switch (opcion) {
            case 1:
                atributo = "nombre";
                break;
            case 2:
                atributo = "edad";
                break;
            case 3:
                atributo = "salario";
                break;
            case 4:
                atributo = "departamento";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        empleados = List.of(MetodosEmpleado.ordenarEmpleados(empleados.toArray(new Empleado[0]), atributo));
        System.out.println("Empleados ordenados:");
        MetodosEmpleado.mostrarTodosLosEmpleados(empleados.toArray(new Empleado[0]));
    }

    private static void incrementarSalario(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        Empleado empleado = MetodosEmpleado.buscarPorNombre(empleados.toArray(new Empleado[0]), nombre);
        if (empleado == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        System.out.print("Ingrese el porcentaje de aumento: ");
        double porcentaje = scanner.nextDouble();

        MetodosEmpleado.incrementarSalario(empleado, porcentaje);
        System.out.println("Salario actualizado para " + empleado.getNombre() + ": " + empleado.getSalario());
    }

    private static void limpiarFiltros() {
        empleados = new ArrayList<>(empleadosOriginales);  // Restaura la lista original
        System.out.println("Filtros limpiados. Todos los empleados restaurados.");
    }
}
