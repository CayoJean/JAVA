/*public class GatoPerro {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex", 5, "Labrador");
        System.out.println();
        Gato miGato = new Gato("Michi", 3, "Negro");
        
        System.out.println();
        miPerro.comer();    // Output: Rex está comiendo.
        miPerro.dormir();   // Output: Rex está durmiendo.
        miPerro.ladrar();   // Output: Rex está ladrando.

        System.out.println();
        miGato.comer();     // Output: Michi está comiendo.
        miGato.dormir();    // Output: Michi está durmiendo.
        miGato.maullar();   // Output: Michi está maullando.
    }
}
*/













/*public class GatoPerro {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex", 5, "Labrador");
        Gato miGato = new Gato("Michi", 3, "Negro");

        miPerro.comer();    // Output: El perro está comiendo croquetas.
        miPerro.dormir();   // Output: El perro está durmiendo en su cama.
        miPerro.ladrar();   // Output: Rex está ladrando.

        miGato.comer();     // Output: El gato está comiendo atún.
        miGato.dormir();    // Output: El gato está durmiendo encima del sofá.
        miGato.maullar();   // Output: Michi está maullando.

        // Ejemplo de uso de equals() y hashCode()
        Perro otroPerro = new Perro("Rex", 5, "Labrador");
        System.out.println(miPerro.equals(otroPerro)); // Output: true
        System.out.println(miPerro.hashCode() == otroPerro.hashCode()); // Output: true
    }
}
*/
















public class GatoPerro {
    public static void main(String[] args) {
        Perro miPerro1 = new Perro("Rex", 5, "Labrador");
        Perro miPerro2 = new Perro("Rex", 5, "Labrador");
        Gato miGato = new Gato("Michi", 3, "Negro");

        // Probar métodos sobrescritos
        miPerro1.comer();    // Output: Rex (perro) está comiendo croquetas.
        miPerro1.dormir();   // Output: Rex (perro) está durmiendo en su cama.
        miGato.comer();      // Output: Michi (gato) está comiendo pescado.
        miGato.dormir();     // Output: Michi (gato) está durmiendo encima del sofá.

        // Probar método equals() y hashCode()
        System.out.println("¿Los perros son iguales? " + miPerro1.equals(miPerro2)); // Output: ¿Los perros son iguales? true
        System.out.println("HashCode de miPerro1: " + miPerro1.hashCode()); // Output: HashCode de miPerro1: [valor hash]
        System.out.println("HashCode de miPerro2: " + miPerro2.hashCode()); // Output: HashCode de miPerro2: [valor hash igual al anterior]
    }
}