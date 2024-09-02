package ActividadColores;

/*public class ConvertidorColor {

    public static Color convertirHexadecimal(String valorHexadecimal) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color;
            }
        }
        return null;
    }
}
*/



public class ConvertidorColor {

    public static Color convertirHexadecimal(String valorHexadecimal) {
        // Eliminar espacios en blanco que puedan estar en la entrada
        valorHexadecimal = valorHexadecimal.trim();
        
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color;
            }
        }
        return null;
    }
}
