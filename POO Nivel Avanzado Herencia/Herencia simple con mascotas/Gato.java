/*public class Gato extends Animal {
    // Atributo específico de la clase Gato
    private String colorPelaje;

    // Constructor de la clase Gato
    public Gato(String nombre, int edad, String colorPelaje) {
        super(nombre, edad); // Llamada al constructor de la clase padre (Animal)
        this.colorPelaje = colorPelaje;
    }

    // Método específico de la clase Gato
    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }

    // Getter para el atributo colorPelaje
    public String getColorPelaje() {
        return colorPelaje;
    }

    // Setter para el atributo colorPelaje
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
}
*/














/*public class Gato extends Animal {
    private String colorPelaje;

    public Gato(String nombre, int edad, String colorPelaje) {
        super(nombre, edad);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo atún.");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo encima del sofá.");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }
}
*/













public class Gato extends Animal {
    private String colorPelaje;

    public Gato(String nombre, int edad, String colorPelaje) {
        super(nombre, edad);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " (gato) está comiendo pescado.");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " (gato) está durmiendo encima del sofá.");
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
}
