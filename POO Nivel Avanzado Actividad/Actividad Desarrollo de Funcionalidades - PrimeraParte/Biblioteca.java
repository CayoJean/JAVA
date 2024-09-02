import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo;
    
    public boolean estaVacio() {
        return catalogo.isEmpty();
    }
    

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            libro.mostrarInformacion();
            System.out.println();  // Línea en blanco para separar los libros
        }
    }
}
