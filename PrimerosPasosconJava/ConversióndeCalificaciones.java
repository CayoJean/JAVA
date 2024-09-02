import java.util.Scanner;

public class ConversióndeCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" +
                        "Ingresa una calificación numérica del 1 al 5: ");
        int calificacion = scanner.nextInt();

        String calificacionEnLetras = "";

        switch (calificacion) {
            case 1:
                calificacionEnLetras = "Muy deficiente";
                break;
            case 2:
                calificacionEnLetras = "Deficiente";
                break;
            case 3:
                calificacionEnLetras = "Suficiente";
                break;
            case 4:
                calificacionEnLetras = "Notable";
                break;
            case 5:
                calificacionEnLetras = "Sobresaliente";
                break;
            default:
                calificacionEnLetras = "Número inválido. Por favor ingresa un número del 1 al 5.";
                break;
        }

        System.out.println(calificacionEnLetras);
        scanner.close();
    }
}