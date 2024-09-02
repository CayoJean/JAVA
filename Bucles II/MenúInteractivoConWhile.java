import java.util.Scanner;

public class MenúInteractivoConWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n" +
                                "Menú Interactivo:");
            System.out.println("1.- Comprar Producto");
            System.out.println("2.- Realizar Devolución");
            System.out.println("3.- Ver Mis Pedidos");
            System.out.println("4.- Preguntas Frecuentes");
            System.out.println("5.- Salir");
            System.out.print("Elige Una Opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido comprar un producto.");
                    break;
                case 2:
                    System.out.println("Has elegido realizar una devolución.");
                    break;
                case 3:
                    System.out.println("Has elegido ver tus pedidos.");
                    break;
                case 4:
                    System.out.println("Has elegido ver preguntas frecuentes.");
                    break;
                case 5:
                    System.out.println("Saliste del Menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
