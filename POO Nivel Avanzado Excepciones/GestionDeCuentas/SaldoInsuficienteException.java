package GestionDeCuentas;

public class SaldoInsuficienteException extends Exception {
    // Constructor que acepta un mensaje personalizado
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
