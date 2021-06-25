package POO.cursoEmVideo.Aula10;

public class Peixe extends Animal {
    //Atributos
    private String corEscama;

    //Sobrepondo métodos!
    @Override
    public void locomover() {
        System.out.println("Estou nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Estou comendo algas! Ou talvez, peixeinhos menores!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub Glub Glub -> Som de Peixe!");
    }

    //Método
    public void soltarBolha() {
        System.out.println("Estou soltando bolhas!");
    }

    //Getter
    public String getCorEscama() {
        return corEscama;
    }

    //Setter
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
