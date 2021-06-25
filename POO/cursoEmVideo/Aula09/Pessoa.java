package POO.cursoEmVideo.Aula09;

abstract class Pessoa { //CLASSE PESSOA, CLASSE ABSTRATA!
    //Atributos
    private String nome, sexo;
    private int idade;

    //Método final
    public final void  fazerAniv() {
        this.idade++;
    }

    //Getters
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    //Setters
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //toString para apresentar dados!
    @Override
    public String toString() {
        return "Pessoas!" +
                "\nNome:" + nome  +
                "\nSexo:" + sexo +
                "\nIdade:" + idade + "\n####----####";
    }
}



class Visitante extends Pessoa {/* herança pobre, herda tudo de pessoa.*/}



class Aluno extends Pessoa { //Classe Aluno que extende de Pessoa.
    //Atributos
    private int matricula;
    private String curso;

    //Método
    public void pagarMensal() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    //Getter
    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    //Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}



class Bolsista extends Aluno {
    //Classe Bolsista que herda de Aluno que herda de Pessoa.

    //Atributos
    private float bolsa;

    //Método
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    //Sobrepondo Método
    @Override
    public void pagarMensal() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    //Getters
    public float getBolsa() {
        return bolsa;
    }

    //Setters
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}



//Testando o código!
class Teste {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
    }
}



