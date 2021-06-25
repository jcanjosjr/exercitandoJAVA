package POO.cursoEmVideo.Aula10;

public class Ave extends Animal {
    //Atributo
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Estou nos céus, voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Estou comendo frutas! Ou as vezes, répteis!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu Piu -> Sou uma ave!");
    }

    //Método
    public void fazerNinho() {
        System.out.println("Construindo um ninho!");
    }

    //Getter
    public String getCorPena() {
        return corPena;
    }

    //Setter
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
