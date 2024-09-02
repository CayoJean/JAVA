package modelos;

import java.util.Arrays;

public class MetodosEmpleado {

    public static void mostrarTodosLosEmpleados(Empleado[] empleados) {
        System.out.printf("%-5s %-15s %-5s %-10s %-20s%n", "No.", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < empleados.length; i++) {
            Empleado emp = empleados[i];
            System.out.printf("%-5d %-15s %-5d %-10.2f %-20s%n", (i + 1), emp.getNombre(), emp.getEdad(), emp.getSalario(), emp.getDepartamento());
        }
    }

    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String atributo, String valorString, double min, double max) {
        return Arrays.stream(empleados)
            .filter(emp -> {
                switch (atributo.toLowerCase()) {
                    case "nombre":
                        return emp.getNombre().equalsIgnoreCase(valorString);
                    case "departamento":
                        return emp.getDepartamento().equalsIgnoreCase(valorString);
                    case "edad":
                        return emp.getEdad() >= min && emp.getEdad() <= max;
                    case "salario":
                        return emp.getSalario() >= min && emp.getSalario() <= max;
                    default:
                        return false;
                }
            })
            .toArray(Empleado[]::new);
    }

    public static Empleado[] ordenarEmpleados(Empleado[] empleados, String atributo) {
        int n = empleados.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean shouldSwap = false;
                switch (atributo.toLowerCase()) {
                    case "nombre":
                        shouldSwap = empleados[j].getNombre().compareTo(empleados[j + 1].getNombre()) > 0;
                        break;
                    case "edad":
                        shouldSwap = empleados[j].getEdad() > empleados[j + 1].getEdad();
                        break;
                    case "salario":
                        shouldSwap = empleados[j].getSalario() > empleados[j + 1].getSalario();
                        break;
                    case "departamento":
                        shouldSwap = empleados[j].getDepartamento().compareTo(empleados[j + 1].getDepartamento()) > 0;
                        break;
                }
                if (shouldSwap) {
                    Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                }
            }
        }
        return empleados;
    }

    public static Empleado buscarPorNombre(Empleado[] empleados, String nombre) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                return emp;
            }
        }
        return null; // Devuelve null si no se encuentra el empleado
    }

    public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
        double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
        empleado.setSalario(nuevoSalario);
        return empleado;
    }
}
