import java.util.Scanner;

public class BuscandoElemento {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar tres elementos enteros
        int[] numeros = new int[3];

        // Pedir al usuario que ingrese los números
        System.out.println("\n" +
                        "Ingrese tres números enteros:");

        System.out.print("Número 1: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Número 2: ");
        numeros[1] = scanner.nextInt();

        System.out.print("Número 3: ");
        numeros[2] = scanner.nextInt();

        // Solicitar un número al usuario para buscar en el array
        System.out.print("Ingrese el número a buscar: ");
        int numeroABuscar = scanner.nextInt();

        // Verificar si el número está presente en el array
        boolean encontrado = (numeroABuscar == numeros[0]) || 
                                (numeroABuscar == numeros[1]) || 
                                (numeroABuscar == numeros[2]);

        // Imprimir el resultado por consola
        if (encontrado) {
            System.out.println("El número " + numeroABuscar + " está presente en el array.");
        } else {
            System.out.println("El número " + numeroABuscar + " no está presente en el array.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
