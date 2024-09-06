/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaDeNumeros {
    public static void main(String[] args) {
        // Lee los valores desde el teclado
        ArrayList<Integer> valores = leerValores();
        
        // Calcula la suma y el promedio
        int suma = calcularSuma(valores);
        double promedio = calcularPromedio(valores);
        
        // Muestra los resultados
        mostrarResultados(valores, suma, promedio);
    }
    
    // Método para leer valores
    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce valores enteros (-99 para terminar):");
        while (true) {
            int valor = scanner.nextInt();
            if (valor == -99) {
                break;
            }
            valores.add(valor);
        }
        
        scanner.close(); // Cierra el objeto Scanner aquí
        return valores;
    }
    
    // Método para calcular la suma
    public static int calcularSuma(ArrayList<Integer> valores) {
        int suma = 0;
        Iterator<Integer> iterador = valores.iterator();
        while (iterador.hasNext()) {
            suma += iterador.next();
        }
        return suma;
    }
    
    // Método para calcular el promedio
    public static double calcularPromedio(ArrayList<Integer> valores) {
        if (valores.isEmpty()) {
            return 0; // Evita la división por cero
        }
        int suma = calcularSuma(valores);
        return (double) suma / valores.size();
    }
    
    // Método para mostrar resultados
    public static void mostrarResultados(ArrayList<Integer> valores, int suma, double promedio) {
        System.out.println("\nNúmero total de valores: " + valores.size());
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Promedio de los valores: " + promedio);
        
        // Contar cuántos valores son mayores que la media
        int countMayoresQuePromedio = 0;
        for (int valor : valores) {
            if (valor > promedio) {
                countMayoresQuePromedio++;
            }
        }
        
        System.out.println("Cantidad de valores mayores que la media: " + countMayoresQuePromedio);
    }
}*/







import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaDeNumeros {
    public static void main(String[] args) {
        // Lee los valores desde el teclado
        ArrayList<Integer> valores = leerValores();
        
        // Calcula la suma y el promedio
        int suma = calcularSuma(valores);
        double promedio = calcularPromedio(valores);
        
        // Muestra los resultados
        mostrarResultados(valores, suma, promedio);
    }
    
    // Método para leer valores
    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("\n--- Actividad: Sopa de números ---");
        System.out.println("\nIntroduce valores enteros (-99 para terminar)");
        
        while (true) {
            String entrada = scanner.nextLine(); // Lee la entrada como cadena
            
            // Intentar convertir la entrada a un número entero
            try {
                int valor = Integer.parseInt(entrada);
                
                // Verifica si el valor es -99 para terminar
                if (valor == -99) {
                    break;
                }
                
                // Agrega el valor a la lista
                valores.add(valor);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingresa un número entero válido.");
            }
        }
        
        scanner.close(); // Cierra el objeto Scanner aquí
        return valores;
    }
    
    // Método para calcular la suma
    public static int calcularSuma(ArrayList<Integer> valores) {
        int suma = 0;
        Iterator<Integer> iterador = valores.iterator();
        while (iterador.hasNext()) {
            suma += iterador.next();
        }
        return suma;
    }
    
    // Método para calcular el promedio
    public static double calcularPromedio(ArrayList<Integer> valores) {
        if (valores.isEmpty()) {
            return 0; // Evita la división por cero
        }
        int suma = calcularSuma(valores);
        return (double) suma / valores.size();
    }
    
    // Método para mostrar resultados
    public static void mostrarResultados(ArrayList<Integer> valores, int suma, double promedio) {
        System.out.println("\nNúmero total de valores: " + valores.size());
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Promedio de los valores: " + promedio);
        
        // Contar cuántos valores son mayores que la media
        int countMayoresQuePromedio = 0;
        for (int valor : valores) {
            if (valor > promedio) {
                countMayoresQuePromedio++;
            }
        }
        
        System.out.println("Cantidad de valores mayores que la media: " + countMayoresQuePromedio);
    }
}
