package Adm;

import Clientes.Pessoa;

public class Funcionario extends Pessoa {
    private double salarioBase;

    public Funcionario(String var1, String var2, String var3, double var4) {
        super(var1, var2, var3);
        this.salarioBase = var4;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public String getTipo() {
        return "Funcionário";
    }

    public double calcularSalario() {
        return this.salarioBase;
    }

    public void trabalhar() {
        System.out.println(this.getNome() + " está trabalhando.");
    }
}
