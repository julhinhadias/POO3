package Produto;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String var1, double var2, int var4) {
        this.nome = var1;
        this.preco = var2;
        this.quantidade = var4;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setNome(String var1) {
        if (var1 != null && !var1.isBlank()) {
            this.nome = var1;
        }

    }

    public void setPreco(double var1) {
        if (var1 > (double)0.0F) {
            this.preco = var1;
        }

    }

    public void setQuantidade(int var1) {
        if (var1 >= 0) {
            this.quantidade = var1;
        }

    }

    public void exibirProduto() {
        System.out.println("===== PRODUTO =====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }

    public String toString() {
        return "Produto{nome='" + this.nome + "', preco=" + this.preco + "}";
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (!(var1 instanceof Produto)) {
            return false;
        } else {
            Produto var2 = (Produto)var1;
            return Objects.equals(this.nome, var2.nome);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome});
    }
}
