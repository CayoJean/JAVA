/*public class Perro extends Animal {
    // Atributo específico de la clase Perro
    private String raza;

    // Constructor de la clase Perro
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); // Llamada al constructor de la clase padre (Animal)
        this.raza = raza;
    }

    // Método específico de la clase Perro
    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

    // Getter para el atributo raza
    public String getRaza() {
        return raza;
    }

    // Setter para el atributo raza
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
*/











/*public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo en su cama.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Perro perro = (Perro) obj;
        return getNombre().equals(perro.getNombre()) &&
                getEdad() == perro.getEdad() &&
                raza.equals(perro.raza);
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getEdad();
        result = 31 * result + raza.hashCode();
        return result;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }
}
*/












import java.util.Objects; // Asegúrate de incluir esta línea al inicio de tu archivo

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " (perro) está comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " (perro) está durmiendo en su cama.");
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Perro perro = (Perro) obj;
        return getNombre().equals(perro.getNombre()) && getEdad() == perro.getEdad() && raza.equals(perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), raza);
    }
}
