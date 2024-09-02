/*import java.util.Scanner;

public class SquareDrawer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n" +
                                "Ingresa el tamaño del cuadrado (o 0 para salir): ");
            int size = scanner.nextInt();

            if (size == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }

            drawSquare(size);
        }

        scanner.close();
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/




import java.util.Scanner;

public class DOSDibujandoCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n" +
                                "Ingresa el Tamaño del Cuadrado (Escribe 0 para Salir): ");
            int size = scanner.nextInt();

            if (size == 0) {
                System.out.println("Salisté del Programa.");
                break;
            }

            if (size < 2) {
                System.out.println("El Tamaño Debe Ser al Menos 2 para Dibujar un Cuadrado con Bordes.");
            } else {
                drawSquare(size);
            }
        }

        scanner.close();
    }

    public static void drawSquare(int size) {
        // Dibuja la primera fila
        for (int j = 0; j < size; j++) {
            System.out.print("*");
        }
        System.out.println();

        // Dibuja las filas intermedias
        for (int i = 1; i < size - 1; i++) {
            System.out.print("*"); // Primer asterisco
            for (int j = 1; j < size - 1; j++) {
                System.out.print(" "); // Espacios interiores
            }
            System.out.print("*"); // Último asterisco
            System.out.println();
        }

        // Dibuja la última fila si el tamaño es mayor a 1
        if (size > 1) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

