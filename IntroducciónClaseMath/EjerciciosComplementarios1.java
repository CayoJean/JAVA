import java.util.Scanner;

public class EjerciciosComplementarios1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese el límite inferior
            System.out.print("\n" +
                                "Ingresa el límite inferior (número entero): ");
            int limiteInferior = scanner.nextInt();

            // Pedir al usuario que ingrese el límite superior
            System.out.print("Ingresa el límite superior (número entero): ");
            int limiteSuperior = scanner.nextInt();

            // Generar un número aleatorio en el rango especificado
            int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;

            // Mostrar el número aleatorio en pantalla
            System.out.println("Número aleatorio generado entre " + limiteInferior + " y " + limiteSuperior + ": " + numeroAleatorio);
        } finally {
            scanner.close();
        }
    }
}
