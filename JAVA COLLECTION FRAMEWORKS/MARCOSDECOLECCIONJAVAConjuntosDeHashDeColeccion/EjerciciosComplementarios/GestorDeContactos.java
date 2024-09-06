package EjerciciosComplementarios;

import java.util.ArrayList;
import java.util.HashSet;

public class GestorDeContactos {
    private ArrayList<Contacto> listaContactos;
    private HashSet<Contacto> setContactos;

    // Constructor
    public GestorDeContactos() {
        this.listaContactos = new ArrayList<>();
        this.setContactos = new HashSet<>();
    }

    // Método para agregar contacto al ArrayList (evitar duplicados)
    public void agregarContactoArrayList(Contacto contacto) {
        if (!listaContactos.contains(contacto)) {
            listaContactos.add(contacto);
            System.out.println("Contacto agregado al ArrayList: " + contacto.getNombre());
        } else {
            System.out.println("El contacto " + contacto.getNombre() + " ya existe en el ArrayList.");
        }
        mostrarContactosArrayList();
    }

    // Método para eliminar contacto del ArrayList
    public void eliminarContactoArrayList(String nombre) {
        listaContactos.removeIf(contacto -> contacto.getNombre().equals(nombre.trim().toLowerCase()));
        System.out.println("Contacto eliminado del ArrayList si existía: " + nombre);
        mostrarContactosArrayList();
    }

    // Método para mostrar los contactos del ArrayList
    public void mostrarContactosArrayList() {
        System.out.println("\nContactos en ArrayList:");
        for (Contacto contacto : listaContactos) {
            System.out.println(contacto);
        }
    }

    // Método para agregar contacto al HashSet (evitar duplicados automáticamente)
    public void agregarContactoHashSet(Contacto contacto) {
        if (setContactos.add(contacto)) {
            System.out.println("Contacto agregado al HashSet: " + contacto.getNombre());
        } else {
            System.out.println("El contacto " + contacto.getNombre() + " ya existe en el HashSet.");
        }
        mostrarContactosHashSet();
    }

    // Método para eliminar contacto del HashSet
    public void eliminarContactoHashSet(String nombre) {
        setContactos.removeIf(contacto -> contacto.getNombre().equals(nombre.trim().toLowerCase()));
        System.out.println("Contacto eliminado del HashSet si existía: " + nombre);
        mostrarContactosHashSet();
    }

    // Método para mostrar los contactos del HashSet
    public void mostrarContactosHashSet() {
        System.out.println("\nContactos en HashSet:");
        for (Contacto contacto : setContactos) {
            System.out.println(contacto);
        }
    }
}
