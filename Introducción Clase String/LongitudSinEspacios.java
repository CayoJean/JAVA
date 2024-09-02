/*import java.util.Scanner;

public class LongitudSinEspacios {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una cadena de texto
            System.out.print("\n" +
                                "Ingresa una cadena de texto: ");
            String cadena = scanner.nextLine();

            // Eliminar los espacios en blanco de la cadena
            String cadenaSinEspacios = cadena.replace(" ", "");

            // Calcular la longitud de la cadena sin espacios
            int longitudSinEspacios = cadenaSinEspacios.length();

            // Mostrar la longitud en pantalla
            System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
*/



import java.util.Scanner;

public class LongitudSinEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== Calculando la Longitud de Cadenas sin Espacios ===");
            System.out.print("Ingresa una cadena de texto: ");
            String cadena = scanner.nextLine();
            
            String cadenaSinEspacios = cadena.replace(" ", "");
            int longitudSinEspacios = cadenaSinEspacios.length();
            
            System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);
        } finally {
            scanner.close();
        }
    }
}
