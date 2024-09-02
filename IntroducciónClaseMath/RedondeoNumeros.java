import java.util.Scanner;

public class RedondeoNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese un número decimal
            System.out.print("\n" +
                                "Ingresa un número decimal: ");
            double numeroDecimal = scanner.nextDouble();

            // Calcular el valor redondeado utilizando el método round() de la clase Math
            long valorRedondeado = Math.round(numeroDecimal);

            // Mostrar el valor redondeado en pantalla
            System.out.println("El valor redondeado de " + numeroDecimal + " es: " + valorRedondeado);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}