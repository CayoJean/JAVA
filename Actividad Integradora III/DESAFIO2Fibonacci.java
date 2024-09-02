public class DESAFIO2Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Número de términos de la serie de Fibonacci a imprimir
        int i = 0; // Contador de términos impresos
        int a = 0; // Primer término de la serie
        int b = 1; // Segundo término de la serie
        
        System.out.println("\n" +
                        "Serie de Fibonacci:");
        
        while (i < n) {
            System.out.print(a + " ");
            
            // Calcular el siguiente término
            int siguienteTermino = a + b;
            // Actualizar los valores de 'a' y 'b'
            a = b;
            b = siguienteTermino;
            
            // Incrementar el contador
            i++;
        }
    }
}
