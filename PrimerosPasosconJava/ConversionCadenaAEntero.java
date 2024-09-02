import java.util.Scanner;

public class ConversionCadenaAEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("\n" +
                            "Ingrese una cadena que represente un número entero: ");
            String input = scanner.nextLine();
            
            
            int numero = Integer.parseInt(input);
            
            
            System.out.println("El número entero es: " + numero);
            
        } catch (NumberFormatException e) {
            
            System.out.println("Error: La cadena ingresada no puede ser convertida en un número entero.");
        } finally {
            
            scanner.close();
        }
    }
}
