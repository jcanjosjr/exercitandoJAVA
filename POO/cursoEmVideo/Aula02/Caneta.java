package POO.cursoEmVideo.Aula02;

public class Caneta {
    //cinco atributos.
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //status do objeto
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    //três metódos.
    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Não consigo rabiscar.");
        } else {
            System.out.println("Rabiscando!!!");
        }
    }

    public void tampar() { this.tampada = true; }

    public void destampar() { this.tampada = false; }
}

