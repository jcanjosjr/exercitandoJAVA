package POO.cursoEmVideo.Aula03;

public class Caneta {
    //atributos da Classe.
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada = false;

    //método construtor, possui o mesmo nome da classe
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.setPonta(p);
        this.tampar();

    }

    //métodos getter e setters.
    public String getModelo() { return this.modelo; }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() { return this.ponta; }

    public void setPonta(float p) {
        this.ponta = p;
    }

    //método para mostrar os status da caneta.
    public void status() {
        System.out.println("Sobre a caneta!");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    //métodos simples
    public void tampar() { this.tampada = true; }

    public void destampar() { this.tampada = false; }
}
