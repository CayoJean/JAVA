import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Menu(Cliente cliente, ArrayList<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println();
            System.out.println("\n--- Actividad: Desafío Integrador Gestión de Productos ---");
            System.out.println("\n1. Agregar producto al carrito");
            System.out.println("2. Ver el carrito");
            System.out.println("3. Realizar la compra");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarProductoAlCarrito(scanner);
                    break;
                case 2:
                    verCarrito();
                    break;
                case 3:
                    realizarCompra();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void agregarProductoAlCarrito(Scanner scanner) {
        System.out.println("Seleccione el producto a agregar:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
        int seleccion = scanner.nextInt() - 1;
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        try {
            cliente.agregarAlCarrito(productos.get(seleccion), cantidad);
            System.out.println("Producto agregado al carrito.");
        } catch (ProductoAgotadoException e) {
            System.out.println(e.getMessage());
        }
    }

    /*private void verCarrito() {
        System.out.println("Carrito de compras:");
        for (Producto producto : cliente.getCarrito()) {
            System.out.println(producto);
        }
        System.out.println("Total: S/." + cliente.calcularTotal());
    }*/

    private void verCarrito() {
    System.out.println("Carrito de compras:");
    for (HashMap.Entry<Producto, Integer> entry : cliente.getCarrito().entrySet()) {
        Producto producto = entry.getKey();
        int cantidad = entry.getValue();
        System.out.println(producto + " - Cantidad: " + cantidad);
    }
    System.out.println("Total: $" + cliente.calcularTotal());
}


    private void realizarCompra() {
        double total = cliente.calcularTotal();
        System.out.println("Total a pagar: S/." + total);
        // Aquí podrías aplicar descuentos o impuestos
    }
}
