/*import java.util.Scanner;

public class CálculoDelFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        long factorial;

        do {
            System.out.print("\n" +
                                "Ingresa un número positivo para calcular su factorial (o un número negativo para salir): ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Número negativo ingresado. Salisté del programa.");
                break;
            }

            factorial = 1;
            int i = 1;

            do {
                factorial *= i;
                i++;
            } while (i <= number);

            System.out.println("El factorial de " + number + " es: " + factorial);

        } while (number >= 0);

        scanner.close();
    }
}*/





import java.util.Scanner;

public class CálculoDelFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        long factorial;

        do {
            System.out.print("\n" +
                                "Ingresa un Número Positivo para Calcular su Factorial o (Escribe 0 para Salir): ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Salisté del Programa.");
                break;
            }

            factorial = 1;
            int i = 1;
            StringBuilder calculationSteps = new StringBuilder("1");

            while (i <= number) {
                if (i > 1) {
                    calculationSteps.append(" * ").append(i);
                }
                factorial *= i;
                i++;
            }

            System.out.println("El Factorial del Número " + number + " se obtiene multiplicando " + calculationSteps.toString() + ", dando como resultado: " + factorial + ".");

        } while (number >= 0);

        scanner.close();
    }
}
