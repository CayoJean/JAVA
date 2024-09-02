import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        // Crear un array con 3 enteros con valores predeterminados
        int[] arrayOriginal = {1, 2, 3};

        // Crear un nuevo array con una extensión de 2 elementos adicionales
        int[] nuevoArray = new int[5];
        nuevoArray[0] = arrayOriginal[0];
        nuevoArray[1] = arrayOriginal[1];
        nuevoArray[2] = arrayOriginal[2];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números para las nuevas posiciones del array
        System.out.println("\n" +
                        "Ingrese dos números para las nuevas posiciones del array:");

        System.out.print("Número 1: ");
        nuevoArray[3] = scanner.nextInt();

        System.out.print("Número 2: ");
        nuevoArray[4] = scanner.nextInt();

        // Imprimir el contenido del nuevo array por consola
        System.out.println("Contenido del nuevo array:");
        System.out.println("[" + nuevoArray[0] + ", " + nuevoArray[1] + ", " + nuevoArray[2] + ", " + nuevoArray[3] + ", " + nuevoArray[4] + "]");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
