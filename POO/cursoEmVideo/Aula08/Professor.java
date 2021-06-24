package POO.cursoEmVideo.Aula08;

public class Professor extends Pessoa {

    //Atributos
    private String especialidade;
    private int salario;

    //Métodos
    public void receberAum(float aum){
        this.salario += aum;
    }

    //Getters
    public int getSalario() {
        return salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    //Setters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
