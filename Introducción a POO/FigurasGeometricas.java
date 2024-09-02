import Modelos.Rectangulo;
import Modelos.Triangulo;
import Modelos.Circulo;
import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Figuras Geométricas:");
            System.out.println("1. Crear Rectángulo");
            System.out.println("2. Crear Triángulo");
            System.out.println("3. Crear Círculo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el Ancho del Rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el Alto del Rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    rectangulo.imprimirDatos();
                    break;
                case 2:
                    System.out.print("Ingrese la Base del Triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la Altura del Triángulo: ");
                    double altura = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);
                    triangulo.imprimirDatos();
                    break;
                case 3:
                    System.out.print("Ingrese el Radio del Círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    circulo.imprimirDatos();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
