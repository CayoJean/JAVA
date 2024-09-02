import java.util.Random;

public class DESAFIO1GeneradorContraseña {
    public static void main(String[] args) {
        // Definir la longitud de la contraseña
        int longitud = 10; // Puedes cambiar esta longitud según lo desees
        
        // Crear un arreglo de caracteres para almacenar la contraseña
        char[] contrasena = new char[longitud];
        
        // Generar la contraseña
        generarContrasena(contrasena);
        
        // Convertir el arreglo de caracteres en un String
        String contrasenaStr = new String(contrasena);
        
        // Imprimir la contraseña generada
        System.out.println("\n" +
                        "Contraseña generada: " + contrasenaStr);
    }
    
    public static void generarContrasena(char[] contrasena) {
        Random rand = new Random();
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        
        for (int i = 0; i < contrasena.length; i++) {
            contrasena[i] = obtenerCaracterAleatorio(rand);
            // Verificar el tipo de carácter
            if (Character.isUpperCase(contrasena[i])) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(contrasena[i])) {
                tieneMinuscula = true;
            } else if (Character.isDigit(contrasena[i])) {
                tieneDigito = true;
            }
        }
        
        // Asegurarse de que la contraseña contenga al menos una letra mayúscula, una minúscula y un dígito
        if (!tieneMayuscula) {
            contrasena[rand.nextInt(contrasena.length)] = obtenerMayusculaAleatoria(rand);
        }
        if (!tieneMinuscula) {
            contrasena[rand.nextInt(contrasena.length)] = obtenerMinusculaAleatoria(rand);
        }
        if (!tieneDigito) {
            contrasena[rand.nextInt(contrasena.length)] = obtenerDigitoAleatorio(rand);
        }
    }
    
    public static char obtenerCaracterAleatorio(Random rand) {
        int tipo = rand.nextInt(3);
        switch (tipo) {
            case 0:
                return obtenerMayusculaAleatoria(rand);
            case 1:
                return obtenerMinusculaAleatoria(rand);
            default:
                return obtenerDigitoAleatorio(rand);
        }
    }
    
    public static char obtenerMayusculaAleatoria(Random rand) {
        return (char) ('A' + rand.nextInt(26));
    }
    
    public static char obtenerMinusculaAleatoria(Random rand) {
        return (char) ('a' + rand.nextInt(26));
    }
    
    public static char obtenerDigitoAleatorio(Random rand) {
        return (char) ('0' + rand.nextInt(10));
    }
}
