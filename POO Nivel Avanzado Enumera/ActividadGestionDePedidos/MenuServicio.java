package ActividadGestionDePedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuServicio {

    public static void main(String[] args) {
        MenuServicio menuServicio = new MenuServicio();
        menuServicio.iniciarMenu();
    }

    private PedidoServicio pedidoServicio;
    private Scanner scanner;

    public MenuServicio() {
        this.pedidoServicio = new PedidoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarMenu() {
        int opcion = -1; // Inicializamos la opción con un valor que no está en el rango de opciones válidas.
        do {
            mostrarOpciones();
            
            // Validación para asegurarse de que el usuario ingresa solo números.
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
                
                switch (opcion) {
                    case 1:
                        crearNuevoPedido();
                        break;
                    case 2:
                        actualizarEstadoPedido();
                        break;
                    case 3:
                        buscarPedidosPorEstado();
                        break;
                    case 4:
                        mostrarListaDePedidos();
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("¡VUELE PRONTO! Saliste del Programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo (1 - 5).");
                }
            } else {
                System.out.println();
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next();  // Limpiar la entrada no válida
            }
    
        } while (opcion != 5);
    }
    

    private void mostrarOpciones() {
        System.out.println();
        System.out.println("\n--- Gestión de Pedidos ---");
        System.out.println();
        System.out.println("1. Crear un nuevo pedido");
        System.out.println("2. Actualizar el estado de un pedido");
        System.out.println("3. Buscar pedidos por estado");
        System.out.println("4. Mostrar la lista de pedidos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void crearNuevoPedido() {
        int numeroDePedido = -1;
        boolean numeroValido = false;
    
        // Validar entrada para que sea numérica
        while (!numeroValido) {
            System.out.println();
            System.out.print("Ingrese el número del pedido (solo números): ");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                numeroDePedido = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
                numeroValido = true;  // Se rompe el bucle si se ingresa un número válido
            } else {
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        String nombreCliente = ""; // Inicialización con un valor vacío
        boolean clienteValido = false;
        Pattern letrasPattern = Pattern.compile("[a-zA-Z\\s]+");  // Solo letras y espacios
    
        // Validar nombre del cliente para que solo contenga letras
        while (!clienteValido) {
            System.out.print("Ingrese el nombre del cliente (solo letras): ");
            nombreCliente = scanner.nextLine();
            if (letrasPattern.matcher(nombreCliente).matches()) {
                clienteValido = true;
            } else {
                System.out.println("Error: El nombre del cliente debe contener solo letras.");
            }
        }
    
        String productos = ""; // Inicialización con un valor vacío
        boolean productosValidos = false;
    
        // Validar productos para que solo contengan letras
        while (!productosValidos) {
            System.out.print("Ingrese los productos (separados por comas, solo letras): ");
            productos = scanner.nextLine();
            String[] productosArray = productos.split(",");
            boolean todosValidos = true;
            for (String producto : productosArray) {
                if (!letrasPattern.matcher(producto.trim()).matches()) {
                    todosValidos = false;
                    break;
                }
            }
            if (todosValidos) {
                productosValidos = true;
            } else {
                System.out.println("Error: Los productos deben contener solo letras.");
            }
        }
    
        List<String> listaDeProductos = new ArrayList<>();
        for (String producto : productos.split(",")) {
            listaDeProductos.add(producto.trim());
        }
    
        pedidoServicio.crearPedido(numeroDePedido, nombreCliente, listaDeProductos);
        System.out.println("Pedido creado con éxito.");
    }
    

    private void actualizarEstadoPedido() {
        System.out.println();
        int numeroDePedido = -1;
        boolean numeroValido = false;
    
        // Validar entrada para que sea numérica
        while (!numeroValido) {
            System.out.println();
            System.out.print("Ingrese el número del pedido a actualizar (solo número del nombre del pedido): ");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                numeroDePedido = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
                numeroValido = true;  // Se rompe el bucle si se ingresa un número válido
            } else {
                System.out.println();
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        EstadoPedido nuevoEstado = null;
        boolean estadoValido = false;
    
        // Validar estado del pedido
        while (!estadoValido) {
            System.out.println();
            System.out.println("Seleccione el nuevo estado: 1. Pendiente, 2. Enviado, 3. Entregado");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                int estadoSeleccionado = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
    
                switch (estadoSeleccionado) {
                    case 1:
                        nuevoEstado = EstadoPedido.PENDIENTE;
                        estadoValido = true;
                        break;
                    case 2:
                        nuevoEstado = EstadoPedido.ENVIADO;
                        estadoValido = true;
                        break;
                    case 3:
                        nuevoEstado = EstadoPedido.ENTREGADO;
                        estadoValido = true;
                        break;
                    default:
                        System.out.println("Error: Estado no válido. Debe seleccionar 1, 2 o 3.");
                }
            } else {
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        pedidoServicio.actualizarEstadoPedido(numeroDePedido, nuevoEstado);
        System.out.println("Estado del pedido actualizado con éxito.");
    }
    
    

    private void buscarPedidosPorEstado() {
        EstadoPedido estado = null;
        boolean estadoValido = false;
    
        // Validar estado del pedido
        while (!estadoValido) {
            System.out.println();
            System.out.println("Seleccione el estado para buscar: 1. Pendiente, 2. Enviado, 3. Entregado");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                int estadoSeleccionado = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
    
                switch (estadoSeleccionado) {
                    case 1:
                        estado = EstadoPedido.PENDIENTE;
                        estadoValido = true;
                        break;
                    case 2:
                        estado = EstadoPedido.ENVIADO;
                        estadoValido = true;
                        break;
                    case 3:
                        estado = EstadoPedido.ENTREGADO;
                        estadoValido = true;
                        break;
                    default:
                        System.out.println("Error: Estado no válido. Debe seleccionar 1, 2 o 3.");
                }
            } else {

                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        List<Pedido> pedidosPorEstado = pedidoServicio.buscarPedidosPorEstado(estado);
        if (pedidosPorEstado.isEmpty()) {
            System.out.println();
            System.out.println("No se encontraron pedidos con el estado seleccionado.");
        } else {
            System.out.println();
            System.out.println("Pedidos encontrados:");
            for (Pedido pedido : pedidosPorEstado) {
                System.out.println(pedido);  // Usa el método toString() modificado
            }
        }
    }
    

    private void mostrarListaDePedidos() {
        System.out.println();
        List<Pedido> pedidos = pedidoServicio.obtenerListaDePedidos();
        if (pedidos.isEmpty()) {
            System.out.println();
            System.out.println("No hay pedidos en la lista.");
        } else {
            System.out.println();
            System.out.println("\nLista de Pedidos:");
            for (Pedido pedido : pedidos) {
                System.out.println("--------------------------------------------------");
                System.out.println(pedido);  // Aquí se usa el método toString() modificado
                System.out.println("--------------------------------------------------\n");
            }
        }
    }
}





/* 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuServicio {

    public static void main(String[] args) {
        MenuServicio menuServicio = new MenuServicio();
        menuServicio.iniciarMenu();
    }

    private PedidoServicio pedidoServicio;
    private Scanner scanner;

    public MenuServicio() {
        this.pedidoServicio = new PedidoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarMenu() {
        int opcion = -1; // Inicializamos la opción con un valor que no está en el rango de opciones válidas.
        do {
            if (!hayPedidos()) {
                mostrarOpcionesReducidas();
            } else {
                mostrarOpciones();
            }
            
            // Validación para asegurarse de que el usuario ingresa solo números.
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
                
                switch (opcion) {
                    case 1:
                        crearNuevoPedido();
                        break;
                    case 2:
                        if (!hayPedidos()) {
                            System.out.println("Primero debe crear un pedido.");
                            continue;
                        }
                        actualizarEstadoPedido();
                        break;
                    case 3:
                        if (!hayPedidos()) {
                            System.out.println("Primero debe crear un pedido.");
                            continue;
                        }
                        buscarPedidosPorEstado();
                        break;
                    case 4:
                        if (!hayPedidos()) {
                            System.out.println("Primero debe crear un pedido.");
                            continue;
                        }
                        mostrarListaDePedidos();
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("Saliendo de la aplicación...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo (1 - 5).");
                }
            } else {
                System.out.println();
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next();  // Limpiar la entrada no válida
            }
        } while (opcion != 5);
    }

    private void mostrarOpciones() {
        System.out.println();
        System.out.println("\n--- Gestión de Pedidos ---");
        System.out.println();
        System.out.println("1. Crear un nuevo pedido");
        System.out.println("2. Actualizar el estado de un pedido");
        System.out.println("3. Buscar pedidos por estado");
        System.out.println("4. Mostrar la lista de pedidos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void mostrarOpcionesReducidas() {
        System.out.println();
        System.out.println("\n--- Gestión de Pedidos ---");
        System.out.println();
        System.out.println("1. Crear un nuevo pedido");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private boolean hayPedidos() {
        return !pedidoServicio.obtenerListaDePedidos().isEmpty();
    }

    private void crearNuevoPedido() {
        int numeroDePedido = -1;
        boolean numeroValido = false;
    
        // Validar entrada para que sea numérica
        while (!numeroValido) {
            System.out.println();
            System.out.print("Ingrese el número del pedido (solo números): ");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                numeroDePedido = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
                numeroValido = true;  // Se rompe el bucle si se ingresa un número válido
            } else {
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        String nombreCliente = ""; // Inicialización con un valor vacío
        boolean clienteValido = false;
        Pattern letrasPattern = Pattern.compile("[a-zA-Z\\s]+");  // Solo letras y espacios
    
        // Validar nombre del cliente para que solo contenga letras
        while (!clienteValido) {
            System.out.print("Ingrese el nombre del cliente (solo letras): ");
            nombreCliente = scanner.nextLine();
            if (letrasPattern.matcher(nombreCliente).matches()) {
                clienteValido = true;
            } else {
                System.out.println("Error: El nombre del cliente debe contener solo letras.");
            }
        }
    
        String productos = ""; // Inicialización con un valor vacío
        boolean productosValidos = false;
    
        // Validar productos para que solo contengan letras
        while (!productosValidos) {
            System.out.print("Ingrese los productos (separados por comas, solo letras): ");
            productos = scanner.nextLine();
            String[] productosArray = productos.split(",");
            boolean todosValidos = true;
            for (String producto : productosArray) {
                if (!letrasPattern.matcher(producto.trim()).matches()) {
                    todosValidos = false;
                    break;
                }
            }
            if (todosValidos) {
                productosValidos = true;
            } else {
                System.out.println("Error: Los productos deben contener solo letras.");
            }
        }
    
        List<String> listaDeProductos = new ArrayList<>();
        for (String producto : productos.split(",")) {
            listaDeProductos.add(producto.trim());
        }
    
        pedidoServicio.crearPedido(numeroDePedido, nombreCliente, listaDeProductos);
        System.out.println("Pedido creado con éxito.");
    }

    private void actualizarEstadoPedido() {
        System.out.println();
        int numeroDePedido = -1;
        boolean numeroValido = false;
    
        // Validar entrada para que sea numérica
        while (!numeroValido) {
            System.out.println();
            System.out.print("Ingrese el número del pedido a actualizar (solo números): ");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                numeroDePedido = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
                numeroValido = true;  // Se rompe el bucle si se ingresa un número válido
            } else {
                System.out.println();
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        EstadoPedido nuevoEstado = null;
        boolean estadoValido = false;
    
        // Validar estado del pedido
        while (!estadoValido) {
            System.out.println();
            System.out.println("Seleccione el nuevo estado: 1. Pendiente, 2. Enviado, 3. Entregado");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                int estadoSeleccionado = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
    
                switch (estadoSeleccionado) {
                    case 1:
                        nuevoEstado = EstadoPedido.PENDIENTE;
                        estadoValido = true;
                        break;
                    case 2:
                        nuevoEstado = EstadoPedido.ENVIADO;
                        estadoValido = true;
                        break;
                    case 3:
                        nuevoEstado = EstadoPedido.ENTREGADO;
                        estadoValido = true;
                        break;
                    default:
                        System.out.println("Error: Estado no válido. Debe seleccionar 1, 2 o 3.");
                }
            } else {
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        pedidoServicio.actualizarEstadoPedido(numeroDePedido, nuevoEstado);
        System.out.println("Estado del pedido actualizado con éxito.");
    }

    private void buscarPedidosPorEstado() {
        EstadoPedido estado = null;
        boolean estadoValido = false;
    
        // Validar estado del pedido
        while (!estadoValido) {
            System.out.println();
            System.out.println("Seleccione el estado para buscar: 1. Pendiente, 2. Enviado, 3. Entregado");
            if (scanner.hasNextInt()) {  // Verifica si la entrada es un número entero
                int estadoSeleccionado = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
    
                switch (estadoSeleccionado) {
                    case 1:
                        estado = EstadoPedido.PENDIENTE;
                        estadoValido = true;
                        break;
                    case 2:
                        estado = EstadoPedido.ENVIADO;
                        estadoValido = true;
                        break;
                    case 3:
                        estado = EstadoPedido.ENTREGADO;
                        estadoValido = true;
                        break;
                    default:
                        System.out.println("Error: Estado no válido. Debe seleccionar 1, 2 o 3.");
                }
            } else {
                System.out.println("Error: Debe ingresar solo números.");
                scanner.next();  // Limpia el buffer del scanner si la entrada no es un número
            }
        }
    
        List<Pedido> pedidosPorEstado = pedidoServicio.buscarPedidosPorEstado(estado);
        if (pedidosPorEstado.isEmpty()) {
            System.out.println();
            System.out.println("No se encontraron pedidos con el estado seleccionado.");
        } else {
            System.out.println();
            System.out.println("Pedidos encontrados:");
            for (Pedido pedido : pedidosPorEstado) {
                System.out.println(pedido);  // Usa el método toString() modificado
            }
        }
    }

    private void mostrarListaDePedidos() {
        System.out.println();
        List<Pedido> pedidos = pedidoServicio.obtenerListaDePedidos();
        if (pedidos.isEmpty()) {
            System.out.println();
            System.out.println("No hay pedidos en la lista.");
        } else {
            System.out.println();
            System.out.println("\nLista de Pedidos:");
            for (Pedido pedido : pedidos) {
                System.out.println("--------------------------------------------------");
                System.out.println(pedido);  // Aquí se usa el método toString() modificado
                System.out.println("--------------------------------------------------\n");
            }
        }
    }
}
*/