package ex020;

public class Bicicleta {
    String marca;
    String modelo;
    int tamanhoRoda;

    void pedalar() {
        System.out.println("Pedalando a bicicleta.");
    }

    void frear() {
        System.out.println("Freando a bicicleta.");
    }

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }
}
