import java.util.Random;

public class ContarElementosPares {
    public static void main(String[] args) {
        // Crear una instancia de Random
        Random random = new Random();

        // Definir un array de enteros con 10 elementos
        int[] numeros = new int[10];

        // Inicializar cada elemento con un número aleatorio menor a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        // Imprimir todos los elementos del array en una única línea
        System.out.print("\n" +
                        "Elementos del array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Contar los elementos pares
        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        // Mostrar el total de elementos pares en la consola
        System.out.println("Total de elementos pares: " + contadorPares);
    }
}
