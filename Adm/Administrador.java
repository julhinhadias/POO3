package Adm;

public class Administrador extends Funcionario {
    public Administrador(String var1, String var2, String var3, double var4) {
        super(var1, var2, var3, var4);
    }

    public String getTipo() {
        return "Administrador";
    }

    public double calcularSalario() {
        return this.getSalarioBase() * 1.2;
    }

    public void aprovarDesconto() {
        System.out.println("Desconto aprovado.");
    }
}
