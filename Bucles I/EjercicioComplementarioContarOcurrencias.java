/*import java.util.Scanner;

public class EjercicioComplementarioContarOcurrencias {
    public static void main(String[] args) {
        // Frase elegida para inicializar el array (puedes cambiarla según tus necesidades)
        String frase = "aprendiendo java con mucho entusiasmo y dedicacion";
        
        // Crear un array de caracteres de 50 elementos (rellenando con espacios si es necesario)
        char[] caracteres = new char[50];
        
        // Inicializar el array con la frase
        for (int i = 0; i < 50; i++) {
            if (i < frase.length()) {
                caracteres[i] = frase.charAt(i);
            } else {
                caracteres[i] = ' ';
            }
        }
        
        // Solicitar al usuario un carácter objetivo
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" +
                        "Ingresa el carácter a buscar: ");
        char objetivo = scanner.next().charAt(0);
        
        // Contar cuántas veces aparece el carácter objetivo en el array
        int contador = 0;
        for (char c : caracteres) {
            if (c == objetivo) {
                contador++;
            }
        }
        
        // Mostrar el resultado por consola
        if (contador > 0) {
            System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
*/


import java.util.Scanner;

public class EjercicioComplementarioContarOcurrencias {
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("\n" +
                        "Ingresa una frase (máximo 50 caracteres): ");
        String frase = scanner.nextLine();

        // Asegurarse de que la frase no tenga más de 50 caracteres
        if (frase.length() > 50) {
            frase = frase.substring(0, 50);
        }

        // Crear un array de caracteres de 50 elementos (rellenando con espacios si es necesario)
        char[] caracteres = new char[50];
        
        // Inicializar el array con la frase
        for (int i = 0; i < 50; i++) {
            if (i < frase.length()) {
                caracteres[i] = frase.charAt(i);
            } else {
                caracteres[i] = ' ';
            }
        }
        
        // Mostrar la frase ingresada
        System.out.println("Frase ingresada: " + frase);

        // Solicitar al usuario un carácter objetivo
        System.out.print("Ingresa el carácter a buscar: ");
        char objetivo = scanner.next().charAt(0);
        
        // Contar cuántas veces aparece el carácter objetivo en el array
        int contador = 0;
        for (char c : caracteres) {
            if (c == objetivo) {
                contador++;
            }
        }
        
        // Mostrar el resultado por consola
        if (contador > 0) {
            System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
