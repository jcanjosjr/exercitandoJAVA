package POO.cursoEmVideo.Aula08;

public class Pessoa {

    //Atributos
    private String nome, sexo;
    private int idade;

    public String toString() {
        return "#### --- ##### \nPessoa!" +
                "\nNome: " + nome +
                "\nSexo: " + sexo +
                "\nIdade:" + idade;
    }

    // Métodos
    public void fazerAniv() {
        this.idade ++;
    }

    // Getters
    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
