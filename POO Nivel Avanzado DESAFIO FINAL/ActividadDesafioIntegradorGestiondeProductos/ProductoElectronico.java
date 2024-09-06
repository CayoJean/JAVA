public class ProductoElectronico extends Producto {
    private int garantia; // Garantía en meses

    public ProductoElectronico(String nombre, double precio, int cantidadStock, String descripcion, int garantia) {
        super(nombre, precio, cantidadStock, descripcion);
        this.garantia = garantia;
    }

    // Getters y Setters
    public int getGarantia() { return garantia; }
    public void setGarantia(int garantia) { this.garantia = garantia; }
}
