import java.util.Scanner;

public class TabladeMultiplicar2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasMultiplicar(numeros);
    }

    // Método para solicitar tres números al usuario
    public static int[] pedirNumeros() {
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("\n" +
                                "Por favor, ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    // Método para imprimir las tablas de multiplicar de varios números
    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            imprimirTablaMultiplicar(numero);
        }
    }

    // Método para imprimir la tabla de multiplicar de un número
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println(); // Línea en blanco para separar las tablas
    }
}
