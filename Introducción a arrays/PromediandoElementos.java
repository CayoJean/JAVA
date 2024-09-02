import java.util.Scanner;

public class PromediandoElementos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar cuatro elementos enteros
        int[] numeros = new int[4];

        // Pedir al usuario que ingrese los números
        System.out.println("\n" +
                        "Ingrese cuatro números enteros:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Sumar los cuatro elementos manualmente
        int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];

        // Calcular el promedio de los cuatro elementos
        double promedio = suma / 4.0;

        // Imprimir el resultado por consola
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
