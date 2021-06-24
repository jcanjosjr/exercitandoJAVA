package POO.cursoEmVideo.Aula08;

public class Funcionario extends Pessoa {

    //Atributos
    private String setor;
    private boolean trabalhando;

    //Métodos
    public void mudaTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

    //Getters
    public String getSetor() {
        return setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    //Setters
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
