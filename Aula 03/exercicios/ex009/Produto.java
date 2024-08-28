package ex009;

public class Produto {
    String nome;
    double preco;
    double quantEstoque;

    void aumentar() {
        System.out.println("Aumentando");
    }
    void diminuir(){
        System.out.println("Diminuindo");
    }

    public Produto(String nome, double preco, double quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }
}
