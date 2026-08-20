package Produto;

import Pagamento.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList();

    public Pedido() {
    }

    public void adicionarItem(Produto var1, int var2) {
        ItemPedido var3 = new ItemPedido(var1, var2);
        this.itens.add(var3);
    }

    public double calcularTotal() {
        double var1 = (double)0.0F;

        for(ItemPedido var4 : this.itens) {
            var1 += var4.calcularSubtotal();
        }

        return var1;
    }

    public void listarPedido() {
        System.out.println("===== PEDIDO =====");

        for(ItemPedido var2 : this.itens) {
            var2.exibirItem();
            System.out.println();
        }

        System.out.println("TOTAL: R$ " + this.calcularTotal());
    }

    public void finalizarPedido(Pagamento var1) {
        double var2 = this.calcularTotal();
        var1.pagar(var2);
    }
}
