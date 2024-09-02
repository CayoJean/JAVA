// Clase Auto
class car {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor que inicializa marca, modelo y año
    public car(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Constructor que inicializa marca y modelo
    public car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor que inicializa solamente la marca
    public car(String marca) {
        this.marca = marca;
    }

    // Constructor sin parámetros
    public car() {
        // No inicializa ningún atributo
    }

    // Método para imprimir los datos del auto
    public void imprimirDatos() {
        System.out.println();
        System.out.println("\n" +
                        "Información del Auto:");
        
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

// Clase principal con el método Autos
public class UsuariosAutos {
    public static void main(String[] args) {
        // Crear un objeto Auto utilizando el constructor que inicializa marca, modelo y año
        car auto1 = new car("Toyota", "Hilux", 2020);
        auto1.imprimirDatos();

        // Crear un objeto Auto utilizando el constructor que inicializa marca y modelo
        car auto2 = new car("Lamborghini", "Aventador");
        auto2.imprimirDatos();

        // Crear un objeto Auto utilizando el constructor que inicializa solamente la marca
        car auto3 = new car("Honda");
        auto3.imprimirDatos();

        // Crear un objeto Auto utilizando el constructor sin parámetros
        car auto4 = new car();
        auto4.imprimirDatos();
    }
}
