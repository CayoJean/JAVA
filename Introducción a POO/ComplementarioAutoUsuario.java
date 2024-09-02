import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Auto
class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor que inicializa marca, modelo y año
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Constructor que inicializa marca y modelo
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = 0; // Valor por defecto
    }

    // Constructor que inicializa solamente la marca
    public Auto(String marca) {
        this.marca = marca;
        this.modelo = "Modelo desconocido"; // Valor por defecto
        this.año = 0; // Valor por defecto
    }

    // Constructor sin parámetros
    public Auto() {
        this.marca = "Marca desconocida"; // Valor por defecto
        this.modelo = "Modelo desconocido"; // Valor por defecto
        this.año = 0; // Valor por defecto
    }

    // Método para imprimir los datos del auto
    public void imprimirDatos() {
        System.out.println("Información del Auto:");
        
        if (marca != null) {
            System.out.println("Marca: " + marca);
        } else {
            System.out.println("Marca no especificada.");
        }
        
        if (modelo != null) {
            System.out.println("Modelo: " + modelo);
        } else {
            System.out.println("Modelo no especificado.");
        }
        
        if (año != 0) { // Verificamos que año tenga un valor diferente de cero
            System.out.println("Año: " + año);
        } else {
            System.out.println("Año no especificado.");
        }
        System.out.println(); // Línea en blanco para separar la salida
    }
}

// Clase principal con el método main o AutoUsuario
public class ComplementarioAutoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Auto> autos = new ArrayList<>(); // Lista para almacenar los autos creados
        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("\n" +
                                "Menú de Opciones:");
            System.out.println("1. Crear Auto con Marca, Modelo y Año");
            System.out.println("2. Crear Auto con Marca y Modelo");
            System.out.println("3. Crear Auto con Marca");
            System.out.println("4. Crear Auto sin atributos");
            System.out.println("5. Imprimir Datos del Auto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (option) {
                case 1:
                    System.out.print("Ingrese la Marca: ");
                    String marca1 = scanner.nextLine();
                    System.out.print("Ingrese el Modelo: ");
                    String modelo1 = scanner.nextLine();
                    System.out.print("Ingrese el Año: ");
                    int año1 = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    Auto auto1 = new Auto(marca1, modelo1, año1);
                    autos.add(auto1);
                    System.out.println("Auto creado con Marca, Modelo y Año.\n");
                    break;
                case 2:
                    System.out.print("Ingrese la Marca: ");
                    String marca2 = scanner.nextLine();
                    System.out.print("Ingrese el Modelo: ");
                    String modelo2 = scanner.nextLine();
                    Auto auto2 = new Auto(marca2, modelo2);
                    autos.add(auto2);
                    System.out.println("Auto creado con Marca y Modelo.\n");
                    break;
                case 3:
                    System.out.print("Ingrese la Marca: ");
                    String marca3 = scanner.nextLine();
                    Auto auto3 = new Auto(marca3);
                    autos.add(auto3);
                    System.out.println("Auto creado con Marca.\n");
                    break;
                case 4:
                    Auto auto4 = new Auto();
                    autos.add(auto4);
                    System.out.println("Auto creado sin atributos.\n");
                    break;
                case 5:
                    if (!autos.isEmpty()) {
                        System.out.println("Seleccione el Auto que desea imprimir:");
                        for (int i = 0; i < autos.size(); i++) {
                            System.out.println((i + 1) + ". Auto " + (i + 1));
                        }
                        int autoIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        if (autoIndex >= 0 && autoIndex < autos.size()) {
                            autos.get(autoIndex).imprimirDatos();
                        } else {
                            System.out.println("Índice no válido.\n");
                        }
                    } else {
                        System.out.println("No se ha creado ningún auto aún.\n");
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
            }
        }
        
        scanner.close();
    }
}

