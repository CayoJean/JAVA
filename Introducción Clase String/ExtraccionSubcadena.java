import java.util.Scanner;

public class ExtraccionSubcadena {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una frase
            System.out.print("\n" +
                                "Ingresa una frase: ");
            String frase = scanner.nextLine();

            // Pedir al usuario que ingrese el índice inicial
            System.out.print("Ingresa el índice inicial: ");
            int indiceInicial = scanner.nextInt();

            // Pedir al usuario que ingrese el índice final
            System.out.print("Ingresa el índice final: ");
            int indiceFinal = scanner.nextInt();

            // Validar los índices para asegurar que sean válidos
            if (indiceInicial < 0 || indiceFinal > frase.length() || indiceInicial >= indiceFinal) {
                System.out.println("Los índices ingresados no son válidos.");
            } else {
                // Extraer la subcadena utilizando el método substring()
                String subcadena = frase.substring(indiceInicial, indiceFinal);

                // Mostrar la subcadena en pantalla
                System.out.println("La subcadena es: " + subcadena);
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
