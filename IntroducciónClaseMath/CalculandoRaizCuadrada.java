/*import java.util.Scanner;

public class CalculandoRaizCuadrada {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese un número positivo
            System.out.print("\n" +
                                "Ingresa un número positivo: ");
            double numero = scanner.nextDouble();

            // Verificar si el número es negativo
            if (numero < 0) {
                // Mostrar un mensaje adecuado si el número es negativo
                System.out.println("El número ingresado es negativo. Por favor, ingresa un número positivo.");
            } else {
                // Calcular la raíz cuadrada utilizando el método sqrt() de la clase Math
                double raizCuadrada = Math.sqrt(numero);

                // Mostrar la raíz cuadrada en pantalla
                System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
*/


import java.util.Scanner;

public class CalculandoRaizCuadrada {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese un número positivo
            System.out.print("\n" +
                                "Ingresa un número positivo: ");
            double numero = scanner.nextDouble();

            // Verificar si el número es negativo
            if (numero < 0) {
                // Mostrar un mensaje adecuado si el número es negativo
                System.out.println("El número ingresado es negativo. Por favor, ingresa un número positivo.");
            } else {
                // Calcular la raíz cuadrada utilizando el método sqrt() de la clase Math
                double raizCuadrada = Math.sqrt(numero);

                // Convertir el resultado a entero
                int raizCuadradaEntera = (int) raizCuadrada;

                // Mostrar la raíz cuadrada en pantalla
                System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadradaEntera);
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
