package EjerciciosComplementarios;


import java.util.Scanner;

// Excepción personalizada para manejar errores de longitud de palabra clave
class LongitudInvalidaException extends Exception {
    public LongitudInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para manejar errores de formato de palabra clave
class FormatoInvalidoException extends Exception {
    public FormatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// Clase principal para manejar la palabra clave
public class PalabraClave {
    private String clave; // Atributo para almacenar la palabra clave

    // Método para ingresar y validar la palabra clave
    public void ingresarPalabraClave() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("\nIngresa una palabra clave: ");
        String input = scanner.nextLine(); // Leer la entrada del usuario

        try {
            // Validar la longitud de la palabra clave
            validarLongitud(input);
            // Validar el formato de la palabra clave
            validarFormato(input);
            // Si pasa todas las validaciones, asignar la palabra clave
            clave = input;
            // Utilizar el atributo clave
            System.out.println("La palabra clave '" + clave + "' es válida para ser utilizada.");
        } catch (LongitudInvalidaException | FormatoInvalidoException e) {
            // Manejar excepciones y mostrar el mensaje de error específico
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }

    // Método para validar la longitud de la palabra clave
    private void validarLongitud(String input) throws LongitudInvalidaException {
        if (input.length() < 8) {
            throw new LongitudInvalidaException("La palabra clave debe tener al menos 8 caracteres.");
        }
    }

    // Método para validar el formato de la palabra clave
    private void validarFormato(String input) throws FormatoInvalidoException {
        int contadorNumeros = 0;
        boolean contieneZ = false;

        // Contar los números y verificar si contiene la letra 'z'
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                contadorNumeros++;
            }
            if (c == 'z' || c == 'Z') { // Permitir 'z' mayúscula o minúscula
                contieneZ = true;
            }
        }

        if (contadorNumeros != 4) {
            throw new FormatoInvalidoException("La palabra clave debe contener exactamente 4 números.");
        }
        if (!contieneZ) {
            throw new FormatoInvalidoException("La palabra clave debe contener la letra 'z'.");
        }
    }

    public static void main(String[] args) {
        PalabraClave pc = new PalabraClave(); // Crear una instancia de PalabraClave
        pc.ingresarPalabraClave(); // Invocar el método para ingresar la palabra clave
    }
}




/* 

import java.util.Scanner;

// Excepción personalizada para manejar errores de longitud de palabra clave
class LongitudInvalidaException extends Exception {
    public LongitudInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para manejar errores de formato de palabra clave
class FormatoInvalidoException extends Exception {
    public FormatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// Clase principal para manejar la palabra clave
public class PalabraClave {



    public static void main(String[] args) {
        PalabraClave pc = new PalabraClave(); // Crear una instancia de PalabraClave
        pc.ingresarPalabraClave(); // Invocar el método para ingresar la palabra clave
    }



    private String clave; // Atributo para almacenar la palabra clave

    // Método para ingresar y validar la palabra clave
    public void ingresarPalabraClave() {
        Scanner scanner = new Scanner(System.in);
        boolean esValida = false; // Indicador para controlar el bucle

        while (!esValida) {
            System.out.println();
            System.out.print("\nIngresa una palabra clave: ");
            String input = scanner.nextLine(); // Leer la entrada del usuario

            try {
                // Validar la longitud de la palabra clave
                validarLongitud(input);
                // Validar el formato de la palabra clave
                validarFormato(input);
                // Si pasa todas las validaciones, asignar la palabra clave
                clave = input;
                esValida = true; // La palabra clave es válida, salir del bucle
                // Utilizar el atributo clave
                System.out.println("La palabra clave '" + clave + "' es válida para ser utilizada.");
            } catch (LongitudInvalidaException | FormatoInvalidoException e) {
                // Manejar excepciones y mostrar el mensaje de error específico
                System.out.println("Error: " + e.getMessage());
                // El bucle continuará pidiendo al usuario que ingrese la palabra clave
            }
        }

        scanner.close(); // Cerrar el Scanner al final del programa
    }

    // Método para validar la longitud de la palabra clave
    private void validarLongitud(String input) throws LongitudInvalidaException {
        if (input.length() < 8) {
            throw new LongitudInvalidaException("La palabra clave debe tener al menos 8 caracteres.");
        }
    }

    // Método para validar el formato de la palabra clave
    private void validarFormato(String input) throws FormatoInvalidoException {
        int contadorNumeros = 0;
        boolean contieneZ = false;

        // Contar los números y verificar si contiene la letra 'z'
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                contadorNumeros++;
            }
            if (c == 'z' || c == 'Z') { // Permitir 'z' mayúscula o minúscula
                contieneZ = true;
            }
        }

        if (contadorNumeros != 4) {
            throw new FormatoInvalidoException("La palabra clave debe contener exactamente 4 números.");
        }
        if (!contieneZ) {
            throw new FormatoInvalidoException("La palabra clave debe contener la letra 'z'.");
        }
    }
}
*/