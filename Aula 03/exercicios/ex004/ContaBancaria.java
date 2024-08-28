package ex004;

public class ContaBancaria {
    String numeroConta;
    double saldo;

    void depositar(){
        System.out.println("Depositando");
    }

    void sacar(){
        System.out.println("Sacando");
    }

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
