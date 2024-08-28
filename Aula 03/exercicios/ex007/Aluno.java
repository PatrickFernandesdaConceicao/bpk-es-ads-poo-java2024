package ex007;

public class Aluno {
    String nome;
    int matricula;
    String curso;

    void calcular(){
        System.out.println("Calculando Média");
    }

    public Aluno(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
}
