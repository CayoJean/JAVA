import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println();
            // Menú para elegir la figura geométrica
            System.out.println("\n" +
                                "Elige una figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Paralelogramo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcionFigura = scanner.nextInt();

            if (opcionFigura == 0) {
                break; // Salir del programa
            }

            // Menú para elegir qué calcular
            System.out.println("Elige qué calcular:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Opción: ");
            int opcionCalculo = scanner.nextInt();

            switch (opcionFigura) {
                case 1: // Círculo
                    calcularCirculo(opcionCalculo, scanner);
                    break;
                case 2: // Triángulo
                    calcularTriangulo(opcionCalculo, scanner);
                    break;
                case 3: // Paralelogramo
                    calcularParalelogramo(opcionCalculo, scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una figura válida.");
                    break;
            }

            System.out.println(); // Línea en blanco para separar las iteraciones
        }

        scanner.close();
    }

    public static void calcularCirculo(int opcionCalculo, Scanner scanner) {
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        if (opcionCalculo == 1) { // Calcular área
            int area = (int) (Math.PI * Math.pow(radio, 2));
            System.out.println("Área del círculo: " + area);
        } else if (opcionCalculo == 2) { // Calcular perímetro
            int perimetro = (int) (2 * Math.PI * radio);
            System.out.println("Perímetro del círculo: " + perimetro);
        } else {
            System.out.println("Opción no válida. Por favor, elige entre calcular el área o el perímetro.");
        }
    }

    public static void calcularTriangulo(int opcionCalculo, Scanner scanner) {
        if (opcionCalculo == 1) { // Calcular área
            System.out.print("Ingresa la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingresa la altura del triángulo: ");
            double altura = scanner.nextDouble();
            int area = (int) ((base * altura) / 2);
            System.out.println("Área del triángulo: " + area);
        } else if (opcionCalculo == 2) { // Calcular perímetro
            System.out.print("Ingresa la longitud del lado a: ");
            double a = scanner.nextDouble();
            System.out.print("Ingresa la longitud del lado b: ");
            double b = scanner.nextDouble();
            System.out.print("Ingresa la longitud del lado c: ");
            double c = scanner.nextDouble();
            int perimetro = (int) (a + b + c);
            System.out.println("Perímetro del triángulo: " + perimetro);
        } else {
            System.out.println("Opción no válida. Por favor, elige entre calcular el área o el perímetro.");
        }
    }

    public static void calcularParalelogramo(int opcionCalculo, Scanner scanner) {
        if (opcionCalculo == 1) { // Calcular área
            System.out.print("Ingresa la base del paralelogramo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingresa la altura del paralelogramo: ");
            double altura = scanner.nextDouble();
            int area = (int) (base * altura);
            System.out.println("Área del paralelogramo: " + area);
        } else if (opcionCalculo == 2) { // Calcular perímetro
            System.out.print("Ingresa la longitud del lado a: ");
            double a = scanner.nextDouble();
            System.out.print("Ingresa la longitud del lado b: ");
            double b = scanner.nextDouble();
            int perimetro = (int) (2 * (a + b));
            System.out.println("Perímetro del paralelogramo: " + perimetro);
        } else {
            System.out.println("Opción no válida. Por favor, elige entre calcular el área o el perímetro.");
        }
    }
}
