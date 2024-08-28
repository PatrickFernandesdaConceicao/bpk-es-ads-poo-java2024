package ex005;

public class Cachorro {

    String nome;
    String raca;
    int idade;

    void latir(){
        System.out.println("Latindo");
    };
    void correr(){
        System.out.println("Correndo");
    }

    public Cachorro(String nome,String raca,int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
}
