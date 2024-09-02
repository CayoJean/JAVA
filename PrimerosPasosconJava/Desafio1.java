import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        
        System.out.println("El número " + numero + " es " + resultado + ".");
        
        scanner.close();
    }
}
