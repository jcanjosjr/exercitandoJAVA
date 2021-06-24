package usuario;

public class operadoresLOGICOS {
    public static void main(String[] args) {
        final var numero = 2;
        final var letra = "A";

        //Sort Circuit
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outra condição.");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca...");
        }

        // non sort circuit

        if(verifica(15) | verifica("A")) {
            System.out.println("Ok");
        } else {
            System.out.println("Não Ok");
        }
    }

    private static boolean verifica(String letra) {
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero) {
        System.out.println("Verificando número");
        return numero > 10;
    }
}
