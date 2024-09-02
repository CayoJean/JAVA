import java.util.Scanner;

public class TodasLasActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Actividad 1: Calculando el valor absoluto
            System.out.println("=== Calculando el valor absoluto ===");
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();
            int valorAbsoluto = Math.abs(numero);
            System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

            // Actividad 2: Redondeo de números
            System.out.println("\n=== Redondeo de números ===");
            System.out.print("Ingresa un número decimal: ");
            double numeroDecimal = scanner.nextDouble();
            long valorRedondeado = Math.round(numeroDecimal);
            System.out.println("El valor redondeado de " + numeroDecimal + " es: " + valorRedondeado);

            // Actividad 3: Generando números aleatorios
            System.out.println("\n=== Generando números aleatorios ===");
            double aleatorio = Math.random() * 355;
            int numeroAleatorio = (int) Math.floor(aleatorio) + 1;
            System.out.println("Número aleatorio generado en el rango de 1 a 355: " + numeroAleatorio);

            // Actividad 4: Calculando la potencia
            System.out.println("\n=== Calculando la potencia ===");
            System.out.print("Ingresa la base (número entero): ");
            int base = scanner.nextInt();
            System.out.print("Ingresa el exponente (número entero): ");
            int exponente = scanner.nextInt();
            double resultadoPotencia = Math.pow(base, exponente);
            int resultadoPotenciaEntero = (int) resultadoPotencia;
            System.out.println(base + " elevado a " + exponente + " es: " + resultadoPotenciaEntero);

            // Actividad 5: Calculando la raíz cuadrada
            System.out.println("\n=== Calculando la raíz cuadrada ===");
            System.out.print("Ingresa un número positivo: ");
            double numeroPositivo = scanner.nextDouble();
            if (numeroPositivo < 0) {
                System.out.println("El número ingresado es negativo. Por favor, ingresa un número positivo.");
            } else {
                double raizCuadrada = Math.sqrt(numeroPositivo);
                int raizCuadradaEntera = (int) raizCuadrada;
                System.out.println("La raíz cuadrada de " + numeroPositivo + " es: " + raizCuadradaEntera);
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
