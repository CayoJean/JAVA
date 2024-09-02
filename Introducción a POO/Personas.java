// Clase Persona
class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para imprimir los datos de la persona
    public void imprimirDatos() {
        System.out.println();
        System.out.println("\n" +
                        "Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}

// Clase principal con el método main
public class Personas {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona1 = new Persona("Cayo Jean", 25);
        
        // Imprimir los datos de persona1
        persona1.imprimirDatos();
        
        System.out.println(); // Línea en blanco para separar las salidas

        // Crear un nuevo objeto Persona
        Persona persona2 = new Persona("Maria", 30);

        // Imprimir los datos de persona2
        persona2.imprimirDatos();
    }
}
