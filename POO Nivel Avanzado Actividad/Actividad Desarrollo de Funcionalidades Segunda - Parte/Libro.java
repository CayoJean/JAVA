public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.prestado = false; // Inicialmente, el libro no está prestado
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroDePaginas);
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }
}
