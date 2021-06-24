package POO.cursoEmVideo.Aula08;

public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p3.receberAum(550.20f);
        p2.setIdade(24);
        p2.setNome("Maria");
        p2.setIdade(35);
        p3.setNome("José");
        p3.setIdade(25);
        p4.setNome("Vanessa");
        p4.setSexo("F");
        p4.setIdade(28);

        System.out.println(p4.toString());
        System.out.println(p3.toString());
        System.out.println(p2.toString());
        System.out.println(p1.toString());
    }
}
