package usuario;

public class strings {
    public static void main(String[] arg) {

        var nome = "José Carlos";
        var sobrenome= " dos Anjos";
        final var nomeCompleto = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: " + nomeCompleto);

        final var mensagem = String.format("O cliente %s possui sobre nome %s", nome, sobrenome);
        System.out.println(mensagem);


        var string = "Minha String";

        System.out.println("Char na posição: " + string.charAt(6));
        System.out.println("Quantidade:" + string.length());
        System.out.println("Sem trim: [" + string + "]");
        System.out.println("Com trim: [" + string.trim() + "]");
        System.out.println("Lower: " + string.toLowerCase());
        System.out.println("Upper: " + string.toUpperCase());
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Contém X? " + string.contains("X"));
        System.out.println("Replace: " + string.replace("n", "$"));
        System.out.println("Equals?" + string.equals("Minha String"));
        System.out.println("EqualsIgnoreCAse?" + string.equalsIgnoreCase("minha StrinG"));
        System.out.println("Substring(1, 6)=" + string.substring(1, 6));
    }
}
