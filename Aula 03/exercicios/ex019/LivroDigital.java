package ex019;

public class LivroDigital {
    String titulo;
    String autor;
    double tamanhoArquivo; // tamanho em MB

    void abrir() {
        System.out.println("Abrindo o livro digital.");
    }

    void fechar() {
        System.out.println("Fechando o livro digital.");
    }

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
