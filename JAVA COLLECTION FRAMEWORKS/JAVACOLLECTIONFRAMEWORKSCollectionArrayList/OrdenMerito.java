/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenMerito {
    public static void main(String[] args) {
        // Inicializa el ArrayList para almacenar las notas
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        // Bucle para solicitar al usuario que ingrese números
        while (continuar.equalsIgnoreCase("sí") || continuar.equalsIgnoreCase("si")) {
            System.out.print("Ingresa una nota (entre 1 y 10): ");
            int nota;
            try {
                nota = Integer.parseInt(scanner.nextLine());
                // Verifica que la nota esté dentro del rango permitido
                if (nota >= 1 && nota <= 10) {
                    notas.add(nota);
                } else {
                    System.out.println("Error: La nota debe estar entre 1 y 10.");
                    continue;  // Vuelve a pedir la nota sin preguntar si desea continuar
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingresa un número entero.");
                continue;  // Vuelve a pedir la nota sin preguntar si desea continuar
            }

            // Pregunta al usuario si desea agregar otra nota
            System.out.print("¿Deseas agregar otra nota? (sí/no): ");
            continuar = scanner.nextLine().trim().toLowerCase();
        }

        // Ordena la lista en orden descendente
        Collections.sort(notas, Collections.reverseOrder());

        // Imprime la lista ordenada en orden descendente
        System.out.println("\nNotas en orden descendente:");
        for (int nota : notas) {
            System.out.println(nota);
        }

        // Imprime la lista ordenada en orden ascendente
        System.out.println("\nNotas en orden ascendente:");
        Collections.sort(notas);  // Ordena en orden ascendente
        for (int nota : notas) {
            System.out.println(nota);
        }

        // Cierra el objeto Scanner
        scanner.close();
    }
}*/






import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenMerito {
    public static void main(String[] args) {
        // Inicializa el ArrayList para almacenar las notas
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        // Bucle para solicitar al usuario que ingrese números
        while (continuar.equalsIgnoreCase("sí") || continuar.equalsIgnoreCase("si")) {
            System.out.println();
            System.out.println("\n--- Actividad: Orden de mérito ---");
            System.out.print("\nIngresa una nota (entre 1 y 10): ");
            int nota;
            try {
                nota = Integer.parseInt(scanner.nextLine());
                // Verifica que la nota esté dentro del rango permitido
                if (nota >= 1 && nota <= 10) {
                    notas.add(nota);
                } else {
                    System.out.println("Error: La nota debe estar entre 1 y 10.");
                    continue;  // Vuelve a pedir la nota sin preguntar si desea continuar
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingresa un número entero.");
                continue;  // Vuelve a pedir la nota sin preguntar si desea continuar
            }

            // Bucle para validar la entrada del usuario en la pregunta sí/no
            while (true) {
                System.out.print("¿Deseas agregar otra nota? (sí/no): ");
                continuar = scanner.nextLine().trim().toLowerCase();

                if (continuar.equals("sí") || continuar.equals("si") || continuar.equals("no")) {
                    break;  // Sale del bucle si la respuesta es válida
                } else {
                    System.out.println("Error: por favor responde con 'sí' o 'no'.");
                }
            }
        }

        // Ordena la lista en orden descendente
        Collections.sort(notas, Collections.reverseOrder());

        // Imprime la lista ordenada en orden descendente
        System.out.println("\nNotas en orden descendente:");
        for (int nota : notas) {
            System.out.println(nota);
        }

        // Imprime la lista ordenada en orden ascendente
        System.out.println("\nNotas en orden ascendente:");
        Collections.sort(notas);  // Ordena en orden ascendente
        for (int nota : notas) {
            System.out.println(nota);
        }

        // Cierra el objeto Scanner
        scanner.close();
    }
}

