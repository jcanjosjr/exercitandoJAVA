package fundamentos;

public class OperadoresLogicos_Relacionais {
    public static void main(String[] args) {
        int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r = (n1 > n2) ? n1 : n2;
        //Operador Ternário.
        System.out.println(r);

        //Operador ternário permite realizar operações:
        r = ( n1 > n2 ) ? n1 + n2 : n2 - n1;
        System.out.println(r);
    }
}
