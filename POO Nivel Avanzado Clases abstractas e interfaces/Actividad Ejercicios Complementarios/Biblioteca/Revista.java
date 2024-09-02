// Archivo: Revista.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemBiblioteca implements Catalogable {
    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;
    private LocalDate fechaDevolucionEsperada;
    private double multaPorDiaRetraso;

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares, LocalDate fechaDevolucionEsperada, double multaPorDiaRetraso) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.multaPorDiaRetraso = multaPorDiaRetraso;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Revista prestada. Ejemplares restantes: " + cantidadEjemplares);
        } else {
            System.out.println("No se puede prestar. Stock agotado.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Revista devuelta. Ejemplares disponibles: " + cantidadEjemplares);
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
        return "Nombre: " + nombreRevista + ", Edición: " + nroEdicion + ", Ejemplares: " + cantidadEjemplares +
               ", Fecha devolución esperada: " + fechaDevolucionEsperada + ", Multa por día de retraso: " + multaPorDiaRetraso;
    }

    // Getters y Setters
    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
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
