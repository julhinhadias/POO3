package Pagamento;

public class Pix implements Pagamento {
    public Pix() {
    }

    public void pagar(double var1) {
        System.out.println("Pagamento realizado via PIX.");
        System.out.println("Valor: R$ " + var1);
    }
}
