package EjerciciosComplementarios;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    // Constructor
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre.trim().toLowerCase();
        this.telefono = telefono;
        this.email = email.trim().toLowerCase();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Método equals: dos contactos son iguales si tienen el mismo nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre);
    }

    // Método hashCode: basado en el nombre
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    // Método toString para mostrar la información del contacto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Email: " + email;
    }
}
