package usuario;

public class lacos {
    public static void main(String[] args) {
        final var condicao = false;

        if (condicao) {
            System.out.println("A condição é verdadeira?");
        } else {
            System.out.println("A condição é falsa!");
        }

        final var ternario = condicao ? "é verdadeira" : "é falsa";
        System.out.println(ternario);
    }
}
