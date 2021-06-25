package POO.cursoEmVideo.Aula10;

public class Reptil extends Animal {
    //Atributos
    private String corEscama;

    //Sobrepondo métodos.
    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais! Ou talvez, comendo um mamífero!");
    }

    @Override
    public void emitirSom() {
        System.out.println("SsSsSSSsS -> Som de réptil!");
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
