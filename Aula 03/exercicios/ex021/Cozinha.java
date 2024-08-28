package ex021;

public class Cozinha {
    String tipo;
    int quantidadePessoas;
    String cor;

    void cozinhar() {
        System.out.println("Cozinhando na cozinha.");
    }

    void limpar() {
        System.out.println("Limpando a cozinha.");
    }

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }
}
