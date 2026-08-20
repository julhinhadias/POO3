package Pagamento;

public class Boleto implements Pagamento {
    public Boleto() {
    }

    public void pagar(double var1) {
        System.out.println("Pagamento realizado por boleto.");
        System.out.println("Valor: R$ " + var1);
    }
}
