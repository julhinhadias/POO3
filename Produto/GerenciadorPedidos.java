package Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        System.out.println("===== PEDIDOS =====");

        for (Pedido pedido : pedidos) {
            pedido.listarPedido();
            System.out.println();
        }
    }

    public int quantidadePedidos() {
        return pedidos.size();
    }
}
