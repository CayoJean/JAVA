package EjerciciosComplementarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeContactos gestor = new GestorDeContactos();
        String opcion;

        do {
            System.out.println();
            System.out.println("\n--- Actividad: Ejercicios Complementarios ---");
            System.out.println("------ Comparando arrayList y hashSet ------");
            System.out.println();
            System.out.println("1. Agregar contacto al ArrayList");
            System.out.println("2. Eliminar contacto del ArrayList");
            System.out.println("3. Agregar contacto al HashSet");
            System.out.println("4. Eliminar contacto del HashSet");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                System.out.println();
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombreAL = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefonoAL = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico del contacto: ");
                    String emailAL = scanner.nextLine();

                    Contacto contactoAL = new Contacto(nombreAL, telefonoAL, emailAL);
                    gestor.agregarContactoArrayList(contactoAL);
                    break;

                case "2":
                System.out.println();
                    System.out.print("Ingrese el nombre del contacto a eliminar del ArrayList: ");
                    String nombreEliminarAL = scanner.nextLine();
                    gestor.eliminarContactoArrayList(nombreEliminarAL);
                    break;

                case "3":
                System.out.println();
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombreHS = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefonoHS = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico del contacto: ");
                    String emailHS = scanner.nextLine();

                    Contacto contactoHS = new Contacto(nombreHS, telefonoHS, emailHS);
                    gestor.agregarContactoHashSet(contactoHS);
                    break;

                case "4":
                System.out.println();
                    System.out.print("Ingrese el nombre del contacto a eliminar del HashSet: ");
                    String nombreEliminarHS = scanner.nextLine();
                    gestor.eliminarContactoHashSet(nombreEliminarHS);
                    break;

                case "0":
                    System.out.println("¡VUELV PRONTO! Saliste del Programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("0"));

        scanner.close();
    }
}
