package AplicandoLaAsociaciónDeObjetosI;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LigaDeFutbol {
    // Clase interna Jugador
    static class Jugador {
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

    // Clase interna Equipo
    static class Equipo {
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

    // Atributos de la clase principal
    private static ArrayList<Jugador> jugadores = new ArrayList<>(); // Lista de jugadores
    private static ArrayList<Equipo> equipos = new ArrayList<>();    // Lista de equipos
    private static Scanner scanner = new Scanner(System.in);         // Scanner para leer la entrada del usuario

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu(); // Muestra el menú al usuario
            opcion = leerNumeroEntero();
            switch (opcion) {
                case 1:
                    crearJugador();
                    break;
                case 2:
                    crearEquipo();
                    break;
                case 3:
                    asignarJugadorAEquipo();
                    break;
                case 4:
                    mostrarListaJugadores();
                    break;
                case 5:
                    mostrarListaEquipos();
                    break;
                case 6:
                    System.out.println("¡VUELVE PRONTO! Saliste del Programa...");
                    break;
                default:
                    System.out.println("Opción No Válida. Inténtalo de Nuevo.");
            }
        } while (opcion != 6);
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println();
        System.out.println("\n---- Menú Liga de Fútbol ----");
        System.out.println();
        System.out.println("1. Crear Jugador");
        System.out.println("2. Crear Equipo");
        System.out.println("3. Asignar Jugador a Equipo");
        System.out.println("4. Mostrar Lista de Jugadores");
        System.out.println("5. Mostrar Lista de Equipos");
        System.out.println("6. Salir");
        System.out.print("Selecciona Una Opción: ");
    }

    // Método para leer un número entero desde la entrada estándar
    private static int leerNumeroEntero() {
        int numero = -1;
        boolean esValido = false;
        while (!esValido) {
            try {
                numero = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida. Por Favor, Ingresa Un Número Del 1 al 6");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return numero;
    }

    // Método para crear un jugador
    private static void crearJugador() {
        System.out.println();
        System.out.print("Introduce El Nombre Del Jugador: ");
        String nombre = scanner.nextLine();
        Jugador nuevoJugador = new Jugador(nombre);

        if (equipos.isEmpty()) {
            System.out.println("No Hay Equipos Disponibles. El Jugador Se Ha Creado Sin Equipo.");
        } else {
            System.out.println();
            System.out.println("Elige Un Equipo Para El Jugador:");
            mostrarListaEquipos();
            System.out.print("Selecciona El Número Del Equipo o (0 Para Dejar Sin Equipo): ");
            int indiceEquipo = leerNumeroEntero();
            if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
                Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
                nuevoJugador.setEquipo(equipoSeleccionado);
                equipoSeleccionado.agregarJugador(nuevoJugador);
                System.out.println("Jugador " + nombre + " Asignado Al Equipo " + equipoSeleccionado.getNombre());
            }
        }
        jugadores.add(nuevoJugador);
        System.out.println("Jugador " + nombre + " Creado.");
    }

    // Método para crear un equipo
    private static void crearEquipo() {
        System.out.println();
        System.out.print("Introduce El Nombre Del Equipo: ");
        String nombre = scanner.nextLine();
        Equipo nuevoEquipo = new Equipo(nombre);
        equipos.add(nuevoEquipo);
        System.out.println("Equipo " + nombre + " Creado.");
    }

    // Método para asignar un jugador a un equipo
    private static void asignarJugadorAEquipo() {
        if (jugadores.isEmpty()) {
            System.out.println("No Hay Jugadores Disponibles.");
            return;
        }
        if (equipos.isEmpty()) {
            System.out.println("No Hay Equipos Disponibles.");
            return;
        }

        System.out.println("Elige Un Jugador:");
        mostrarListaJugadores();
        System.out.print("Selecciona El Número Del Jugador: ");
        int indiceJugador = leerNumeroEntero();

        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
            Jugador jugadorSeleccionado = jugadores.get(indiceJugador - 1);

            System.out.println("Elige Un Equipo:");
            mostrarListaEquipos();
            System.out.print("Selecciona El Número Del Equipo: ");
            int indiceEquipo = leerNumeroEntero();

            if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
                Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
                jugadorSeleccionado.setEquipo(equipoSeleccionado);
                equipoSeleccionado.agregarJugador(jugadorSeleccionado);
                System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " Asignado Al Equipo " + equipoSeleccionado.getNombre());
            }
        }
    }

    // Método para mostrar la lista de jugadores
    private static void mostrarListaJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No Hay Jugadores Disponibles.");
        } else {
            System.out.println("\n--- Lista De Jugadores ---");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println((i + 1) + ". " + jugadores.get(i));
            }
        }
    }

    // Método para mostrar la lista de equipos
    private static void mostrarListaEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No Hay Equipos Disponibles.");
        } else {
            System.out.println("\n--- Lista De Equipos ---");
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
            }
        }
    }
}
