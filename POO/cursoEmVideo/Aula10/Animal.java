package POO.cursoEmVideo.Aula10;

abstract class  Animal {
    //Atributos
    private int idade, membros;
    private float peso;

    //Métodos
    public void locomover() {}
    public void alimentar() {}
    public void emitirSom() {}

    //Getters
    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public int getMembros() {
        return membros;
    }

    //Setters
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
