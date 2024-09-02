// Clase Punto
/*public class Punto {
    // Atributos privados
    private int x;
    private int y;

    // Constructor vacío
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters y Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método de instancia para calcular la distancia desde el origen (0,0)
    public double distanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método estático para calcular la distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para verificar si tres puntos están alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        // Verifica si el área formada por el triángulo de los tres puntos es cero
        return (p2.getY() - p1.getY()) * (p3.getX() - p1.getX()) ==
               (p3.getY() - p1.getY()) * (p2.getX() - p1.getX());
    }
}

// Clase principal
public class PlanoXY {
    // Variable global como arreglo de objetos Punto
    private static Punto[] puntos;

    public static void main(String[] args) {
        // Crear algunas instancias de Punto
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);
        Punto p3 = new Punto(7, 10);

        // Guardar las instancias en el arreglo
        puntos = new Punto[] { p1, p2, p3 };

        // Calcular la distancia desde el origen
        System.out.println("Distancia desde el origen para p1: " + p1.distanciaDesdeOrigen());

        // Calcular la distancia entre p1 y p2
        System.out.println("Distancia entre p1 y p2: " + Punto.calcularDistancia(p1, p2));

        // Verificar si p1, p2, y p3 están alineados
        System.out.println("¿Están p1, p2 y p3 alineados?: " + Punto.estanAlineados(p1, p2, p3));
    }
}
*/