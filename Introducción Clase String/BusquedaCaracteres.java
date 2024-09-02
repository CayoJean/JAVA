import java.util.Scanner;

public class BusquedaCaracteres {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una palabra
            System.out.print("\n" +
                                "Ingresa una palabra: ");
            String palabra = scanner.nextLine();

            // Pedir al usuario que ingrese un carácter
            System.out.print("Ingresa un carácter: ");
            char caracter = scanner.next().charAt(0);

            // Determinar si el carácter se encuentra en la palabra
            int indice = palabra.indexOf(caracter);

            // Mostrar un mensaje adecuado en pantalla
            if (indice == -1) {
                System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
            } else {
                System.out.println("El carácter '" + caracter + "' se encuentra en la palabra en la posición " + indice + ".");
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
