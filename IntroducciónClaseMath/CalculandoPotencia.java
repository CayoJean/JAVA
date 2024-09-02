import java.util.Scanner;

public class CalculandoPotencia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese la base
            System.out.print("\n" +
                                "Ingresa la base (número entero): ");
            int base = scanner.nextInt();

            // Pedir al usuario que ingrese el exponente
            System.out.print("Ingresa el exponente (número entero): ");
            int exponente = scanner.nextInt();

            // Calcular la potencia utilizando el método pow() de la clase Math
            double resultado = Math.pow(base, exponente);

            // Convertir el resultado a entero
            int resultadoEntero = (int) resultado;

            // Mostrar el resultado en pantalla
            System.out.println(base + " elevado a " + exponente + " es: " + resultadoEntero);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
