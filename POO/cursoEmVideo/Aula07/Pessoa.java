package POO.cursoEmVideo.Aula07;

public class Pessoa {
    //atributos
    private String nome, sexo;
    private int idade;

    //construtor
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public void fazerAniver() {
        this.idade++;
    }


    // getters
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    //setters
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
