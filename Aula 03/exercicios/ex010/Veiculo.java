package ex010;

public class Veiculo {
    String tipo;
    String placa;
    String cor;

    void abastecer() {
        System.out.println("Abastecendo");
    }

    void lavar() {
        System.out.println("Lavando");
    }

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }
}
