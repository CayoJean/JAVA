import java.util.Scanner;

public class OperacionesBásicas {
    public static void main(String[] args) {
        // Declarar dos variables y asignarles valores
        int num1 = 10;
        int num2 = 5;

        // Realizar las 5 operaciones básicas y mostrar los resultados
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        // Imprimir los resultados de las operaciones con valores predeterminados
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + modulo);

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Por favor, ingresa el primer número: ");
        int numeroUsuario1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numeroUsuario2 = scanner.nextInt();

        // Realizar la suma de los números ingresados por el usuario
        int sumaUsuario = numeroUsuario1 + numeroUsuario2;

        // Imprimir el resultado de la suma
        System.out.println("La suma de " + numeroUsuario1 + " y " + numeroUsuario2 + " es: " + sumaUsuario);

        // Realizar la resta de los números ingresados por el usuario
        int restaUsuario = numeroUsuario1 - numeroUsuario2;


        // Imprimir el resultado de la resta
        System.out.println("La resta de " + numeroUsuario1 + " y " + numeroUsuario2 + " es: " + restaUsuario);




        // Realizar la resta de los números ingresados por el usuario
        int multiplicacionUsuario = numeroUsuario1 * numeroUsuario2;


        // Imprimir el resultado de la resta
        System.out.println("La multiplicacion de " + numeroUsuario1 + " y " + numeroUsuario2 + " es: " + multiplicacionUsuario);





        // Realizar la resta de los números ingresados por el usuario
        int divisionUsuario = numeroUsuario1 / numeroUsuario2;


        // Imprimir el resultado de la resta
        System.out.println("La division de " + numeroUsuario1 + " y " + numeroUsuario2 + " es: " + divisionUsuario);







        // Realizar la resta de los números ingresados por el usuario
        int moduloUsuario = numeroUsuario1 / numeroUsuario2;


        // Imprimir el resultado de la resta
        System.out.println("La modulo de " + numeroUsuario1 + " y " + numeroUsuario2 + " es: " + moduloUsuario);




        // Cerrar el Scanner
        scanner.close();
    }
}
