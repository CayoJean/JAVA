package TRABAJO DE JAVA
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class apps {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        
        // Obtener el nombre del mes en español
        String mes = fechaActual.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        
        // Construir la fecha en el formato deseado
        String fechaFormateada = fechaActual.getDayOfMonth() + " de " + mes + " de " + fechaActual.getYear();
        
        System.out.println("La fecha actual es: " + fechaFormateada);
    }
}
