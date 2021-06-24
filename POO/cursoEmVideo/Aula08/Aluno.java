package POO.cursoEmVideo.Aula08;

public class Aluno extends Pessoa {

    //Atributos
    private int matr;
    private String curso;

    //Métodos
    public void CancelarMatr() {
        System.out.println("Matrícula será cancelada.");
    }

    //Getters
    public int getMatr() {
        return matr;
    }
    public String getCurso() {
        return curso;
    }

    //Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }
}
