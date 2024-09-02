import java.util.Scanner;

public class SeleccióndeOpción {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" +
                        "Menú de Opciones:");
        System.out.println("1: Guardar");
        System.out.println("2: Cargar");
        System.out.println("3: Salir");
        System.out.print("Selecciona una opción (1-3): ");
        
        int opcion = scanner.nextInt();
        String mensaje = "";

        switch (opcion) {
            case 1:
                mensaje = "Opción seleccionada: Guardar";
                break;
            case 2:
                mensaje = "Opción seleccionada: Cargar";
                break;
            case 3:
                mensaje = "Opción seleccionada: Salir";
                break;
            default:
                mensaje = "Opción inválida. Por favor ingresa un número del 1 al 3.";
                break;
        }

        System.out.println(mensaje);
        scanner.close();
    }
}
