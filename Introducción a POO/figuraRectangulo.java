import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Rectangulo
class Rectangulo {
    // Atributos
    private double ancho;
    private double alto;
    
    // Atributo estático para contar las instancias
    private static int contadorRectangulos = 0;

    // Constructor con argumentos
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    // Método para calcular el área
    public double area() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir el área
    public void imprimirArea() {
        System.out.println("Área del rectángulo: " + area());
    }

    // Método para imprimir el perímetro
    public void imprimirPerimetro() {
        System.out.println("Perímetro del rectángulo: " + perimetro());
    }

    // Método estático para obtener el número total de rectángulos creados
    public static int getTotalRectangulos() {
        return contadorRectangulos;
    }
}

// Clase principal con el método main
public class figuraRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Rectangulo> rectangulos = new ArrayList<>(); // Lista para almacenar los rectángulos creados
        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("\n" +
                                "Menú de Opciones:");
            System.out.println("1. Crear Rectángulo");
            System.out.println("2. Mostrar Área de un Rectángulo");
            System.out.println("3. Mostrar Perímetro de un Rectángulo");
            System.out.println("4. Mostrar Número Total de Rectángulos Creados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (option) {
                case 1:
                    System.out.print("Ingrese el Ancho del Rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el Alto del Rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    rectangulos.add(rectangulo);
                    System.out.println("Rectángulo creado.\n");
                    break;
                case 2:
                    if (!rectangulos.isEmpty()) {
                        System.out.println("Seleccione el Rectángulo del cual desea ver el Área:");
                        for (int i = 0; i < rectangulos.size(); i++) {
                            System.out.println((i + 1) + ". Rectángulo " + (i + 1));
                        }
                        int rectIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        if (rectIndex >= 0 && rectIndex < rectangulos.size()) {
                            rectangulos.get(rectIndex).imprimirArea();
                        } else {
                            System.out.println("Índice no válido.\n");
                        }
                    } else {
                        System.out.println("No se ha creado ningún rectángulo aún.\n");
                    }
                    break;
                case 3:
                    if (!rectangulos.isEmpty()) {
                        System.out.println("Seleccione el Rectángulo del cual desea ver el Perímetro:");
                        for (int i = 0; i < rectangulos.size(); i++) {
                            System.out.println((i + 1) + ". Rectángulo " + (i + 1));
                        }
                        int rectIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        if (rectIndex >= 0 && rectIndex < rectangulos.size()) {
                            rectangulos.get(rectIndex).imprimirPerimetro();
                        } else {
                            System.out.println("Índice no válido.\n");
                        }
                    } else {
                        System.out.println("No se ha creado ningún rectángulo aún.\n");
                    }
                    break;
                case 4:
                    System.out.println("Número Total de Rectángulos Creados: " + Rectangulo.getTotalRectangulos() + "\n");
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
            }
        }
        
        scanner.close();
    }
}

