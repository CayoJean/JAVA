package GestionDeCuentas;
public class CuentaBancaria {
    private double saldo; // Atributo para almacenar el saldo de la cuenta

    // Constructor que establece el saldo inicial
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para obtener el saldo actual de la cuenta
    public double getSaldo() {
        return saldo;
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            // Lanzar excepción si el saldo es insuficiente
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro de " + cantidad + " unidades.");
        }
        saldo -= cantidad; // Restar la cantidad retirada del saldo
    }
}
