package ex002;

public class Celular {
    //atributos

    String marca;
    String modelo;
    int capacidadeBateria;

    void ligar(){
        System.out.println("Ligando");
    }

    void desligar(){
        System.out.println("Desligando");
    }

    public Celular(String marca,String modelo, int capacidadeBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

}
