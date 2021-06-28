package fundamentos;

public class Metodos {
    //Método soma.
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println(s);
    }

    //Método -> Função
    static int somar(int c, int d) {
        int sm = c + d;
        return sm;
    }

    //O método main, será executado primeiro.
    public static void main(String[] args) {
        soma (5, 2);
        int s = somar(5, 2);
        System.out.println("A soma vale " + s);
    }
}
