/*import java.util.Scanner;
en decimal
public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" +
                        "Ingrese la temperatura: ");
        String tempInput = scanner.nextLine();

        System.out.print("Ingrese la unidad de medida (C/F): ");
        String unidad = scanner.nextLine().toUpperCase();

        try {
            double temperatura = Double.parseDouble(tempInput);

            if (unidad.equals("C")) {
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.printf("%.2f grados Celsius equivale a %.2f grados Fahrenheit.%n", temperatura, fahrenheit);
            } else if (unidad.equals("F")) {
                double celsius = (temperatura - 32) * 5 / 9;
                System.out.printf("%.2f grados Fahrenheit equivale a %.2f grados Celsius.%n", temperatura, celsius);
            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;
en numero entero
public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" +
                        "Ingrese la temperatura: ");
        String tempInput = scanner.nextLine();

        System.out.print("Ingrese la unidad de medida (C/F): ");
        String unidad = scanner.nextLine().toUpperCase();

        try {
            int temperatura = Integer.parseInt(tempInput);

            if (unidad.equals("C")) {
                int fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.printf("%d grados Celsius equivale a %d grados Fahrenheit.%n", temperatura, fahrenheit);
            } else if (unidad.equals("F")) {
                int celsius = (temperatura - 32) * 5 / 9;
                System.out.printf("%d grados Fahrenheit equivale a %d grados Celsius.%n", temperatura, celsius);
            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }

        scanner.close();
    }
}
*/

import java.util.Scanner;

public class Desafios1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("\n" +
                                "Ingrese la temperatura: ");
            String tempInput = scanner.nextLine().trim();

            if (tempInput.isEmpty()) {
                System.out.println("Error: No ha ingresado una temperatura. Inténtelo de nuevo.");
                continue;
            }

            System.out.print("Ingrese la unidad de medida (C/F): ");
            String unidad = scanner.nextLine().trim().toUpperCase();

            if (unidad.isEmpty()) {
                System.out.println("Error: No ha ingresado una unidad de medida. Inténtelo de nuevo.");
                continue;
            }

            try {
                int temperatura = Integer.parseInt(tempInput);

                if (unidad.equals("C")) {
                    if (temperatura < -273) {
                        System.out.println("Error: La temperatura en Celsius no puede ser menor que -273 grados.");
                        continue;
                    }
                    int fahrenheit = (temperatura * 9 / 5) + 32;
                    System.out.printf("%d grados Celsius equivale a %d grados Fahrenheit.%n", temperatura, fahrenheit);
                } else if (unidad.equals("F")) {
                    if (temperatura < -459) {
                        System.out.println("Error: La temperatura en Fahrenheit no puede ser menor que -459 grados.");
                        continue;
                    }
                    int celsius = (temperatura - 32) * 5 / 9;
                    System.out.printf("%d grados Fahrenheit equivale a %d grados Celsius.%n", temperatura, celsius);
                } else {
                    System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
                continue;
            }

            System.out.print("¿Desea realizar otra conversión? (S/N): ");
            String respuesta = scanner.nextLine().trim().toUpperCase();
            if (!respuesta.equals("S")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}

