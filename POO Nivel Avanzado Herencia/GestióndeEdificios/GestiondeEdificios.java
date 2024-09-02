import java.util.ArrayList;

public class GestiondeEdificios {
    public static void main(String[] args) {
        // Crear ArrayList de Edificio
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Añadir instancias de Polideportivo
        Polideportivo poli1 = new Polideportivo(50, 20, 30, "Polideportivo Central", "Techado");
        Polideportivo poli2 = new Polideportivo(60, 25, 40, "Polideportivo Norte", "Abierto");
        edificios.add(poli1);
        edificios.add(poli2);

        // Añadir instancias de EdificioDeOficinas
        EdificioDeOficinas oficina1 = new EdificioDeOficinas(20, 30, 15, 10, 4, 3);
        EdificioDeOficinas oficina2 = new EdificioDeOficinas(25, 35, 20, 15, 5, 4);
        edificios.add(oficina1);
        edificios.add(oficina2);

        // Recorrer el ArrayList y ejecutar métodos
        int polideportivosTechados = 0;
        int polideportivosAbiertos = 0;

        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie() + " m²");
            System.out.println("Volumen: " + edificio.calcularVolumen() + " m³");

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                if (poli.getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    polideportivosTechados++;
                } else {
                    polideportivosAbiertos++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas oficina = (EdificioDeOficinas) edificio;
                System.out.println("Cantidad de personas que pueden trabajar: " + oficina.cantPersonas());
            }
            System.out.println();
        }

        // Mostrar resultados adicionales
        System.out.println("Cantidad de polideportivos techados: " + polideportivosTechados);
        System.out.println("Cantidad de polideportivos abiertos: " + polideportivosAbiertos);
    }
}
