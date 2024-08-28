package ex012;

public class Filme {
    String titulo;
    String diretor;
    int duracao;

    void iniciar() {
        System.out.println("Iniciando");
    }

    void parar() {
        System.out.println("Parando");
    }

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }
}
