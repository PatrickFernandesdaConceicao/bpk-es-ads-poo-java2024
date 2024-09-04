package ex009;

public class Produto {
    private String nome;
    private double preco;
    private double quantEstoque;

    public Produto(String nome, double preco, double quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(double quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    void aumentar() {
        System.out.println("Aumentando");
    }
    void diminuir(){
        System.out.println("Diminuindo");
    }

}
