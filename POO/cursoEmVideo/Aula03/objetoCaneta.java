package POO.cursoEmVideo.Aula03;

public class objetoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Amarelo", 0.4f);

        c1.status();
        System.out.println("\nEntão eu possuo uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + "\n");

        Caneta c2 = new Caneta("Esferográfica", "Preta", 0.9f);
        c2.status();
        System.out.println("\nEntão eu possuo uma caneta " + c2.getModelo() + " de ponta " + c2.getPonta());

    }
}
