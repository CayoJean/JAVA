// Archivo: Revista.java
public class Revista extends ItemBiblioteca implements Catalogable {
    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
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
        // Implementar lógica para calcular multas si es necesario
        return 0; // Valor predeterminado, ajustar según sea necesario
    }

    @Override
    public String obtenerInformacion() {
        return "Nombre: " + nombreRevista + ", Edición: " + nroEdicion + ", Ejemplares: " + cantidadEjemplares;
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
}
