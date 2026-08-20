package Pagamento;

public class CartaoCredito implements Pagamento {
    public CartaoCredito() {
    }

    public void pagar(double var1) {
        System.out.println("Pagamento realizado no cartão.");
        System.out.println("Valor: R$ " + var1);
    }
}
