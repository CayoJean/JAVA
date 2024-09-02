/*import java.util.Scanner;

public class PrimeNumbersGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" +
                        "Ingresa la cantidad de números primos que deseas obtener: ");
        int count = scanner.nextInt();

        generatePrimes(count);

        scanner.close();
    }

    public static void generatePrimes(int count) {
        int numPrimesFound = 0;
        int number = 2;

        while (numPrimesFound < count) {
            if (isPrime(number)) {
                System.out.println(number);
                numPrimesFound++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; 
        }
        if (num % 2 == 0) {
            return false; 
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}*/




import java.util.Scanner;

public class DOSNúmerosPrimosPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n" +
                                "Ingresa la Cantidad de Números Primos que Deseas Obtener o (Escribe 0 para Salir): ");
            int count = scanner.nextInt();

            if (count == 0) {
                System.out.println("Salisté del Programa.");
                break;
            }

            generatePrimes(count);
        }

        scanner.close();
    }

    public static void generatePrimes(int count) {
        int numPrimesFound = 0;
        int number = 2;

        while (numPrimesFound < count) {
            if (isPrime(number)) {
                System.out.println(number);
                numPrimesFound++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false; 
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
