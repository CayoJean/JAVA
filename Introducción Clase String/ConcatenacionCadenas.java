import java.util.Scanner;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese su nombre
            System.out.print("\n" +
                                "Ingresa tu nombre: ");
            String nombre = scanner.nextLine();

            // Pedir al usuario que ingrese su apellido
            System.out.print("\n" +
                                "Ingresa tu apellido: ");
            String apellido = scanner.nextLine();

            // Concatenar el nombre y el apellido utilizando el método concat()
            String nombreCompleto = nombre.concat(" ").concat(apellido);

            // Mostrar el nombre completo en pantalla
            System.out.println("\n" +
                                "Tu nombre completo es: " + nombreCompleto);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
