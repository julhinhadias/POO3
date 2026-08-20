package Adm;

public class Caixa<T> {
    private T objeto;

    public Caixa(T var1) {
        this.objeto = var1;
    }

    public T getObjeto() {
        return this.objeto;
    }

    public void setObjeto(T var1) {
        this.objeto = var1;
    }

    public static <T> void imprimir(T var0) {
        System.out.println(var0);
    }
}
