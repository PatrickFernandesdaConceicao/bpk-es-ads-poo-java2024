package ex011;

public class Cidade {
    String nome;
    int populacao;
    String estado;

    void aumentar() {
        System.out.println("Aumentando");
    }

    void diminuir() {
        System.out.println("Diminuindo");
    }

    // Construtor para inicializar os atributos
    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }
}
