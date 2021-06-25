package POO.cursoEmVideo.Aula12;

public class Visualizacao {

    //Atributos
    private Usuario espectador;
    private Video filme;

    //Método Construtor
    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //Métodos sobrecarga!
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao((nota));
    }

    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    //Getters
    public Usuario getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }

    //Setters
    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
