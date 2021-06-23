package POO.cursoEmVideo.Aula01;

public class Caneta {
    //cinco atributos.
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //status do objeto
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    //três metódos.
    void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Não consigo rabiscar.");
        } else {
            System.out.println("Rabiscando!!!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}

