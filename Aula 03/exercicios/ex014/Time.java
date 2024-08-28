package ex014;

public class Time {
    String nome;
    String tecnico;
    int numeroDeJogadores;

    void adicionarJogador() {
        System.out.println("Jogador adicionado.");
    }

    void removerJogador() {
        System.out.println("Jogador removido.");
    }

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }
}
