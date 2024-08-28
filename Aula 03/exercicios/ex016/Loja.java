package ex016;

public class Loja {
    String nome;
    String endereco;
    String telefone;

    void abrir() {
        System.out.println("Abrindo a loja.");
    }

    void fechar() {
        System.out.println("Fechando a loja.");
    }

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
