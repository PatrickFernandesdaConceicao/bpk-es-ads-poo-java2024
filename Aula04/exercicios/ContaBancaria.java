public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(){
        System.out.println("Quanto deseja depositar?");
        this.saldo += saldo;
    }

    public void sacar(){
        System.out.println("Digite o quanto deseja sacar");
        /*
        * if(saldo < valorSaque){
        * System.out.println("Saldo Inválido");
        * } else {
        * this.saldo -= valorSaque;
        * }
        * */
    }
}
