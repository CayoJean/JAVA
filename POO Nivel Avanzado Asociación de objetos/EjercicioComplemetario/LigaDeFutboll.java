package EjercicioComplemetario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LigaDeFutboll {
    // Clase interna Jugador
    static class Jugador {
        private String nombre;
        private Equipo equipo; // Relación de composición con la clase Equipo

        // Constructor
        public Jugador(String nombre, Equipo equipo) {
            this.nombre = nombre;
            this.equipo = equipo;
        }

        // Métodos getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Equipo getEquipo() {
            return equipo;
        }

        public void setEquipo(Equipo equipo) {
            this.equipo = equipo;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Equipo: " + (equipo != null ? equipo.getNombre() : "Sin equipo");
        }
    }

    // Clase interna Equipo
    static class Equipo {
        private String nombre;
        private List<Jugador> jugadores; // Lista de jugadores en el equipo

        // Constructor
        public Equipo(String nombre) {
            this.nombre = nombre;
            this.jugadores = new ArrayList<>();
        }

        // Métodos getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public List<Jugador> getJugadores() {
            return jugadores;
        }

        // Agregar un jugador al equipo
        public void agregarJugador(Jugador jugador) {
            jugadores.add(jugador);
        }

        // Eliminar un jugador del equipo
        public void eliminarJugador(Jugador jugador) {
            jugadores.remove(jugador);
        }

        @Override
        public String toString() {
            return nombre;
        }
    }

    // Atributos de la clase principal
    private static List<Jugador> jugadores = new ArrayList<>();
    private static List<Equipo> equipos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
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
                    eliminarJugador();
                    break;
                case 7:
                    eliminarEquipo();
                    break;
                case 8:
                    seleccionarJugador();
                    break;
                case 9:
                    seleccionarEquipo();
                    break;
                case 10:
                    System.out.println("¡VUELVE PRONTO! Saliste del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 10);
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("\n--- Menú Liga de Fútbol ---");
        System.out.println();
        System.out.println("1. Crear jugador");
        System.out.println("2. Crear equipo");
        System.out.println("3. Asignar jugador a equipo");
        System.out.println("4. Mostrar lista de jugadores");
        System.out.println("5. Mostrar lista de equipos");
        System.out.println("6. Eliminar jugador");
        System.out.println("7. Eliminar equipo");
        System.out.println("8. Seleccionar jugador");
        System.out.println("9. Seleccionar equipo");
        System.out.println("10. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static int leerNumeroEntero() {
        int numero = -1;
        boolean esValido = false;
        while (!esValido) {
            try {
                numero = scanner.nextInt();
                scanner.nextLine();
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                scanner.nextLine();
            }
        }
        return numero;
    }

    private static void crearJugador() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No se puede crear un jugador sin equipos disponibles.");
            return;
        }

        System.out.print("Introduce el nombre del jugador: ");
        String nombre = scanner.nextLine();

        System.out.println("Elige un equipo para el jugador:");
        mostrarListaEquipos();
        System.out.print("Selecciona el número del equipo: ");
        int indiceEquipo = leerNumeroEntero();

        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
            Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
            Jugador nuevoJugador = new Jugador(nombre, equipoSeleccionado);
            equipoSeleccionado.agregarJugador(nuevoJugador);
            jugadores.add(nuevoJugador);
            System.out.println("Jugador " + nombre + " creado y asignado al equipo " + equipoSeleccionado.getNombre());
        } else {
            System.out.println("Número de equipo no válido.");
        }
    }

    private static void crearEquipo() {
        System.out.println();
        System.out.print("Introduce el nombre del equipo: ");
        String nombre = scanner.nextLine();
        Equipo nuevoEquipo = new Equipo(nombre);
        equipos.add(nuevoEquipo);
        System.out.println("Equipo " + nombre + " creado.");
    }

    private static void asignarJugadorAEquipo() {
        if (jugadores.isEmpty()) {
            System.out.println();
            System.out.println("No hay jugadores disponibles.");
            return;
        }
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles.");
            return;
        }

        System.out.println("Elige un jugador:");
        mostrarListaJugadores();
        System.out.print("Selecciona el número del jugador: ");
        int indiceJugador = leerNumeroEntero();

        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
            Jugador jugadorSeleccionado = jugadores.get(indiceJugador - 1);

            System.out.println("Elige un equipo:");
            mostrarListaEquipos();
            System.out.print("Selecciona el número del equipo: ");
            int indiceEquipo = leerNumeroEntero();

            if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
                Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
                if (jugadorSeleccionado.getEquipo() != null) {
                    jugadorSeleccionado.getEquipo().eliminarJugador(jugadorSeleccionado);
                }
                jugadorSeleccionado.setEquipo(equipoSeleccionado);
                equipoSeleccionado.agregarJugador(jugadorSeleccionado);
                System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " asignado al equipo " + equipoSeleccionado.getNombre());
            }
        } else {
            System.out.println("Número de jugador no válido.");
        }
    }

    private static void mostrarListaJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println();
            System.out.println("No hay jugadores disponibles.");
        } else {
            System.out.println("\n--- Lista de Jugadores ---");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println((i + 1) + ". " + jugadores.get(i));
            }
        }
    }

    private static void mostrarListaEquipos() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No hay equipos disponibles.");
        } else {
            System.out.println("\n--- Lista de Equipos ---");
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
            }
        }
    }

    private static void eliminarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println();
            System.out.println("No hay jugadores disponibles.");
            return;
        }
        System.out.println("Selecciona un jugador para eliminar:");
        mostrarListaJugadores();
        System.out.print("Selecciona el número del jugador: ");
        int indiceJugador = leerNumeroEntero();

        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
            Jugador jugadorAEliminar = jugadores.get(indiceJugador - 1);
            if (jugadorAEliminar.getEquipo() != null) {
                jugadorAEliminar.getEquipo().eliminarJugador(jugadorAEliminar);
            }
            jugadores.remove(indiceJugador - 1);
            System.out.println("Jugador eliminado.");
        } else {
            System.out.println("Número de jugador no válido.");
        }
    }

    private static void eliminarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No hay equipos disponibles.");
            return;
        }
        System.out.println("Selecciona un equipo para eliminar:");
        mostrarListaEquipos();
        System.out.print("Selecciona el número del equipo: ");
        int indiceEquipo = leerNumeroEntero();

        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
            Equipo equipoAEliminar = equipos.get(indiceEquipo - 1);
            // Eliminar todos los jugadores del equipo
            List<Jugador> jugadoresAEliminar = new ArrayList<>(equipoAEliminar.getJugadores());
            for (Jugador jugador : jugadoresAEliminar) {
                jugador.setEquipo(null);
            }
            // Eliminar el equipo
            equipos.remove(indiceEquipo - 1);
            System.out.println("Equipo eliminado.");
        } else {
            System.out.println("Número de equipo no válido.");
        }
    }

    private static void seleccionarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println();
            System.out.println("No hay jugadores disponibles.");
            return;
        }
        System.out.println("Selecciona un jugador:");
        mostrarListaJugadores();
        System.out.print("Selecciona el número del jugador: ");
        int indiceJugador = leerNumeroEntero();

        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
            Jugador jugadorSeleccionado = jugadores.get(indiceJugador - 1);
            int opcionSubmenu;
            do {
                mostrarMenuJugador();
                opcionSubmenu = leerNumeroEntero();
                switch (opcionSubmenu) {
                    case 1:
                        System.out.println("Detalles del jugador: " + jugadorSeleccionado);
                        break;
                    case 2:
                        System.out.print("Introduce el nuevo nombre del jugador: ");
                        String nuevoNombre = scanner.nextLine();
                        jugadorSeleccionado.setNombre(nuevoNombre);
                        System.out.println("Nombre cambiado a: " + nuevoNombre);
                        break;
                    case 3:
                        if (equipos.isEmpty()) {
                            System.out.println("No hay equipos disponibles para asignar.");
                            break;
                        }
                        System.out.println("Elige un nuevo equipo para el jugador:");
                        mostrarListaEquipos();
                        System.out.print("Selecciona el número del equipo: ");
                        int indiceEquipo = leerNumeroEntero();
                        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
                            Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
                            if (jugadorSeleccionado.getEquipo() != null) {
                                jugadorSeleccionado.getEquipo().eliminarJugador(jugadorSeleccionado);
                            }
                            jugadorSeleccionado.setEquipo(equipoSeleccionado);
                            equipoSeleccionado.agregarJugador(jugadorSeleccionado);
                            System.out.println("Jugador asignado al equipo " + equipoSeleccionado.getNombre());
                        }
                        break;
                    case 4:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcionSubmenu != 4);
        } else {
            System.out.println("Número de jugador no válido.");
        }
    }

    private static void seleccionarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No hay equipos disponibles.");
            return;
        }
        System.out.println("Selecciona un equipo:");
        mostrarListaEquipos();
        System.out.print("Selecciona el número del equipo: ");
        int indiceEquipo = leerNumeroEntero();

        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
            Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
            int opcionSubmenu;
            do {
                mostrarMenuEquipo();
                opcionSubmenu = leerNumeroEntero();
                switch (opcionSubmenu) {
                    case 1:
                        System.out.println("Detalles del equipo: " + equipoSeleccionado.getNombre());
                        break;
                    case 2:
                        System.out.print("Introduce el nuevo nombre del equipo: ");
                        String nuevoNombre = scanner.nextLine();
                        equipoSeleccionado.setNombre(nuevoNombre);
                        // Actualizar nombre en los jugadores asignados
                        for (Jugador jugador : equipoSeleccionado.getJugadores()) {
                            jugador.setEquipo(equipoSeleccionado);
                        }
                        System.out.println("Nombre cambiado a: " + nuevoNombre);
                        break;
                    case 3:
                        if (jugadores.isEmpty()) {
                            System.out.println("No hay jugadores disponibles para agregar.");
                            break;
                        }
                        System.out.println("Selecciona un jugador para agregar al equipo:");
                        mostrarListaJugadores();
                        System.out.print("Selecciona el número del jugador: ");
                        int indiceJugador = leerNumeroEntero();
                        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
                            Jugador jugadorSeleccionado = jugadores.get(indiceJugador - 1);
                            jugadorSeleccionado.setEquipo(equipoSeleccionado);
                            equipoSeleccionado.agregarJugador(jugadorSeleccionado);
                            System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " agregado al equipo.");
                        }
                        break;
                    case 4:
                        System.out.println("Jugadores del equipo:");
                        if (equipoSeleccionado.getJugadores().isEmpty()) {
                            System.out.println("No hay jugadores en este equipo.");
                        } else {
                            for (Jugador jugador : equipoSeleccionado.getJugadores()) {
                                System.out.println(jugador);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcionSubmenu != 5);
        } else {
            System.out.println("Número de equipo no válido.");
        }
    }

    private static void mostrarMenuJugador() {
        System.out.println("\n--- Menú Jugador ---");
        System.out.println("1. Ver detalles");
        System.out.println("2. Cambiar nombre");
        System.out.println("3. Cambiar equipo");
        System.out.println("4. Regresar al menú principal");
        System.out.print("Selecciona una opción: ");
    }

    private static void mostrarMenuEquipo() {
        System.out.println("\n--- Menú Equipo ---");
        System.out.println("1. Ver detalles");
        System.out.println("2. Cambiar nombre");
        System.out.println("3. Agregar jugador al equipo");
        System.out.println("4. Mostrar jugadores del equipo");
        System.out.println("5. Regresar al menú principal");
        System.out.print("Selecciona una opción: ");
    }
}