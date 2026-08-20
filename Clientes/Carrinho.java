package Clientes;

import Produto.Produto;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList();

    public Carrinho() {
    }

    public void adicionarProduto(Produto var1) {
        this.produtos.add(var1);
    }

    public void removerProduto(Produto var1) {
        this.produtos.remove(var1);
    }

    public int quantidadeProdutos() {
        return this.produtos.size();
    }

    public void listarProdutos() {
        System.out.println("===== CARRINHO =====");

        for(Produto var2 : this.produtos) {
            var2.exibirProduto();
            System.out.println();
        }

    }
}
