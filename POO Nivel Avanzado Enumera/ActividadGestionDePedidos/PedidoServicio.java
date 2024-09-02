package ActividadGestionDePedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoServicio {
    private List<Pedido> pedidos;

    public PedidoServicio() {
        this.pedidos = new ArrayList<>();
    }

    public void crearPedido(int numeroDePedido, String cliente, List<String> listaDeProductos) {
        Pedido nuevoPedido = new Pedido(numeroDePedido, cliente, listaDeProductos);
        pedidos.add(nuevoPedido);
    }

    public void actualizarEstadoPedido(int numeroDePedido, EstadoPedido nuevoEstado) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroDePedido() == numeroDePedido) {
                pedido.setEstadoDelPedido(nuevoEstado);
                break;
            }
        }
    }

    public List<Pedido> buscarPedidosPorEstado(EstadoPedido estado) {
        return pedidos.stream()
                .filter(pedido -> pedido.getEstadoDelPedido() == estado)
                .collect(Collectors.toList());
    }

    public List<Pedido> obtenerListaDePedidos() {
        return new ArrayList<>(pedidos);
    }
}
