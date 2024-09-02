import java.util.Scanner;

public class SeleccióndeFiguraGeométrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" +
                        "Selecciona una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triángulo");
        System.out.print("Ingresa un número (1-3): ");

        int opcion = scanner.nextInt();
        double area = 0;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.print("Ingresa la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida. Por favor ingresa un número del 1 al 3.");
                break;
        }

        scanner.close();
    }
}