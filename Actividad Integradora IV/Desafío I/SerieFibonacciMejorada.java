import java.util.Scanner;

public class SerieFibonacciMejorada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n" +
                                "Ingresa la Posición en la Serie de Fibonacci o (Escribe 0 para Salir): ");
            int position = scanner.nextInt();

            if (position == 0) {
                System.out.println("Salisté del Programa.");
                break;
            }

            long fibonacciValue = fibonacci(position);
            System.out.println("El valor en la posición " + position + " de la serie de Fibonacci es: " + fibonacciValue);
        }

        scanner.close();
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long fib1 = 0;
        long fib2 = 1;
        long fibN = 1;

        for (int i = 2; i <= n; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }

        return fibN;
    }
}
