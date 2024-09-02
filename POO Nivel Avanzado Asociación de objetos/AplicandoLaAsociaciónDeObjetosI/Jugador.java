package AplicandoLaAsociaciónDeObjetosI;

public class Jugador {
    private String nombre;
    private Equipo equipo; // Relación de agregación con la clase Equipo

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.equipo = null; // Inicialmente el jugador no tiene equipo
    }

    // Método getter para obtener el nombre del jugador
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener el equipo del jugador
    public Equipo getEquipo() {
        return equipo;
    }

    // Método setter para establecer el equipo del jugador
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    // Método para representar el jugador como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Equipo: " + (equipo != null ? equipo.getNombre() : "Sin Equipo");
    }
}
