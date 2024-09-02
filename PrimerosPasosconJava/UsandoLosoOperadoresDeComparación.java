import java.util.Scanner;

public class UsandoLosoOperadoresDeComparación {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1
        // Solicitar al usuario que ingrese dos números
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // A. Compara si el primer número es mayor al segundo número
        boolean esMayor = numero1 > numero2;
        System.out.println("El primer número (" + numero1 + ") es mayor al segundo número (" + numero2 + "): " + esMayor);

        // B. Verifica si el primer número es distinto al segundo número
        boolean esDistinto = numero1 != numero2;
        System.out.println("El primer número (" + numero1 + ") es distinto al segundo número (" + numero2 + "): " + esDistinto);

        // C. Verifica si el primer número es divisible por 2
        boolean esDivisiblePor2 = numero1 % 2 == 0;
        System.out.println("El primer número (" + numero1 + ") es divisible por 2: " + esDivisiblePor2);

        // Parte 2
        // Solicitar al usuario que ingrese otros dos números
        System.out.print("Por favor, ingresa el tercer número: ");
        int numero3 = scanner.nextInt();
        System.out.print("Por favor, ingresa el cuarto número: ");
        int numero4 = scanner.nextInt();

        // A. Verificar si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4
        boolean condicion1 = numero1 > numero2 && numero3 > numero4;
        System.out.println("El número 1 (" + numero1 + ") es mayor al número 2 (" + numero2 + ") y el número 3 (" + numero3 + ") es mayor al número 4 (" + numero4 + "): " + condicion1);

        // B. Verificar si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4
        boolean condicion2 = numero1 > numero2 || numero3 > numero4;
        System.out.println("El número 1 (" + numero1 + ") es mayor al número 2 (" + numero2 + ") o el número 3 (" + numero3 + ") es mayor al número 4 (" + numero4 + "): " + condicion2);

        // Cerrar el Scanner
        scanner.close();
    }
}

