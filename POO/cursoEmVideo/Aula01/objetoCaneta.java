package POO.cursoEmVideo.Aula01;

public class objetoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        System.out.println("\n\n");
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}