package ActividadColores;

/*public class Application {
    public static void main(String[] args) {
        System.out.println();
        String[] coloresHexadecimales = {"\n" +
                        "#FF0000", "#FFFF00", "#0000FF", "#00FF00", "#FFFFFF"};

        for (String valorHexadecimal : coloresHexadecimales) {
            Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);
            if (color != null) {
                System.out.println(valorHexadecimal + " es el color primario: " + color);
            } else {
                System.out.println(valorHexadecimal + " No es un color primario");
            }
        }
    }
}
*/





public class Application {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\n" +
                        "--- Actividad: Colores ---");
                        System.out.println();
        String[] coloresHexadecimales = {"\n" +
                        "#FF0000", "#FFFF00", "#0000FF", "#00FF00", "#FFFFFF"};

        for (String valorHexadecimal : coloresHexadecimales) {
            // Trim para asegurar que no haya espacios en blanco
            valorHexadecimal = valorHexadecimal.trim();
            
            Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);
            if (color != null) {
                System.out.println(valorHexadecimal + " es el color primario: " + color);
            } else {
                System.out.println(valorHexadecimal + " No es un color primario");
            }
        }
    }
}
