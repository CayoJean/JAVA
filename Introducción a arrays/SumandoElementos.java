public class SumandoElementos {
    public static void main(String[] args) {
        // Crear un array con tres elementos enteros
        int[] numeros = {5, 10, 15};

        // Sumar los tres elementos manualmente
        int suma = numeros[0] + numeros[1] + numeros[2];

        // Imprimir el resultado por consola
        System.out.println("\n" +
                            "La suma de los elementos es: " + suma);
    }
}



/*import java.util.Scanner;

public class SumandoElementos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar tres elementos enteros
        int[] numeros = new int[3];

        // Pedir al usuario que ingrese los números
        System.out.println("\n" +
                        "Ingrese tres números enteros:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Sumar los tres elementos manualmente
        int suma = numeros[0] + numeros[1] + numeros[2];

        // Imprimir el resultado por consola
        System.out.println("La suma de los elementos es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
*/