package ActividadGestionDePedidos;

import java.util.List;

public class Pedido {
    private int numeroDePedido;
    private String cliente;
    private List<String> listaDeProductos;
    private EstadoPedido estadoDelPedido;

    public Pedido(int numeroDePedido, String cliente, List<String> listaDeProductos) {
        this.numeroDePedido = numeroDePedido;
        this.cliente = cliente;
        this.listaDeProductos = listaDeProductos;
        this.estadoDelPedido = EstadoPedido.PENDIENTE;  // Estado inicial por defecto
    }

    public int getNumeroDePedido() {
        return numeroDePedido;
    }

    public String getCliente() {
        return cliente;
    }

    public List<String> getListaDeProductos() {
        return listaDeProductos;
    }

    public EstadoPedido getEstadoDelPedido() {
        return estadoDelPedido;
    }

    public void setEstadoDelPedido(EstadoPedido estadoDelPedido) {
        this.estadoDelPedido = estadoDelPedido;
    }

    @Override
public String toString() {
    return "Número de Pedido: " + numeroDePedido + "\n" +
        "Cliente: " + cliente + "\n" +
        "Lista de Productos: " + String.join(", ", listaDeProductos) + "\n" +
        "Estado del Pedido: " + estadoDelPedido + "\n";
}

}
