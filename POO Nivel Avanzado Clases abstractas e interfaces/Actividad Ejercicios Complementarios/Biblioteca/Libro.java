// Archivo: Libro.java
public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    @Override
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto: " + titulo);
    }

    @Override
    public double calcularMultas() {
        // Implementar lógica para calcular multas si es necesario
        return 0; // Valor predeterminado, ajustar según sea necesario
    }

    @Override
    public String obtenerInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Disponible: " + disponible;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
