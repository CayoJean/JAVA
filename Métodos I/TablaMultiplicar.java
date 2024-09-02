import java.util.Scanner;

public class TablaMultiplicar {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
    }

    // Método para solicitar un número al usuario
    public static int pedirNumero() {
        System.out.println();
        System.out.print("\n" +
                        "Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        return numero;
    }

    // Método para imprimir la tabla de multiplicar de un número
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
