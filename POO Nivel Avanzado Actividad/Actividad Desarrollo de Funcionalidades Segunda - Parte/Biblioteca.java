import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public boolean prestarLibro(String titulo, Persona persona) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()) {
                libro.prestar();
                persona.agregarLibroPrestado(libro);
                return true;
            }
        }
        return false; // No se encontró el libro o ya está prestado
    }

    public boolean devolverLibro(String titulo, Persona persona) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isPrestado()) {
                libro.devolver();
                persona.devolverLibro(libro);
                return true;
            }
        }
        return false; // No se encontró el libro o no estaba prestado
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            libro.mostrarInformacion();
            System.out.println();  // Línea en blanco para separar los libros
        }
    }

    public boolean estaVacio() {
        return catalogo.isEmpty();
    }
}

