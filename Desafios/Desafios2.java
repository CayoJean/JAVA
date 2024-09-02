/*
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" +
                        "Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (esContrasenaSegura(contrasena)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. No cumple con los siguientes criterios:");
            if (contrasena.length() < 8) {
                System.out.println("- Debe tener al menos 8 caracteres.");
            }
            if (!tieneMayuscula(contrasena)) {
                System.out.println("- Debe contener al menos una letra mayúscula.");
            }
            if (!tieneMinuscula(contrasena)) {
                System.out.println("- Debe contener al menos una letra minúscula.");
            }
            if (!tieneNumero(contrasena)) {
                System.out.println("- Debe contener al menos un número.");
            }
            if (!tieneCaracterEspecial(contrasena)) {
                System.out.println("- Debe contener al menos un carácter especial (por ejemplo, !, @, #, $).");
            }
        }

        scanner.close();
    }

    public static boolean esContrasenaSegura(String contrasena) {
        return contrasena.length() >= 8 &&
                tieneMayuscula(contrasena) &&
                tieneMinuscula(contrasena) &&
                tieneNumero(contrasena) &&
                tieneCaracterEspecial(contrasena);
    }

    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-+";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
*/



import java.util.Scanner;

public class Desafios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contrasenaSegura = false;

        while (!contrasenaSegura) {
            System.out.print("\n" +
                                "Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            contrasenaSegura = esContrasenaSegura(contrasena);

            if (contrasenaSegura) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            } else {
                System.out.println("Contraseña no segura. No cumple con los siguientes criterios:");
                if (contrasena.length() < 8) {
                    System.out.println("- Debe tener al menos 8 caracteres.");
                }
                if (!tieneMayuscula(contrasena)) {
                    System.out.println("- Debe contener al menos una letra mayúscula.");
                }
                if (!tieneMinuscula(contrasena)) {
                    System.out.println("- Debe contener al menos una letra minúscula.");
                }
                if (!tieneNumero(contrasena)) {
                    System.out.println("- Debe contener al menos un número.");
                }
                if (!tieneCaracterEspecial(contrasena)) {
                    System.out.println("- Debe contener al menos un carácter especial (por ejemplo, !, @, #, $, %,^, &, *, (), -, +)");
                }
                if (!tieneLongitudMaxima(contrasena)) {
                    System.out.println("- No debe tener más de 16 caracteres.");
                }
            }
        }

        scanner.close();
    }

    public static boolean esContrasenaSegura(String contrasena) {
        return contrasena.length() >= 8 &&
                contrasena.length() <= 16 &&
                tieneMayuscula(contrasena) &&
                tieneMinuscula(contrasena) &&
                tieneNumero(contrasena) &&
                tieneCaracterEspecial(contrasena);
    }

    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-+";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneLongitudMaxima(String contrasena) {
        return contrasena.length() <= 16;
    }
}
