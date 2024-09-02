public class NumeroAleatorio {
    public static void main(String[] args) {
        // Generar un número aleatorio en el rango de 0 a 1 utilizando el método random()
        double aleatorio = Math.random();

        // Escalar el número aleatorio al rango de 1 a 355
        double escalado = aleatorio * 355;

        // Redondear el número aleatorio hacia abajo y convertirlo a entero
        int numeroAleatorio = (int) Math.floor(escalado) + 1;  // +1 para incluir el 1 en el rango

        // Mostrar el número aleatorio en pantalla
        System.out.println("\n" +
                        "Número aleatorio generado en el rango de 1 a 355: " + numeroAleatorio);
    }
}
