import java.util.Scanner;

public class JuegoAdivinarPalabra {
    private static final String[] PALABRAS = {"casa", "libro", "computadora", "java", "programacion"};
    private static final int NUMERO_INTENTOS = 5;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = seleccionarPalabraAleatoria();
        String pista = obtenerPista(palabraSecreta);
        int intentosRestantes = NUMERO_INTENTOS;
        boolean palabraAdivinada = false;
        System.out.println();
        System.out.println("\n" +
                        "¡Bienvenido al juego de adivinar la palabra!");
        System.out.println("La palabra tiene " + palabraSecreta.length() + " letras.");
        System.out.println("Pista: " + pista);

        while (intentosRestantes > 0 && !palabraAdivinada) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            if (esLetraValida(letra)) {
                String nuevaPista = comprobarLetra(letra, palabraSecreta, pista);
                if (nuevaPista.equals(pista)) {
                    intentosRestantes--;
                    System.out.println("Letra incorrecta. Te quedan " + intentosRestantes + " intentos.");
                } else {
                    pista = nuevaPista;
                    System.out.println("¡Bien hecho! Pista actual: " + pista);
                }

                if (!pista.contains("_")) {
                    palabraAdivinada = true;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese una letra.");
            }
        }

        if (palabraAdivinada) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, se te acabaron los intentos. La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }

    private static String seleccionarPalabraAleatoria() {
        int indice = (int) (Math.random() * PALABRAS.length);
        return PALABRAS[indice];
    }

    private static String obtenerPista(String palabra) {
        return palabra.replaceAll(".", "_");
    }

    private static String comprobarLetra(char letra, String palabra, String pista) {
        StringBuilder nuevaPista = new StringBuilder(pista);

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                nuevaPista.setCharAt(i, letra);
            }
        }

        return nuevaPista.toString();
    }

    private static boolean esLetraValida(char letra) {
        return Character.isLetter(letra);
    }
}

