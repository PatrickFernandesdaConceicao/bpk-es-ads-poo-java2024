package ex008;

public class Professor {
    String nome;
    String materia;
    int salario;

    void darAula(){
        System.out.println("Dar aula");
    }

    void corrigirProvas(){
        System.out.println("Corrigindo Provas");
    }

    public Professor(String nome,String materia, int salario){
        this.nome = nome;
        this.materia = materia;
        this.salario = salario;

    }
}
