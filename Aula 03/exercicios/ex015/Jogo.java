package ex015;

public class Jogo {
    String nome;
    String genero;
    double preco;

    void iniciar() {
        System.out.println("Iniciando o jogo");
    }

    void pausar() {
        System.out.println("Pausando o jogo");
    }

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }
}
