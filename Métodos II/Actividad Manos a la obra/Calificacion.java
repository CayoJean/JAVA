/*import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una puntuación entre 0 y 100: ");
        int puntuacion = solicitarPuntuacion(scanner);
        
        String calificacion = obtenerNota(puntuacion);
        System.out.println("La calificación correspondiente es: " + calificacion);
        
        scanner.close();
    }

    // Método para solicitar una puntuación válida entre 0 y 100
    public static int solicitarPuntuacion(Scanner scanner) {
        int puntuacion = -1;
        boolean esValido = false;
        
        while (!esValido) {
            try {
                puntuacion = Integer.parseInt(scanner.nextLine());
                if (puntuacion >= 0 && puntuacion <= 100) {
                    esValido = true;
                } else {
                    System.out.println("Entrada no válida. Ingresa un número entre 0 y 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingresa un número entero.");
            }
        }
        
        return puntuacion;
    }

    // Método que devuelve la calificación según la puntuación usando switch expression
    public static String obtenerNota(int puntuacion) {
        return switch (puntuacion / 10) {
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}*/



import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.print("\n" +
                                "Ingresa Una Puntuación Entre 0 y 100: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("X") || entrada.equals("0")) {
                continuar = false;
                System.out.println("¡Vuelve Pronto! Has Finalizado.");
            } else {
                try {
                    int puntuacion = Integer.parseInt(entrada);
                    
                    if (puntuacion >= 0 && puntuacion <= 100) {
                        String calificacion = obtenerNota(puntuacion);
                        System.out.println("La Calificación Correspondiente Es: " + calificacion);
                    } else {
                        System.out.println("Entrada No Válida. Ingresa Un Número Entre 0 y 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada No Válida. Ingresa Un Número Entero (0 Salir)");
                }
            }
        }
        
        scanner.close();
    }

    // Método que devuelve la calificación según la puntuación usando switch expression
    public static String obtenerNota(int puntuacion) {
        return switch (puntuacion / 10) {
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}
