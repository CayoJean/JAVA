import java.util.Scanner;

public class DOSCreandoUnGráficoDeBarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        // Solicita al usuario ingresar 4 números entre 1 y 20
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                System.out.print("\n" +
                                        "Ingresa el Número " + (i + 1) + " (Entre 1 y 20): ");
                int input = scanner.nextInt();

                if (input >= 1 && input <= 20) {
                    numbers[i] = input;
                    break;
                } else {
                    System.out.println("Número Inválido. Por Favor Ingresa un Número Entre 1 y 20.");
                }
            }
        }

        // Imprime el gráfico de barras
        printBarGraph(numbers);

        scanner.close();
    }

    public static void printBarGraph(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
