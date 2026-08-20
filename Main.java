//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;

import Adm.Administrador;
import Adm.Caixa;
import Adm.Funcionario;
import Adm.GerenciadorGenerico;
import Adm.Util;
import Adm.Vendedor;
import Clientes.Carrinho;
import Clientes.Cliente;
import Clientes.GerenciadorClientes;
import Clientes.Pessoa;
import Pagamento.Boleto;
import Pagamento.CartaoCredito;
import Pagamento.Pagamento;
import Pagamento.Pix;
import Produto.Pedido;
import Produto.Produto;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Cliente var1 = new Cliente("Joao", "123.456.789-00", "joao@email.com");
        System.out.println();
        Produto var2 = new Produto("Notebook", (double)3.5F, 2);
        Produto var3 = new Produto("Mouse", (double)100.0F, 5);
        Produto var4 = new Produto("Teclado", (double)200.0F, 3);
        var1.setNome("Carlos");
        var2.setPreco((double)4200.0F);
        Carrinho var5 = new Carrinho();
        var5.adicionarProduto(var2);
        var5.adicionarProduto(var3);
        var5.adicionarProduto(var4);
        System.out.println();
        var1.exibirInformacoes();
        System.out.println();
        var2.exibirProduto();
        System.out.println();
        var5.listarProdutos();
        System.out.println("Quantidade de produtos: " + var5.quantidadeProdutos());
        System.out.println();
        var5.removerProduto(var3);
        System.out.println("Apos remover o mouse:");
        var5.listarProdutos();
        System.out.println("Quantidade de produtos: " + var5.quantidadeProdutos());
        var1.getCarrinho().adicionarProduto(var2);
        var1.getCarrinho().adicionarProduto(var3);
        var1.getCarrinho().adicionarProduto(var4);
        var1.exibirInformacoes();
        System.out.println();
        var1.getCarrinho().listarProdutos();
        var1.adicionarProdutoAoCarrinho(var2);
        var1.adicionarProdutoAoCarrinho(var3);
        var1.adicionarProdutoAoCarrinho(var4);
        var1.exibirInformacoes();
        System.out.println();
        var1.listarCarrinho();
        Pedido var6 = new Pedido();
        var6.adicionarItem(var2, 2);
        var6.adicionarItem(var3, 3);
        var6.adicionarItem(var4, 1);
        var6.listarPedido();
        Funcionario var7 = new Funcionario("Maria", "11111111111", "maria@loja.com", (double)3000.0F);
        Administrador var8 = new Administrador("Carlos", "22222222222", "admin@loja.com", (double)7000.0F);
        System.out.println("===== CLIENTE =====");
        var1.exibirInformacoes();
        System.out.println();
        System.out.println("===== FUNCIONÁRIO =====");
        var7.exibirInformacoes();
        var7.trabalhar();
        System.out.println();
        System.out.println("===== ADMINISTRADOR =====");
        var8.exibirInformacoes();
        var8.trabalhar();
        var8.aprovarDesconto();
        Vendedor var9 = new Vendedor("José", "333", "jose@email.com", (double)2500.0F, (double)10000.0F);
        System.out.println(var7.calcularSalario());
        System.out.println(var8.calcularSalario());
        System.out.println(var9.calcularSalario());
        Administrador var10 = new Administrador("Carlos", "222", "admin@email.com", (double)7000.0F);
        System.out.println(((Funcionario)var10).calcularSalario());
        Pix var11 = new Pix();
        var11.pagar((double)350.0F);
        Pagamento var12 = new Pix();
        var12.pagar((double)500.0F);
        var12 = new CartaoCredito();
        var12.pagar((double)500.0F);
        var12 = new Boleto();
        var12.pagar((double)500.0F);
        System.out.println("PIX");
        var6.finalizarPedido(new Pix());
        System.out.println();
        System.out.println("CARTÃO");
        var6.finalizarPedido(new CartaoCredito());
        System.out.println();
        System.out.println("BOLETO");
        var6.finalizarPedido(new Boleto());
        Cliente var13 = new Cliente("João", "111", "joao@email.com");
        Administrador var14 = new Administrador("Carlos", "222", "carlos@email.com", (double)7000.0F);
        Vendedor var15 = new Vendedor("Maria", "333", "maria@email.com", (double)2500.0F, (double)10000.0F);
        ((Pessoa)var13).exibirInformacoes();
        ((Pessoa)var14).exibirInformacoes();
        ((Pessoa)var15).exibirInformacoes();
        Cliente var16 = new Cliente("João", "11111111111", "joao@email.com");
        Cliente var17 = new Cliente("Maria", "22222222222", "maria@email.com");
        Cliente var18 = new Cliente("Carlos", "33333333333", "carlos@email.com");
        GerenciadorClientes var19 = new GerenciadorClientes();
        var19.adicionarCliente(var16);
        var19.adicionarCliente(var17);
        var19.adicionarCliente(var18);
        var19.listarClientes();
        Produto var20 = new Produto("Notebook", (double)3500.0F, 10);
        Produto var21 = new Produto("Notebook", (double)3500.0F, 10);
        var5.adicionarProduto(var20);
        var5.adicionarProduto(var21);
        System.out.println(var20.equals(var21));
        Cliente var22 = var19.buscarClientePorCpf("11111111111");
        if (var22 != null) {
            var22.exibirInformacoes();
        }

        ArrayList var23 = new ArrayList();
        Cliente var24 = new Cliente("Bart", "4745", "bart@emial");
        Cliente var25 = new Cliente("Lisa", "47999", "lisa@emial");
        var23.add(var24);
        var23.add(var25);
        Produto var26 = new Produto("Notebook", (double)3500.0F, 10);
        Caixa var27 = new Caixa(var26);
        Produto var28 = (Produto)var27.getObjeto();
        System.out.println("Produto: " + String.valueOf(var28));
        Cliente var29 = new Cliente("João", "111", "joao@email.com");
        Caixa var30 = new Caixa(var29);
        Cliente var31 = (Cliente)var30.getObjeto();
        System.out.println("Cliente: " + String.valueOf(var31));
        Caixa var32 = new Caixa(var6);
        Pedido var33 = (Pedido)var32.getObjeto();
        ArrayList var34 = new ArrayList();
        Produto var35 = (Produto)Util.primeiro(var34);
        ArrayList var36 = new ArrayList();
        Cliente var37 = (Cliente)Util.primeiro(var36);
        ArrayList var38 = new ArrayList();
        Pedido var39 = (Pedido)Util.primeiro(var38);
        GerenciadorGenerico var40 = new GerenciadorGenerico();
        var40.adicionar(var2);
        var40.adicionar(var3);
        GerenciadorGenerico var41 = new GerenciadorGenerico();
        var41.adicionar(var24);
        var41.adicionar(var25);
    }
}
