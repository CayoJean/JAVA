import java.util.Scanner;
public class Divisibilidad {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
// Solicitar al usuario que ingrese un número
System.out.print("Ingrese un número: ");
int numero = scanner.nextInt();
// Determinar si el número es divisible por 5, por 3, por ambos o por ninguno

if (numero % 5 == 0 && numero % 3 == 0) {
System.out.println("El número es divisible por 5 y por 3.");

} else if (numero % 5 == 0) {
System.out.println("El número es divisible por 5.");
} else if (numero % 3 == 0) {
System.out.println("El número es divisible por 3.");
} else {
System.out.println("El número no es divisible ni por 5 ni por 3.");
}
scanner.close();
}}