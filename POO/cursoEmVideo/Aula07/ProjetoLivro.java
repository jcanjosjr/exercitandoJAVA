package POO.cursoEmVideo.Aula07;

public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("José", "M", 24);
        p[1] = new Pessoa("Vanessa", "F", 28);

        l[0] = new Livro("Aprendendo Java", "Moisés", 300, p[0]);
        l[1] = new Livro("POG para Scrum", "Pedro", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria", 800, p[0]);

        l[0].abrir();
        l[0].folhear(5);
        l[0].avancarPag();
        System.out.println(l[1].Detalhes());

    }

}
