package GestionDeCuentas;

import java.util.Scanner;

public class GestionCuentas {

    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(5000.0);

        // Usar Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println();
            System.out.println("\n--- Actividad: Gestión de cuentas ---");
            // Mostrar el saldo inicial
            System.out.println("\nSaldo inicial: " + cuenta.getSaldo());

            // Variable para almacenar la cantidad a retirar
            double cantidad = 0;

            // Bucle para asegurarse de que solo se ingresen números válidos
            while (true) {
                System.out.print("Ingrese la cantidad que desea retirar: ");
                
                if (scanner.hasNextDouble()) {  // Verificar si la entrada es un número válido
                    cantidad = scanner.nextDouble();
                    break;  // Salir del bucle si la entrada es válida
                } else {
                    // Mostrar un mensaje de error si la entrada no es un número
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next(); // Limpiar la entrada incorrecta
                }
            }

            // Intentar realizar el retiro
            cuenta.retirar(cantidad);

            // Mostrar el saldo después del retiro
            System.out.println("Retiro exitoso. Saldo actual: " + cuenta.getSaldo());

        } catch (SaldoInsuficienteException e) {
            // Manejar la excepción personalizada
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Manejar cualquier otra excepción
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }
}

