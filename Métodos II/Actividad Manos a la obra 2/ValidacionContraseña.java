/*import java.util.Scanner;

public class ValidacionContraseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("\n" +
                        "Ingresa una contraseña para verificar su seguridad: ");
        String contrasena = scanner.nextLine();
        
        if (esSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura. Asegúrate de cumplir todos los criterios.");
        }
        
        scanner.close();
    }

    // Método para verificar si la contraseña cumple con todos los criterios
    public static boolean esSegura(String contrasena) {
        return tieneLongitudCorrecta(contrasena) &&
               tieneMayuscula(contrasena) &&
               tieneMinuscula(contrasena) &&
               tieneNumero(contrasena) &&
               tieneCaracterEspecial(contrasena);
    }

    // Verifica si la contraseña tiene al menos 8 caracteres
    public static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    // Verifica si la contraseña contiene al menos una letra mayúscula
    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos una letra minúscula
    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos un número
    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos un carácter especial
    public static boolean tieneCaracterEspecial(String contrasena) {
        // Definir caracteres especiales comunes
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?";

        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}
*/



import java.util.Scanner;

public class ValidacionContraseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.print("\n" +
                                "Ingresa Una Contraseña Para Verificar Su Seguridad: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("X") || entrada.equals("0")) {
                continuar = false;
                System.out.println("¡Vuelve Pronto! Has Finalizado..");
            } else {
                String resultado = validarContrasena(entrada);
                if (resultado.isEmpty()) {
                    System.out.println("La Contraseña Es Segura.");
                } else {
                    System.out.println("La Contraseña No Es Segura. Asegúrate de Cumplir Los Siguientes Criterios:");
                    System.out.println(resultado);
                }
            }
        }

        scanner.close();
    }

    // Método para validar la contraseña y devolver un mensaje con los criterios no cumplidos
    public static String validarContrasena(String contrasena) {
        StringBuilder mensaje = new StringBuilder();

        if (!tieneLongitudCorrecta(contrasena)) {
            mensaje.append("- La Contraseña Debe Tener al Menos 8 Caracteres.\n");
        }
        if (!tieneMayuscula(contrasena)) {
            mensaje.append("- La Contraseña Debe Contener Al Menos Una Letra Mayúscula.\n");
        }
        if (!tieneMinuscula(contrasena)) {
            mensaje.append("- La Contraseña Debe Contener Al Menos Una Letra Minúscula.\n");
        }
        if (!tieneNumero(contrasena)) {
            mensaje.append("- La Contraseña Debe Contener Al Menos Un Número.\n");
        }
        if (!tieneCaracterEspecial(contrasena)) {
            mensaje.append("- La Contraseña Debe Contener Al Menos Un Carácter Especial (Por Rjemplo, !, @, #, $).\n");
        }

        return mensaje.toString();
    }

    // Verifica si la contraseña tiene al menos 8 caracteres
    public static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    // Verifica si la contraseña contiene al menos una letra mayúscula
    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos una letra minúscula
    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos un número
    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos un carácter especial
    public static boolean tieneCaracterEspecial(String contrasena) {
        // Definir caracteres especiales comunes
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?";

        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}
