package Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto var1, int var2) {
        this.produto = var1;
        this.quantidade = var2;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double calcularSubtotal() {
        return this.produto.getPreco() * (double)this.quantidade;
    }

    public void exibirItem() {
        System.out.println(this.produto.getNome());
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Subtotal: R$ " + this.calcularSubtotal());
    }
}
