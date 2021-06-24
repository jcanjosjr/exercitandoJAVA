package usuario;

import java.util.Arrays;

public class stringBuilder {
    public static void main(String[] args) {
        var nome = "José";

        final var builder = new StringBuilder(nome);
        System.out.println(builder.append("José"));

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var inserir = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(inserir);

        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(""));
        System.out.println("Aula ".concat("de Java"));
        System.out.println("1234 qwer asdf".replaceAll("[0-9]", "*"));
}
}
