package ex001;

public class Livro {
    // Atributos
    String titulo;
    String autor;
    int numeroDePaginas;

    // Métodos
    void abrirLivro() {
        System.out.println("O livro foi aberto");
    }

    void lerPagina() {
        System.out.println("Ler uma página");
    }

    // Construtor
    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
}