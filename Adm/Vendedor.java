package Adm;

public class Vendedor extends Funcionario {
    private double vendas;

    public Vendedor(String var1, String var2, String var3, double var4, double var6) {
        super(var1, var2, var3, var4);
        this.vendas = var6;
    }

    public String getTipo() {
        return "Vendedor";
    }

    public double calcularSalario() {
        return this.getSalarioBase() + this.vendas * 0.05;
    }
}
