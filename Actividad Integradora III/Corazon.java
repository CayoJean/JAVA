public class Corazon {
    public static void main(String[] args) {
        // Definimos el mensaje
        String mensaje = "";
        
        // Imprimimos el corazón con el mensaje en el centro
        System.out.println("\n" +
                        "   ***     ***   ");
        System.out.println(" **   ** **   ** ");
        System.out.println("**     ***     **");
        System.out.println("**             **");
        System.out.println(" **           ** ");
        System.out.println("   **       **   ");
        System.out.println("     **   **     ");
        System.out.println("       ***       ");
        System.out.println("        *        ");
        System.out.println();
        
        // Imprimir el mensaje centrado
        // Ajustamos el espaciado para centrar el mensaje en el corazón
        int espaciado = 13; // Ajustar el número de espacios según sea necesario
        System.out.println(" ".repeat(espaciado) + mensaje);
    }
}
