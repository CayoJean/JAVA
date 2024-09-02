import java.util.Scanner;

public class DepurandoCalculadora {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            String opcion = scanner.nextLine();

            if (opcion.equals("5")) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            int numero1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            int numero2 = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case "1":
                    System.out.println("Resultado: " + sumar(numero1, numero2));
                    break;
                case "2":
                    System.out.println("Resultado: " + restar(numero1, numero2));
                    break;
                case "3":
                    System.out.println("Resultado: " + multiplicar(numero1, numero2));
                    break;
                case "4":
                    try {
                        System.out.println("Resultado: " + dividir(numero1, numero2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int restar(int a, int b) {
        return a - b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int dividir(int a, int b) {
        return a / b; // Puede lanzar ArithmeticException si b es 0
    }
}