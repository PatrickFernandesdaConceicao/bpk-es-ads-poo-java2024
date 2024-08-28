package ex003;

public class Pessoa {

    String nome;
    int idade;
    double altura;

    void apresentacao(){
        System.out.println("nome: " + nome + ", idade: " + idade + ", altura: " + altura);
    }

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
