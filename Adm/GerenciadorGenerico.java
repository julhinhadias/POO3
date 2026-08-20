package Adm;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorGenerico<T> {
    private List<T> objetos = new ArrayList();

    public GerenciadorGenerico() {
    }

    public void adicionar(T var1) {
        this.objetos.add(var1);
    }

    public T buscar(int var1) {
        return (T)this.objetos.get(var1);
    }

    public void remover(T var1) {
        this.objetos.remove(var1);
    }

    public int tamanho() {
        return this.objetos.size();
    }

    public List<T> listar() {
        return this.objetos;
    }
}
