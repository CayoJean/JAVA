// Archivo: Pelicula.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String director;
    private int duracion; // Duración en minutos
    private LocalDate fechaDevolucionEsperada;
    private double multaPorDiaRetraso;

    public Pelicula(String titulo, String director, int duracion, LocalDate fechaDevolucionEsperada, double multaPorDiaRetraso) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.multaPorDiaRetraso = multaPorDiaRetraso;
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
        LocalDate hoy = LocalDate.now();
        long diasRetraso = ChronoUnit.DAYS.between(fechaDevolucionEsperada, hoy);
        if (diasRetraso > 0) {
            return diasRetraso * multaPorDiaRetraso;
        } else {
            return 0;
        }
    }

    @Override
    public String obtenerInformacion() {
        return "Título: " + titulo + ", Director: " + director + ", Duración: " + duracion + " minutos" +
               ", Fecha devolución esperada: " + fechaDevolucionEsperada + ", Multa por día de retraso: " + multaPorDiaRetraso;
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

    public LocalDate getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(LocalDate fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    public double getMultaPorDiaRetraso() {
        return multaPorDiaRetraso;
    }

    public void setMultaPorDiaRetraso(double multaPorDiaRetraso) {
        this.multaPorDiaRetraso = multaPorDiaRetraso;
    }
}
