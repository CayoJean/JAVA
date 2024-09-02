public class DepurandoBucle {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            suma += numero;
            System.out.println();
            
            System.out.println("\n" +
                                "Índice: " + i + ", Número: " + numero + ", Suma parcial: " + suma);
        }
        System.out.println("Suma total: " + suma);
    }
}