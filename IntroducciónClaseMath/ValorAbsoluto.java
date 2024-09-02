import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese un número entero
            System.out.print("\n" +
                                "Ingresa un número entero: ");
            int numero = scanner.nextInt();

            // Calcular el valor absoluto utilizando el método abs() de la clase Math
            int valorAbsoluto = Math.abs(numero);

            // Mostrar el valor absoluto en pantalla
            System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
