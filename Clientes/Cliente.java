package Clientes;

import Produto.Produto;

public class Cliente extends Pessoa {
    private Carrinho carrinho = new Carrinho();

    public Cliente(String var1, String var2, String var3) {
        super(var1, var2, var3);
    }

    public String getTipo() {
        return "Cliente";
    }

    public Carrinho getCarrinho() {
        return this.carrinho;
    }

    public void adicionarProdutoAoCarrinho(Produto var1) {
        this.carrinho.adicionarProduto(var1);
    }

    public void listarCarrinho() {
        this.carrinho.listarProdutos();
    }
}
