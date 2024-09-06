package ActividadesPracticasHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class InventarioStock {

    public static void main(String[] args) {
        // Crear el HashMap para almacenar el inventario de productos
        HashMap<String, Integer> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("\n--- Actividad: Inventario de Stock ---");
            System.out.println();
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar o actualizar producto");
            System.out.println("3. Consultar cantidad de un producto");
            System.out.println("4. Verificar existencia de producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    // Mostrar inventario completo
                    mostrarInventario(inventario);
                    break;

                case 2:
                    // Agregar o actualizar un producto en el inventario
                    agregarOActualizarProducto(inventario, scanner);
                    break;

                case 3:
                    // Consultar la cantidad en stock de un producto
                    consultarCantidadProducto(inventario, scanner);
                    break;

                case 4:
                    // Verificar si un producto existe en el inventario
                    verificarProducto(inventario, scanner);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Método para mostrar el inventario completo
    public static void mostrarInventario(HashMap<String, Integer> inventario) {
        System.out.println("\nInventario:");
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (String producto : inventario.keySet()) {
                System.out.println("Producto: " + producto + ", Cantidad: " + inventario.get(producto));
            }
        }
    }

    // Método para agregar o actualizar un producto en el inventario
    public static void agregarOActualizarProducto(HashMap<String, Integer> inventario, Scanner scanner) {
        System.out.println();
        System.out.print("Ingresa el nombre del producto: ");
        String producto = formatearNombreProducto(scanner.nextLine());
        
        System.out.print("Ingresa la cantidad de " + producto + ": ");
        int cantidad = scanner.nextInt();
        
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa.");
            return;
        }

        // Si el producto ya existe, sumamos la cantidad
        if (inventario.containsKey(producto)) {
            int cantidadActual = inventario.get(producto);
            inventario.put(producto, cantidadActual + cantidad);
            System.out.println("Se ha actualizado el stock de " + producto + " a " + (cantidadActual + cantidad));
        } else {
            inventario.put(producto, cantidad);
            System.out.println("Producto " + producto + " agregado al inventario con " + cantidad + " en stock.");
        }
    }

    // Método para consultar la cantidad de un producto en stock
    public static void consultarCantidadProducto(HashMap<String, Integer> inventario, Scanner scanner) {
        System.out.println();
        System.out.print("Ingresa el nombre del producto para consultar: ");
        String producto = formatearNombreProducto(scanner.nextLine());
        
        if (inventario.containsKey(producto)) {
            System.out.println("Cantidad en stock de " + producto + ": " + inventario.get(producto));
        } else {
            System.out.println("El producto " + producto + " no existe en el inventario.");
        }
    }

    // Método para verificar si un producto existe en el inventario
    public static void verificarProducto(HashMap<String, Integer> inventario, Scanner scanner) {
        System.out.println();
        System.out.print("Ingresa el nombre del producto a verificar: ");
        String producto = formatearNombreProducto(scanner.nextLine());
        
        if (inventario.containsKey(producto)) {
            System.out.println("El producto " + producto + " existe en el inventario.");
        } else {
            System.out.println("El producto " + producto + " no se encuentra en el inventario.");
        }
    }

    // Método para formatear los nombres de productos y evitar duplicados
    public static String formatearNombreProducto(String nombre) {
        return nombre.trim().toLowerCase(); // Elimina espacios y convierte a minúsculas
    }
}
