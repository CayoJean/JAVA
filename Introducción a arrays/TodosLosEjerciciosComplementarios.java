import java.util.Scanner;
import java.util.Arrays;

public class TodosLosEjerciciosComplementarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Actividad 1: Generando un número aleatorio entre dos límites y contando elementos pares
        System.out.print("\n" +
                        "Ingrese el límite inferior para generar números aleatorios: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Ingrese el límite superior para generar números aleatorios: ");
        int limiteSuperior = scanner.nextInt();

        // Generar array de seis elementos con números aleatorios entre los límites dados
        int[] numerosAleatorios = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosAleatorios[i] = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
        }

        // Contar elementos pares en el array generado
        int contadorPares = 0;
        for (int num : numerosAleatorios) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }

        // Imprimir resultados de la primera actividad
        System.out.println("\n=========== Actividad 1: Generando un número aleatorio entre dos límites y contando elementos pares ===========");
        System.out.println("Array generado: " + Arrays.toString(numerosAleatorios));
        System.out.println("Cantidad de elementos pares: " + contadorPares);

        // Actividad 2: Sumando elementos en posiciones pares
        // Crear array de tamaño 5 con números ingresados por el usuario
        int[] numerosUsuario = new int[5];
        System.out.println("\n=========== Actividad 2: Sumando elementos en posiciones pares ===========");
        System.out.println("Ingrese cinco números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = scanner.nextInt();
        }

        // Sumar elementos en posiciones pares (0, 2, 4)
        int sumaPosicionesPares = numerosUsuario[0] + numerosUsuario[2] + numerosUsuario[4];

        // Imprimir resultados de la segunda actividad
        System.out.println("Array ingresado: " + Arrays.toString(numerosUsuario));
        System.out.println("La suma de los elementos en posiciones pares es: " + sumaPosicionesPares);

        // Actividad 3: Ordenando nombres alfabéticamente
        // Crear array de tamaño 4 para almacenar nombres ingresados por el usuario
        String[] nombres = new String[4];
        System.out.println("\n=========== Actividad 3: Ordenando nombres alfabéticamente ===========");
        System.out.println("Ingrese cuatro nombres:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.next();
        }

        // Ordenar nombres alfabéticamente
        Arrays.sort(nombres);

        // Imprimir resultados de la tercera actividad
        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
