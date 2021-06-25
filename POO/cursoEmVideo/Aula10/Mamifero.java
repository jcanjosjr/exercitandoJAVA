package POO.cursoEmVideo.Aula10;

public class Mamifero extends Animal {
    //Atributo
    private String corPelo;

    //Sobrepondo métodos!
    @Override
    public void locomover() {
        System.out.println("Correndo com patas!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au!Au! -> Som de mamífero :)");
    }


    //Getter
    public String getCorPelo() {
        return corPelo;
    }

    //Setter
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
