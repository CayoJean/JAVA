package AplicandoLaAsociaciónDeObjetosI;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores; // Lista de jugadores en el equipo

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    // Método getter para obtener el nombre del equipo
    public String getNombre() {
        return nombre;
    }

    // Método para agregar un jugador al equipo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método para obtener la lista de jugadores
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    // Método para representar el equipo como una cadena (nombre del equipo)
    @Override
    public String toString() {
        return nombre;
    }
}
