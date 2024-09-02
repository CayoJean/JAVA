import java.util.Scanner;

public class EjerciciosComplementarios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese un número entre 1 y 30
            System.out.print("Ingresa un número entre 1 y 30: ");
            int numeroLimite = scanner.nextInt();

            // Validar que el número ingresado esté en el rango permitido
            if (numeroLimite < 1 || numeroLimite > 30) {
                System.out.println("El número ingresado no está en el rango permitido.");
                return;
            }

            // Generar un número aleatorio entre 1 y numeroLimite
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;

            // Calcular la raíz cuadrada del número aleatorio generado
            double raizCuadrada = Math.sqrt(numeroAleatorio);

            // Verificar si el número aleatorio generado es primo
            boolean esPrimo = esNumeroPrimo(numeroAleatorio);

            // Mostrar el resultado en pantalla
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
            System.out.println("Raíz cuadrada de " + numeroAleatorio + ": " + raizCuadrada);
            if (esPrimo) {
                System.out.println("El número " + numeroAleatorio + " es primo.");
            } else {
                System.out.println("El número " + numeroAleatorio + " no es primo.");
            }
        } finally {
            scanner.close();
        }
    }

    // Método para verificar si un número es primo
    private static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
