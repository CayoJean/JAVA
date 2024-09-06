package ActividadesPracticasHashMap.GestionDeReservas;

public class Reserva {
    private String identificador;
    private String fecha;
    private String nombreReservante;

    // Constructor
    public Reserva(String identificador, String fecha, String nombreReservante) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.nombreReservante = nombreReservante;
    }

    // Métodos Getters
    public String getIdentificador() {
        return identificador;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreReservante() {
        return nombreReservante;
    }

    // Sobreescribir el método toString() para una representación legible de la reserva
    @Override
    public String toString() {
        return "Reserva [ID: " + identificador + ", Fecha: " + fecha + ", Reservante: " + nombreReservante + "]";
    }
}
