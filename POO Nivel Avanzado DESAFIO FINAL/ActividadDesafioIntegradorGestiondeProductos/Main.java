import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Laptop", 1200.00, 10, "Laptop de alta gama");
        Producto producto2 = new Producto("Camisa", 20.00, 50, "Camisa de algodón");

        // Crear lista de productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        // Crear cliente
        Cliente cliente = new Cliente();

        // Crear menú y mostrar
        Menu menu = new Menu(cliente, productos);
        menu.mostrarMenu();
    }
}
