import java.util.Arrays;
import java.util.Scanner;

public class CopiarParteDeArreglo {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo original
        int[] arrayOriginal = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        // Mostrar el arreglo original junto con sus índices
        System.out.println("\n" +
                        "Arreglo original:");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println("Índice " + i + ": " + arrayOriginal[i]);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario los índices inicial y final
        int indiceInicial = -1;
        int indiceFinal = -1;
        boolean indicesValidos = false;
        
        while (!indicesValidos) {
            System.out.print("Ingrese el índice inicial: ");
            indiceInicial = scanner.nextInt();
            
            System.out.print("Ingrese el índice final: ");
            indiceFinal = scanner.nextInt();
            
            // Validar que los índices están dentro del rango y que el índice inicial es menor que el índice final
            if (indiceInicial >= 0 && indiceFinal < arrayOriginal.length && indiceInicial <= indiceFinal) {
                indicesValidos = true;
            } else {
                System.out.println("Índices inválidos. Asegúrese de que el índice inicial es menor o igual al índice final y ambos están dentro del rango del arreglo.");
            }
        }
        
        // Copiar la parte del arreglo comprendida entre los índices inicial y final (inclusive)
        int[] nuevoArreglo = Arrays.copyOfRange(arrayOriginal, indiceInicial, indiceFinal + 1);
        
        // Imprimir el nuevo arreglo
        System.out.println("Nuevo arreglo copiado:");
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.println("Índice " + i + ": " + nuevoArreglo[i]);
        }
        
        scanner.close();
    }
}
