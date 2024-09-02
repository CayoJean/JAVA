/*import java.util.Scanner;

public class Calculadora {

    // Variable global para el objeto Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu(); // Llama al método menu() para iniciar la calculadora
    }

    // Método para mostrar el menú y controlar la lógica del bucle
    public static void menu() {
        int opcion;
        double numero1, numero2, resultado = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println();
            System.out.println("\n" + 
                                "----- Calculadora -----");
            System.out.println("Que Operación Deseas Realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = solicitarNumero();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                numero1 = solicitarNumeroDouble();
                
                System.out.print("Ingresa el segundo número: ");
                numero2 = solicitarNumeroDouble();
            } else {
                numero1 = 0;
                numero2 = 0;
            }

            switch (opcion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = dividir(numero1, numero2);
                        System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
            }
            System.out.println(); // Espacio para separar iteraciones
        }
    }

    // Método para solicitar un número entero
    public static int solicitarNumero() {
        int numero = 0;
        boolean esNumeroValido = false;

        while (!esNumeroValido) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
            }
        }
        return numero;
    }

    // Método para solicitar un número decimal (double)
    public static double solicitarNumeroDouble() {
        double numero = 0.0;
        boolean esNumeroValido = false;

        while (!esNumeroValido) {
            try {
                numero = Double.parseDouble(scanner.nextLine());
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número decimal.");
            }
        }
        return numero;
    }

    // Método para sumar dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public static double dividir(double a, double b) {
        return a / b;
    }
}
*/




/*import java.util.Scanner;

public class Calculadora {

    // Variable global para el objeto Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu(); // Llama al método menu() para iniciar la calculadora
    }

    // Método para mostrar el menú y controlar la lógica del bucle
    public static void menu() {
        int opcion;
        int numero1, numero2, resultado = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println();
            System.out.println("\n" +
                                "----- Calculadora -----");
            System.out.println("Que Operación Deseas Realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = solicitarNumero();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                numero1 = solicitarNumero();
                
                System.out.print("Ingresa el segundo número: ");
                numero2 = solicitarNumero();
            } else {
                numero1 = 0;
                numero2 = 0;
            }

            switch (opcion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = dividir(numero1, numero2);
                        System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
            }
            System.out.println(); // Espacio para separar iteraciones
        }
    }

    // Método para solicitar un número entero
    public static int solicitarNumero() {
        int numero = 0;
        boolean esNumeroValido = false;

        while (!esNumeroValido) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
            }
        }
        return numero;
    }

    // Método para sumar dos números enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números enteros
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números enteros
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números enteros
    public static int dividir(int a, int b) {
        return a / b;
    }
}*/




import java.util.Scanner;

public class Calculadora {

    // Variable global para el objeto Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu(); // Llama al método menu() para iniciar la calculadora
    }

    // Método para mostrar el menú y controlar la lógica del bucle
    public static void menu() {
        String opcion;
        int numero1, numero2, resultado = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println();
            System.out.println("\n" +
                                "----- Calculadora -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = solicitarOpcion();

            if (opcion.equals("1") || opcion.equalsIgnoreCase("S") ||
                opcion.equals("2") || opcion.equalsIgnoreCase("R") ||
                opcion.equals("3") || opcion.equalsIgnoreCase("M") ||
                opcion.equals("4") || opcion.equalsIgnoreCase("D")) {
                
                System.out.print("Ingresa el primer número: ");
                numero1 = solicitarNumero();
                
                System.out.print("Ingresa el segundo número: ");
                numero2 = solicitarNumero();
            } else {
                numero1 = 0;
                numero2 = 0;
            }

            switch (opcion.toUpperCase()) {
                case "1":
                case "S":
                    resultado = sumar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                    break;
                case "2":
                case "R":
                    resultado = restar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                    break;
                case "3":
                case "M":
                    resultado = multiplicar(numero1, numero2);
                    System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                    break;
                case "4":
                case "D":
                    if (numero2 != 0) {
                        resultado = dividir(numero1, numero2);
                        System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case "5":
                case "X":
                    salir = true;
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5 o las letras correspondientes.");
            }
            System.out.println(); // Espacio para separar iteraciones
        }
    }

    // Método para solicitar una opción del menú
    public static String solicitarOpcion() {
        return scanner.nextLine().trim();
    }

    // Método para solicitar un número entero
    public static int solicitarNumero() {
        int numero = 0;
        boolean esNumeroValido = false;

        while (!esNumeroValido) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
            }
        }
        return numero;
    }

    // Método para sumar dos números enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números enteros
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números enteros
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números enteros
    public static int dividir(int a, int b) {
        return a / b;
    }
}
