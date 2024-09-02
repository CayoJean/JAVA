// Archivo: Pelicula.java
public class Pelicula extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String director;
    private int duracion; // Duración en minutos

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public void prestar() {
        System.out.println("Película prestada: " + titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Película devuelta: " + titulo);
    }

    @Override
    public double calcularMultas() {
        // Implementar lógica para calcular multas si es necesario
        return 0; // Valor predeterminado, ajustar según sea necesario
    }

    @Override
    public String obtenerInformacion() {
        return "Título: " + titulo + ", Director: " + director + ", Duración: " + duracion + " minutos";
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
