package ex006;

public class Computador {
    String processador;
    int memoriaRAM;
    double armazenamento;

    void ligando(){
        System.out.println("Ligando");
    }
    void desligar(){
        System.out.println("Desligando");
    }

    public Computador(String processador, int memoriaRAM, double armazenamento){
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }
}
