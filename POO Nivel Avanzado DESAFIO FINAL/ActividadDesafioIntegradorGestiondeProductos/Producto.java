public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;
    private String descripcion;

    // Constructor
    public Producto(String nombre, double precio, int cantidadStock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidadStock() { return cantidadStock; }
    public String getDescripcion() { return descripcion; }

    public void setCantidadStock(int cantidadStock) { this.cantidadStock = cantidadStock; }

    @Override
    public String toString() {
        return nombre + " - " + descripcion + " - Precio: S/. " + precio;
    }
}
