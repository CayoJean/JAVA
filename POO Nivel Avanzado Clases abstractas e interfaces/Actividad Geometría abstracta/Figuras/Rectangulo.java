package Figuras;

// Archivo: Rectangulo.java
public class Rectangulo extends Figura implements Dibujable {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo con largo: " + largo + " y ancho: " + ancho);
    }
}
