import Figuras.Círculo;
import Figuras.Rectangulo;
import Figuras.Triangulo;
// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Crear instancias de cada figura
        Círculo circulo = new Círculo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 3, 4, 5);

        // Calcular y mostrar áreas y perímetros
        System.out.println("\n" +
                        "Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        circulo.dibujar();

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        rectangulo.dibujar();

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        triangulo.dibujar();
    }
}
