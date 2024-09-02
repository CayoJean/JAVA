import java.util.Scanner;

public class ConversionMayusculasMinusculas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una cadena de texto
            System.out.print("\n" +
                                "Ingresa una cadena de texto: ");
            String cadena = scanner.nextLine();

            // Convertir la cadena a mayúsculas y minúsculas
            String cadenaMayusculas = cadena.toUpperCase();
            String cadenaMinusculas = cadena.toLowerCase();

            // Mostrar la cadena en mayúsculas y minúsculas en pantalla
            System.out.println("La cadena en mayúsculas es: " + cadenaMayusculas);
            System.out.println("La cadena en minúsculas es: " + cadenaMinusculas);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
