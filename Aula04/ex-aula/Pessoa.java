import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Integer idade;
    private LocalDate dataNascimento;

    public Pessoa(String nome, Integer idade, LocalDate dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && nome.length() > 0){
            this.nome = nome;
        }else {
            System.out.println("Nome inválido");
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade > 0 && idade != null){
            this.idade = idade;
        }else{
            System.out.println("Idade Inválida");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if(dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        }else {
            System.out.println("Data inválida");
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
