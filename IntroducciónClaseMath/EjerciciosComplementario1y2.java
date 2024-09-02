import java.util.Scanner;

public class EjerciciosComplementario1y2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Actividad 1: Generando un número aleatorio entre dos límites
            System.out.println("\n" +
                                "=== Generando un número aleatorio entre dos límites ===");
            System.out.print("Ingresa el límite inferior (número entero): ");
            int limiteInferior = scanner.nextInt();
            System.out.print("Ingresa el límite superior (número entero): ");
            int limiteSuperior = scanner.nextInt();
            int numeroAleatorio1 = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
            System.out.println("Número aleatorio generado entre " + limiteInferior + " y " + limiteSuperior + ": " + numeroAleatorio1);

            // Actividad 2: Generación aleatoria y análisis de raíz cuadrada
            System.out.println("\n=== Generación aleatoria y análisis de raíz cuadrada ===");
            System.out.print("Ingresa un número entre 1 y 30: ");
            int numeroLimite = scanner.nextInt();
            if (numeroLimite < 1 || numeroLimite > 30) {
                System.out.println("El número ingresado no está en el rango permitido.");
                return;
            }
            int numeroAleatorio2 = (int) (Math.random() * numeroLimite) + 1;
            double raizCuadrada = Math.sqrt(numeroAleatorio2);
            boolean esPrimo = esNumeroPrimo(numeroAleatorio2);
            System.out.println("Número aleatorio generado: " + numeroAleatorio2);
            System.out.println("Raíz cuadrada de " + numeroAleatorio2 + ": " + raizCuadrada);
            if (esPrimo) {
                System.out.println("El número " + numeroAleatorio2 + " es primo.");
            } else {
                System.out.println("El número " + numeroAleatorio2 + " no es primo.");
            }
        } finally {
            scanner.close();
        }
    }

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
