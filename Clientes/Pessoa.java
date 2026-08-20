package Clientes;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String var1, String var2, String var3) {
        this.nome = var1;
        this.cpf = var2;
        this.email = var3;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String var1) {
        if (var1 != null && !var1.isBlank()) {
            this.nome = var1;
        }

    }

    public abstract String getTipo();

    public void exibirInformacoes() {
        System.out.println("Tipo : " + this.getTipo());
        System.out.println("Nome : " + this.nome);
        System.out.println("CPF  : " + this.cpf);
        System.out.println("Email: " + this.email);
    }
}
