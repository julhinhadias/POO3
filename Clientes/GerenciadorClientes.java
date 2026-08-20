package Clientes;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorClientes {
    private Map<String, Cliente> clientes = new HashMap();

    public GerenciadorClientes() {
    }

    public void adicionarCliente(Cliente var1) {
        this.clientes.put(var1.getCpf(), var1);
    }

    public Cliente buscarClientePorCpf(String var1) {
        return (Cliente)this.clientes.get(var1);
    }

    public void listarClientes() {
        System.out.println("===== CLIENTES =====");

        for(Cliente var2 : this.clientes.values()) {
            var2.exibirInformacoes();
            System.out.println();
        }

    }
}


