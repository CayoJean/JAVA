public class GeneradorNumerosAleatorios {

    public static void main(String[] args) {
        // Llamada al método numeroAleatorio() y mostrar el resultado
        System.out.println();
        int numero = numeroAleatorio();
        System.out.println("\n" +
                        "Número aleatorio generado: " + numero);
    }

    // Método para generar un número aleatorio en el rango del 1 al 355
    public static int numeroAleatorio() {
        // Definir el rango
        int min = 1;
        int max = 355;
        
        // Generar un número aleatorio en el rango
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
