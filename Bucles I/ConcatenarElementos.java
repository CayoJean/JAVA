public class ConcatenarElementos {
    public static void main(String[] args) {
        // Definir un array de cadenas con el tamaño y los valores que prefieras
        String[] palabras = {"Hola", "mundo", "esto", "es", "un", "ejemplo"};

        // Inicializar una variable para almacenar la cadena concatenada
        StringBuilder cadenaConcatenada = new StringBuilder();

        // Recorrer el array y concatenar los elementos, separados por espacios
        for (String palabra : palabras) {
            cadenaConcatenada.append(palabra).append(" ");
        }

        // Convertir StringBuilder a String y eliminar el espacio extra al final
        String resultado = cadenaConcatenada.toString().trim();

        // Imprimir el resultado por consola
        System.out.println("\n" +
                        "Cadena concatenada: " + resultado);
    }
}
