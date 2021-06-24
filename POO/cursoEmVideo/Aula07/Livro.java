package POO.cursoEmVideo.Aula07;

public class Livro implements Publicacao {
    //atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //método construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }


    public String Detalhes() {
        return "Livro! " +
                "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nTotal Paginas: " + totPaginas +
                "\nPagina Atual: " + pagAtual +
                "\nAberto: " + aberto +
                "\nLeitor: " + leitor.getNome() +
                "\nSexo: " + leitor.getSexo() +
                "\nIdade: " + leitor.getIdade();
    }

    // getters
    public boolean isAberto() {
        return aberto;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }


    // setters
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    //metódos da interface publicacao
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if ( p > this.totPaginas) {
            this.pagAtual = this.totPaginas;
        } else if ( p < 0 ) {
            this.pagAtual = 0;
        } else {
            this.pagAtual += p;
        }

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
