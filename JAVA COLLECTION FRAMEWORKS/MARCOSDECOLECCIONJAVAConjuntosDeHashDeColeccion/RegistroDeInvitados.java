/*import java.util.HashSet;
import java.util.Scanner;

public class RegistroDeInvitados {

    private HashSet<String> invitados;

    // Constructor
    public RegistroDeInvitados() {
        this.invitados = new HashSet<>();
    }

    // Método para agregar un invitado solo si el nombre contiene letras
    public void agregarInvitado(String nombre) {
        if (esAlfabetico(nombre)) {
            String nombreFormateado = formatearNombre(nombre);
            if (invitados.add(nombreFormateado)) {
                System.out.println("Invitado \"" + nombreFormateado + "\" agregado con éxito.");
            } else {
                System.out.println("El invitado \"" + nombreFormateado + "\" ya está en la lista.");
            }
        } else {
            System.out.println("Error: Solo se permiten letras.");
        }
    }

    // Método para eliminar un invitado solo si el nombre contiene letras
    public void eliminarInvitado(String nombre) {
        if (esAlfabetico(nombre)) {
            String nombreFormateado = formatearNombre(nombre);
            if (invitados.remove(nombreFormateado)) {
                System.out.println("Invitado \"" + nombreFormateado + "\" eliminado con éxito.");
            } else {
                System.out.println("El invitado \"" + nombreFormateado + "\" no está en la lista.");
            }
        } else {
            System.out.println("Error: Solo se permiten letras.");
        }
    }

    // Método para mostrar la lista de invitados
    public void mostrarInvitados() {
        if (invitados.isEmpty()) {
            System.out.println("La lista de invitados está vacía.");
        } else {
            System.out.println("Lista de invitados:");
            for (String invitado : invitados) {
                System.out.println("\"" + invitado + "\"");
            }
        }
    }

    // Método para formatear el nombre (eliminar espacios extras)
    private String formatearNombre(String nombre) {
        return nombre.trim();
    }

    // Método para verificar si el nombre contiene solo letras
    private boolean esAlfabetico(String nombre) {
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+");  // Verifica si contiene solo letras y espacios
    }

    // Método para verificar que una entrada es numérica
    private boolean esOpcionValida(String opcion) {
        return opcion.matches("\\d+");  // Verifica si la opción es un número
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroDeInvitados registro = new RegistroDeInvitados();
        String opcion;

        do {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine(); // Se recibe como cadena para poder validar

            if (!registro.esOpcionValida(opcion)) {
                System.out.println("Error: Debe ingresar un número válido.");
                continue;  // Vuelve al inicio del bucle si la entrada no es válida
            }

            switch (Integer.parseInt(opcion)) {
                case 1:
                    System.out.print("Ingrese el nombre del invitado: ");
                    String nombreAgregar = scanner.nextLine();
                    registro.agregarInvitado(nombreAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del invitado a eliminar (solo letras): ");
                    String nombreEliminar = scanner.nextLine();
                    registro.eliminarInvitado(nombreEliminar);
                    break;
                case 3:
                    registro.mostrarInvitados();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("0"));

        scanner.close();
    }
}
*/






import java.util.HashSet;
import java.util.Scanner;

public class RegistroDeInvitados {

    private HashSet<String> invitados;

    // Constructor
    public RegistroDeInvitados() {
        this.invitados = new HashSet<>();
    }

    // Método para agregar un invitado solo si el nombre contiene letras
    public void agregarInvitado(String nombre) {
        if (esAlfabetico(nombre)) {
            String nombreFormateado = formatearNombre(nombre);
            if (invitados.add(nombreFormateado)) {
                System.out.println("Invitado \"" + nombreFormateado + "\" agregado con éxito.");
            } else {
                System.out.println("El invitado \"" + nombreFormateado + "\" ya está en la lista.");
            }
        } else {
            System.out.println("Error: Solo se permiten letras.");
        }
    }

    // Método para eliminar un invitado sin importar si está en minúsculas o mayúsculas
    public void eliminarInvitado(String nombre) {
        if (esAlfabetico(nombre)) {
            String nombreFormateado = formatearNombre(nombre);
            boolean eliminado = false;
            for (String invitado : invitados) {
                if (invitado.equalsIgnoreCase(nombreFormateado)) {
                    invitados.remove(invitado);
                    System.out.println("Invitado \"" + invitado + "\" eliminado con éxito.");
                    eliminado = true;
                    break;
                }
            }
            if (!eliminado) {
                System.out.println("El invitado \"" + nombreFormateado + "\" no está en la lista.");
            }
        } else {
            System.out.println("Error: Solo se permiten letras.");
        }
    }

    // Método para mostrar la lista de invitados
    public void mostrarInvitados() {
        if (invitados.isEmpty()) {
            System.out.println("La lista de invitados está vacía.");
        } else {
            System.out.println();
            System.out.println("Lista de invitados:");
            for (String invitado : invitados) {
                System.out.println("\"" + invitado + "\"");
            }
        }
    }

    // Método para formatear el nombre (eliminar espacios extras y convertir a minúsculas)
    private String formatearNombre(String nombre) {
        return nombre.trim().toLowerCase();
    }

    // Método para verificar si el nombre contiene solo letras
    private boolean esAlfabetico(String nombre) {
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+");  // Verifica si contiene solo letras y espacios
    }

    // Método para verificar que una entrada es numérica
    private boolean esOpcionValida(String opcion) {
        return opcion.matches("\\d+");  // Verifica si la opción es un número
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroDeInvitados registro = new RegistroDeInvitados();
        String opcion;

        do {
            System.out.println();
            System.out.println("\n---- Actividad: Lista de invitados ----");
            System.out.println();
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine(); // Se recibe como cadena para poder validar

            if (!registro.esOpcionValida(opcion)) {
                System.out.println("Error: Debe ingresar un número válido.");
                continue;  // Vuelve al inicio del bucle si la entrada no es válida
            }

            switch (Integer.parseInt(opcion)) {
                case 1:
                System.out.println();
                    System.out.print("Ingrese el nombre del invitado (solo letras): ");
                    String nombreAgregar = scanner.nextLine();
                    registro.agregarInvitado(nombreAgregar);
                    break;
                case 2:
                System.out.println();
                    System.out.print("Ingrese el nombre del invitado a eliminar (solo letras): ");
                    String nombreEliminar = scanner.nextLine();
                    registro.eliminarInvitado(nombreEliminar);
                    break;
                case 3:
                    registro.mostrarInvitados();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("0"));

        scanner.close();
    }
}
