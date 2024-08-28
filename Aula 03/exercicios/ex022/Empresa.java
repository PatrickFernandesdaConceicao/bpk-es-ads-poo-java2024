package ex022;

public class Empresa {
    String nome;
    String CNPJ;
    int numeroFuncionarios;

    void contratar() {
        System.out.println("Contratando funcionário.");
    }

    void demitir() {
        System.out.println("Demitindo funcionário.");
    }

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }
}