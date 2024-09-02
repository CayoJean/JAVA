package ActividadDiaDeLaSemana;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\n" +
                        "--- Actividad: Días de la Semana Aleatorio ---");
        DiaSemana[] dias = new DiaSemana[7];
        Random random = new Random();

        // Generar 10 días de la semana aleatorios
        for (int i = 0; i < dias.length; i++) {
            dias[i] = DiaSemana.values()[random.nextInt(DiaSemana.values().length)];
        }

        // Imprimir si cada día es laboral o no
        for (DiaSemana dia : dias) {
            System.out.println();
            imprimirDiaLaboral(dia);
        }
    }

    public static void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println(dia + ": Día laboral");
        } else {
            System.out.println(dia + ": No es día laboral");
        }
    }
}



/* 
public class Application {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\n" +
                        "--- Actividad: Días de la Semana ---");
        System.out.println();
        //Iterar sobre los valores de DiaSemana en orden
        for (DiaSemana dia : DiaSemana.values()) {
            imprimirDiaLaboral(dia);
        }
    }

    public static void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println(dia + ": Día laboral");
        } else {
            System.out.println(dia + ": No es día laboral");
        }
    }
}
*/