package AplicandoLaAsociaciónDeObjetosII;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LigaFutbol {
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

        // Método setter para establecer el nombre del jugador
        public void setNombre(String nombre) {
            this.nombre = nombre;
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

        // Método setter para establecer el nombre del equipo
        public void setNombre(String nombre) {
            this.nombre = nombre;
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
                    System.out.println("¡VUELVE PRONTO! Saliste Del Programa...");
                    break;
                default:
                    System.out.println("Opción No Válida. Inténtalo de Nuevo.");
            }
        } while (opcion != 10);
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println();
        System.out.println("\n--- Menú Liga de Fútbol ---");
        System.out.println();
        System.out.println("1. Crear Jugador");
        System.out.println("2. Crear Equipo");
        System.out.println("3. Asignar Jugador a Equipo");
        System.out.println("4. Mostrar Lista de Jugadores");
        System.out.println("5. Mostrar Lista de Equipos");
        System.out.println("6. Eliminar Jugador");
        System.out.println("7. Eliminar Equipo");
        System.out.println("8. Seleccionar Jugador");
        System.out.println("9. Seleccionar Equipo");
        System.out.println("10. Salir");
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
                System.out.println("Entrada Inválida. Por Favor, Ingresa Un Número Entero.");
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
            System.out.println();
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
            System.out.println();
            System.out.println("No Hay Jugadores Disponibles.");
        } else {
            System.out.println("\n--- Lista de Jugadores ---");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println((i + 1) + ". " + jugadores.get(i));
            }
        }
    }

    // Método para mostrar la lista de equipos
    private static void mostrarListaEquipos() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No Hay Equipos Disponibles.");
        } else {
            System.out.println("\n--- Lista de Equipos ---");
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
            }
        }
    }

    // Método para eliminar un jugador
    private static void eliminarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println();
            System.out.println("No Hay Jugadores Disponibles.");
            return;
        }
        System.out.println("Selecciona Un Jugador Para Eliminar:");
        mostrarListaJugadores();
        System.out.print("Selecciona El Número Del Jugador: ");
        int indiceJugador = leerNumeroEntero();

        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
            Jugador jugadorAEliminar = jugadores.get(indiceJugador - 1);
            if (jugadorAEliminar.getEquipo() != null) {
                jugadorAEliminar.getEquipo().getJugadores().remove(jugadorAEliminar);
            }
            jugadores.remove(indiceJugador - 1);
            System.out.println("Jugador Eliminado.");
        } else {
            System.out.println("Número De Jugador No Válido.");
        }
    }

    // Método para eliminar un equipo
    private static void eliminarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No Hay Equipos Disponibles.");
            return;
        }
        System.out.println("Selecciona Un Equipo Para Eliminar:");
        mostrarListaEquipos();
        System.out.print("Selecciona El Número Del Equipo: ");
        int indiceEquipo = leerNumeroEntero();

        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
            Equipo equipoAEliminar = equipos.get(indiceEquipo - 1);
            for (Jugador jugador : equipoAEliminar.getJugadores()) {
                jugador.setEquipo(null);
            }
            equipos.remove(indiceEquipo - 1);
            System.out.println("Equipo Eliminado.");
        } else {
            System.out.println("Número De Equipo No Válido.");
        }
    }

    // Método para seleccionar un jugador y mostrar el submenú
    private static void seleccionarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println();
            System.out.println("No Hay Jugadores Disponibles.");
            return;
        }
        System.out.println("Selecciona Un Jugador:");
        mostrarListaJugadores();
        System.out.print("Selecciona El Número Del Jugador: ");
        int indiceJugador = leerNumeroEntero();

        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
            Jugador jugadorSeleccionado = jugadores.get(indiceJugador - 1);
            int opcionSubmenu;
            do {
                mostrarMenuJugador();
                opcionSubmenu = leerNumeroEntero();
                switch (opcionSubmenu) {
                    case 1:
                        System.out.println("Detalles Del Jugador: " + jugadorSeleccionado);
                        break;
                    case 2:
                        System.out.print("Introduce El Nuevo Nombre Del Jugador: ");
                        String nuevoNombre = scanner.nextLine();
                        jugadorSeleccionado.setNombre(nuevoNombre);
                        System.out.println("Nombre Cambiado a: " + nuevoNombre);
                        break;
                    case 3:
                        if (equipos.isEmpty()) {
                            System.out.println("No Hay Equipos Disponibles Para Asignar.");
                            break;
                        }
                        System.out.println("Elige Un Nuevo Equipo Para El Jugador:");
                        mostrarListaEquipos();
                        System.out.print("Selecciona El Número Del Equipo: ");
                        int indiceEquipo = leerNumeroEntero();
                        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
                            Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
                            if (jugadorSeleccionado.getEquipo() != null) {
                                jugadorSeleccionado.getEquipo().getJugadores().remove(jugadorSeleccionado);
                            }
                            jugadorSeleccionado.setEquipo(equipoSeleccionado);
                            equipoSeleccionado.agregarJugador(jugadorSeleccionado);
                            System.out.println("Jugador Asignado Al Equipo " + equipoSeleccionado.getNombre());
                        }
                        break;
                    case 4:
                        System.out.println("Regresando Al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción No Válida. Inténtalo De Nuevo.");
                }
            } while (opcionSubmenu != 4);
        } else {
            System.out.println("Número De Jugador No Válido.");
        }
    }

    // Método para seleccionar un equipo y mostrar el submenú
    private static void seleccionarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println();
            System.out.println("No Hay Equipos Disponibles.");
            return;
        }
        System.out.println("Selecciona Un Equipo:");
        mostrarListaEquipos();
        System.out.print("Selecciona El Número Del Equipo: ");
        int indiceEquipo = leerNumeroEntero();

        if (indiceEquipo > 0 && indiceEquipo <= equipos.size()) {
            Equipo equipoSeleccionado = equipos.get(indiceEquipo - 1);
            int opcionSubmenu;
            do {
                mostrarMenuEquipo();
                opcionSubmenu = leerNumeroEntero();
                switch (opcionSubmenu) {
                    case 1:
                        System.out.println("Detalles Del Equipo: " + equipoSeleccionado.getNombre());
                        break;
                    case 2:
                        System.out.print("Introduce El Nuevo Nombre Del Equipo: ");
                        String nuevoNombre = scanner.nextLine();
                        equipoSeleccionado.setNombre(nuevoNombre);
                        for (Jugador jugador : equipoSeleccionado.getJugadores()) {
                            jugador.setEquipo(equipoSeleccionado);
                        }
                        System.out.println("Nombre Cambiado a: " + nuevoNombre);
                        break;
                    case 3:
                        if (jugadores.isEmpty()) {
                            System.out.println("No Hay Jugadores Disponibles Para Agregar.");
                            break;
                        }
                        System.out.println("Selecciona Un Jugador Para Agregar Al Equipo:");
                        mostrarListaJugadores();
                        System.out.print("Selecciona El Número Del Jugador: ");
                        int indiceJugador = leerNumeroEntero();
                        if (indiceJugador > 0 && indiceJugador <= jugadores.size()) {
                            Jugador jugadorSeleccionado = jugadores.get(indiceJugador - 1);
                            jugadorSeleccionado.setEquipo(equipoSeleccionado);
                            equipoSeleccionado.agregarJugador(jugadorSeleccionado);
                            System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " Agregado Al Equipo.");
                        }
                        break;
                    case 4:
                        System.out.println("Jugadores Del Equipo:");
                        if (equipoSeleccionado.getJugadores().isEmpty()) {
                            System.out.println("No Hay Jugadores En Este Equipo.");
                        } else {
                            for (Jugador jugador : equipoSeleccionado.getJugadores()) {
                                System.out.println(jugador);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Regresando Al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción No Válida. Inténtalo De Nuevo.");
                }
            } while (opcionSubmenu != 5);
        } else {
            System.out.println("Número De Equipo No Válido.");
        }
    }

    // Método para mostrar el menú del submenú de jugadores
    private static void mostrarMenuJugador() {
        System.out.println("\n--- Menú Jugador ---");
        System.out.println("1. Ver Detalles");
        System.out.println("2. Cambiar Nombre");
        System.out.println("3. Cambiar Equipo");
        System.out.println("4. Regresar Al Menú Principal");
        System.out.print("Selecciona Una Opción: ");
    }

    // Método para mostrar el menú del submenú de equipos
    private static void mostrarMenuEquipo() {
        System.out.println("\n--- Menú Equipo ---");
        System.out.println("1. Ver Detalles");
        System.out.println("2. Cambiar Nombre");
        System.out.println("3. Agregar Jugador Al Equipo");
        System.out.println("4. Mostrar Jugadores Del Equipo");
        System.out.println("5. Regresar Al Menú Principal");
        System.out.print("Selecciona Una Opción: ");
    }
}
