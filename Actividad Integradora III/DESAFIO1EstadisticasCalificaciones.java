/*import java.util.ArrayList;
import java.util.Random;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        // Generar arreglo de calificaciones aleatorias (como Strings)
        int numCalificaciones = 20; // Ejemplo: 20 calificaciones
        String[] calificaciones = new String[numCalificaciones];
        generarCalificacionesAleatorias(calificaciones);

        // Convertir calificaciones a double y separar en tres arreglos
        ArrayList<Double> desaprobado = new ArrayList<>();
        ArrayList<Double> aprobado = new ArrayList<>();
        ArrayList<Double> excelente = new ArrayList<>();

        for (String calificacion : calificaciones) {
            double calif = Double.parseDouble(calificacion);
            if (calif < 4) {
                desaprobado.add(calif);
            } else if (calif >= 4 && calif < 10) {
                aprobado.add(calif);
            } else if (calif >= 10) {
                excelente.add(calif);
            }
        }

        // Calcular promedios
        double promedioOriginal = calcularPromedio(convertirArrayListADouble(calificaciones));
        double promedioDesaprobado = calcularPromedio(desaprobado);
        double promedioAprobado = calcularPromedio(aprobado);
        double promedioExcelente = calcularPromedio(excelente);

        // Imprimir resultados
        System.out.println("\n" +
                        "Calificaciones originales: ");
        imprimirArreglo(calificaciones);
        System.out.println("\nPromedio general: " + promedioOriginal);

        System.out.println("\nDesaprobados: ");
        imprimirArreglo(desaprobado);
        System.out.println("Promedio desaprobados: " + promedioDesaprobado);

        System.out.println("\nAprobados: ");
        imprimirArreglo(aprobado);
        System.out.println("Promedio aprobados: " + promedioAprobado);

        System.out.println("\nExcelentes: ");
        imprimirArreglo(excelente);
        System.out.println("Promedio excelentes: " + promedioExcelente);
    }

    public static void generarCalificacionesAleatorias(String[] calificaciones) {
        Random rand = new Random();
        for (int i = 0; i < calificaciones.length; i++) {
            double calificacion = rand.nextDouble() * 12; // Generar calificaciones entre 0 y 12
            calificaciones[i] = String.format("%.2f", calificacion); // Formatear con dos decimales
        }
    }

    public static double calcularPromedio(ArrayList<Double> calificaciones) {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    public static double calcularPromedio(double[] calificaciones) {
        if (calificaciones.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static ArrayList<Double> convertirArrayListADouble(String[] calificaciones) {
        ArrayList<Double> lista = new ArrayList<>();
        for (String calificacion : calificaciones) {
            lista.add(Double.parseDouble(calificacion));
        }
        return lista;
    }

    public static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void imprimirArreglo(ArrayList<Double> arreglo) {
        for (double elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
*/


import java.util.ArrayList;
import java.util.Scanner;

public class DESAFIO1EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicitar al usuario el número de calificaciones
            System.out.print("\n" +
                                "Ingrese el número de calificaciones: ");
            int numCalificaciones = scanner.nextInt();
            
            // Validar el número de calificaciones ingresado
            if (numCalificaciones <= 0) {
                System.out.println("El número de calificaciones debe ser un número positivo.");
                return;
            }
            
            // Crear arreglo para almacenar las calificaciones
            String[] calificaciones = new String[numCalificaciones];
            
            // Solicitar al usuario que ingrese las calificaciones
            System.out.println("Ingrese las calificaciones:");
            for (int i = 0; i < numCalificaciones; i++) {
                System.out.print("Calificación " + (i + 1) + ": ");
                calificaciones[i] = scanner.next();
            }
            
            // Convertir calificaciones a double y separar en tres arreglos
            ArrayList<Double> desaprobado = new ArrayList<>();
            ArrayList<Double> aprobado = new ArrayList<>();
            ArrayList<Double> excelente = new ArrayList<>();
            
            for (String calificacion : calificaciones) {
                double calif = Double.parseDouble(calificacion);
                if (calif < 4) {
                    desaprobado.add(calif);
                } else if (calif >= 4 && calif < 10) {
                    aprobado.add(calif);
                } else if (calif >= 10) {
                    excelente.add(calif);
                }
            }
            
            // Calcular promedios
            double promedioOriginal = calcularPromedio(convertirArrayListADouble(calificaciones));
            double promedioDesaprobado = calcularPromedio(desaprobado);
            double promedioAprobado = calcularPromedio(aprobado);
            double promedioExcelente = calcularPromedio(excelente);
            
            // Imprimir resultados
            System.out.println("Calificaciones originales: ");
            imprimirArreglo(calificaciones);
            System.out.println("\nPromedio general: " + promedioOriginal);
            
            System.out.println("\nDesaprobados: ");
            imprimirArreglo(desaprobado);
            System.out.println("Promedio desaprobados: " + promedioDesaprobado);
            
            System.out.println("\nAprobados: ");
            imprimirArreglo(aprobado);
            System.out.println("Promedio aprobados: " + promedioAprobado);
            
            System.out.println("\nExcelentes: ");
            imprimirArreglo(excelente);
            System.out.println("Promedio excelentes: " + promedioExcelente);
        } finally {
            // Cerrar el objeto Scanner para liberar recursos
            scanner.close();
        }
    }
    
    public static double calcularPromedio(ArrayList<Double> calificaciones) {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }
    
    public static double calcularPromedio(double[] calificaciones) {
        if (calificaciones.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    
    public static ArrayList<Double> convertirArrayListADouble(String[] calificaciones) {
        ArrayList<Double> lista = new ArrayList<>();
        for (String calificacion : calificaciones) {
            lista.add(Double.parseDouble(calificacion));
        }
        return lista;
    }
    
    public static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    
    public static void imprimirArreglo(ArrayList<Double> arreglo) {
        for (double elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
