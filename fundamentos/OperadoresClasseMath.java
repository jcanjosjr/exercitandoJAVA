package fundamentos;

public class OperadoresClasseMath {
    public static void main(String[] args) {
        int num = 5;
        int valor = 5 + num++;
        System.out.println(valor);
        valor = 5 + ++num;
        System.out.println(valor);

        //+= somar e atribuir
        //-= subtrair e atribuir
        //+= multiplicar e atribuir
        ///= resto e atribuir

        int x = 4;
        x += 2;
        System.out.println(x);

        //Classe Math

        // PI -> Math.pi = 3.1415
        // pow -> Math.pow(5,2) = 25
        // sqrt -> Math.sqrt(25) = 5
        // cbrt -> Math.cbrt(27) = 3
        // abs -> Math.abs(-10) = 10
        // floor -> Math.floor(3.9) = 3 // arredonda pra baixo
        // ceil -> Math.ceil(3.1) = 4 // arredonda pra cima
        // round -> Math.round(5.6) = 6 // arredoda da forma correta

        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        int ar2 = (int) Math.ceil(v);
        System.out.println(ar2);
        int ar3 = (int) Math.round(v);
        System.out.println(ar3);

        // random -> Math.random() = aleatório
        double ale = Math.random();
        System.out.println(ale);
        double ale2 = 0 + Math.random() * (5-0); // gerando aleatório de 5-0
        System.out.println(ale2);
    }
}
