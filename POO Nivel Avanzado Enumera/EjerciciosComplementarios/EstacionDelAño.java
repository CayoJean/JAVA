package EjerciciosComplementarios;

// EstacionDelAño.java
import java.util.HashMap;
import java.util.Map;

public class EstacionDelAño {

    private static final Map<Mes, Estacion> estacionesPorMes = new HashMap<>();

    static {
        estacionesPorMes.put(Mes.DICIEMBRE, Estacion.INVIERNO);
        estacionesPorMes.put(Mes.ENERO, Estacion.INVIERNO);
        estacionesPorMes.put(Mes.FEBRERO, Estacion.INVIERNO);
        estacionesPorMes.put(Mes.MARZO, Estacion.PRIMAVERA);
        estacionesPorMes.put(Mes.ABRIL, Estacion.PRIMAVERA);
        estacionesPorMes.put(Mes.MAYO, Estacion.PRIMAVERA);
        estacionesPorMes.put(Mes.JUNIO, Estacion.VERANO);
        estacionesPorMes.put(Mes.JULIO, Estacion.VERANO);
        estacionesPorMes.put(Mes.AGOSTO, Estacion.VERANO);
        estacionesPorMes.put(Mes.SEPTIEMBRE, Estacion.OTOÑO);
        estacionesPorMes.put(Mes.OCTUBRE, Estacion.OTOÑO);
        estacionesPorMes.put(Mes.NOVIEMBRE, Estacion.OTOÑO);
    }

    public static Estacion obtenerEstacion(Mes mes) {
        return estacionesPorMes.get(mes);
    }

    public static void imprimirEstaciones() {
        System.out.println("Primavera: Marzo, Abril, Mayo");
        System.out.println("Verano: Junio, Julio, Agosto");
        System.out.println("Otoño: Septiembre, Octubre, Noviembre");
        System.out.println("Invierno: Diciembre, Enero, Febrero");
    }
}
