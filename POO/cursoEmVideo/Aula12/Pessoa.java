package POO.cursoEmVideo.Aula12;

public class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade, experiencia;

    //Métodos
    public void ganharExp() {
        this.experiencia += 5;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    //Setters
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
