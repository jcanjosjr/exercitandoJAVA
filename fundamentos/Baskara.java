package usuario;

public class Baskara {
    public static void main(String[] args) {
        var a = 2;
        var b = 12;
        var c = -14;
        var delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0 ) {
            System.out.println("O valor de delta foi menor que zero: " + delta + ", logo não possuíremos valores reais.");
        } else if (delta == 0) {
            System.out.println("O valor de delta foi Zero: " + delta + ", logo possuíremos raízes iguais.");
        } else {
            System.out.println("O valor de delta foi acima de zero: " + delta + ", possuíremos raízes reais.");
        }

        var x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        System.out.println("O valor de x1 foi: " + x1);
        var x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("O valor de x2 foi: " + x2);
    }
}
