
/*import java.util.ArrayList;

public class Cliente {
    private ArrayList<Producto> carrito;

    public Cliente() {
        carrito = new ArrayList<>();
    }

    public void agregarAlCarrito(Producto producto, int cantidad) throws ProductoAgotadoException {
        if (producto.getCantidadStock() < cantidad) {
            throw new ProductoAgotadoException("No hay suficiente stock para " + producto.getNombre());
        }
        producto.setCantidadStock(producto.getCantidadStock() - cantidad);

        carrito.add(producto);
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
}
*/




import java.util.HashMap;

public class Cliente {
    private HashMap<Producto, Integer> carrito;

    public Cliente() {
        carrito = new HashMap<>();
    }

    public void agregarAlCarrito(Producto producto, int cantidad) throws ProductoAgotadoException {
        if (producto.getCantidadStock() < cantidad) {
            throw new ProductoAgotadoException("No hay suficiente stock para " + producto.getNombre());
        }
        producto.setCantidadStock(producto.getCantidadStock() - cantidad);
        
        // Agregar o actualizar la cantidad en el carrito
        carrito.put(producto, carrito.getOrDefault(producto, 0) + cantidad);
    }

    public HashMap<Producto, Integer> getCarrito() {
        return carrito;
    }

    public double calcularTotal() {
        double total = 0;
        for (HashMap.Entry<Producto, Integer> entry : carrito.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            total += producto.getPrecio() * cantidad;
        }
        return total;
    }
}
