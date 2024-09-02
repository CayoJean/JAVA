import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una cadena de texto
            System.out.print("\n" +
                                "Ingresa una cadena de texto: ");
            String cadena = scanner.nextLine();

            // Calcular la longitud de la cadena
            int longitud = cadena.length();

            // Mostrar la longitud de la cadena en pantalla
            System.out.println("La longitud de la cadena es: " + longitud);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
