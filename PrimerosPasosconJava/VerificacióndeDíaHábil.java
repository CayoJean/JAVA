import java.util.Scanner;

public class VerificacióndeDíaHábil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" +
                        "Ingresa un número del 1 al 7 representando un día de la semana: ");
        int dia = scanner.nextInt();
        String mensaje;

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mensaje = "El día es hábil.";
                break;
            case 6:
            case 7:
                mensaje = "El día no es hábil.";
                break;
            default:
                mensaje = "Número inválido. Por favor ingresa un número del 1 al 7.";
                break;
        }

        System.out.println(mensaje);
        scanner.close();
    }
}