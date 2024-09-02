/*public class PrácticaInicial {

    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Llamamos al método imprimeNombre con un nombre de ejemplo
        System.out.println();
        imprimeNombre("Cayo Jean");

        // Llamamos al método imprimeNombreYEdad con un nombre y una edad de ejemplo
        imprimeNombreYEdad("Cayo Jean", 26);
    }

    // Método que imprime el nombre
    public static void imprimeNombre(String nombre) {
        // Imprime el mensaje con el nombre recibido como parámetro
        System.out.println("\n" +
                        "Mi Nombre es " + nombre);
    }

    // Método que imprime el nombre y la edad
    public static void imprimeNombreYEdad(String nombre, int edad) {
        // Imprime el mensaje con el nombre y la edad recibidos como parámetros
        System.out.println("Me Llamo " + nombre + " y Tengo " + edad + " Años");
    }
}*/





/*import java.util.Scanner; // Importamos la clase Scanner para recibir la entrada del usuario

public class PrácticaInicial {

    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese su nombre
        System.out.println();
        System.out.print("\n" +
                        "Por Favor, Ingresa Tu Nombre: ");
        String nombre = scanner.nextLine(); // Leemos el nombre ingresado por el usuario

        // Solicitamos al usuario que ingrese su edad
        System.out.print("Por Favor, Ingresa Tu Edad: ");
        int edad = scanner.nextInt(); // Leemos la edad ingresada por el usuario

        // Llamamos al método imprimeNombre con el nombre ingresado
        imprimeNombre(nombre);

        // Llamamos al método imprimeNombreYEdad con el nombre y la edad ingresados
        imprimeNombreYEdad(nombre, edad);

        // Cerramos el objeto Scanner
        scanner.close();
    }

    // Método que imprime el nombre
    public static void imprimeNombre(String nombre) {
        // Imprime el mensaje con el nombre recibido como parámetro
        System.out.println();
        System.out.println("Mi Nombre Es " + nombre);
    }

    // Método que imprime el nombre y la edad
    public static void imprimeNombreYEdad(String nombre, int edad) {
        // Imprime el mensaje con el nombre y la edad recibidos como parámetros
        System.out.println("Me Llamo " + nombre + " y Tengo " + edad + " Años");
    }
}*/




import java.util.Scanner;

public class PrácticaInicial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        while (true) {
            System.out.println();
            System.out.print("\n" +
                                "Por Favor, Ingresa Tu Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+")) { // Verificamos que el nombre solo contenga letras y espacios
                break;
            } else {
                System.out.println("Error: El Nombre Solo Debe Contener Letras.");
            }
        }

        int edad;
        while (true) {
            System.out.print("Por Favor, Ingresa Tu Edad (2 Dígitos): ");
            String edadInput = scanner.nextLine();
            if (edadInput.matches("\\d{2}")) { // Verificamos que la edad sea un número de 2 dígitos
                edad = Integer.parseInt(edadInput);
                break;
            } else {
                System.out.println("Error: La Edad Debe Ser Un Número De 2 Dígitos.");
            }
        }

        imprimeNombre(nombre);
        imprimeNombreYEdad(nombre, edad);

        scanner.close();
    }

    public static void imprimeNombre(String nombre) {
        System.out.println();
        System.out.println("\n" +
                        "Mi Nombre Es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me Llamo " + nombre + " y Tengo " + edad + " Años");
    }
}




/*import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar nombre al usuario
        System.out.println("Por favor ingrese un nombre:");
        String nombre = scanner.nextLine();
        
        // Solicitar edad al usuario
        System.out.println("Por favor ingrese una edad:");
        int edad = scanner.nextInt();
        
        // Llamar al método para imprimir nombre y edad
        imprimeNombreYEdad(nombre, edad);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Método para imprimir nombre
    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }
    
    // Método para imprimir nombre y edad
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}*/

    
