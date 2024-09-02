import java.util.Scanner;

public class CalculadoraAreaPerimetro {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de la base del rectángulo
        System.out.print("Por favor, ingresa el valor de la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();

        // Pedir al usuario que ingrese el valor de la altura del rectángulo
        System.out.print("Por favor, ingresa el valor de la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();

        // Calcular el perímetro del rectángulo
        double perimetro = 2 * baseRectangulo + 2 * alturaRectangulo;

        // Mostrar el resultado del perímetro
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        // Calcular el área del rectángulo
        double area = baseRectangulo * alturaRectangulo;

        // Mostrar el resultado del área
        System.out.println("El área del rectángulo es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }
}