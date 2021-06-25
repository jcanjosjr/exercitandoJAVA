package POO.cursoEmVideo.Aula12;

public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private int views, curtidas;
    private boolean reproduzindo;
    private float avaliacao;

    public Video(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getViews() {
        return views;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
