package fundamentos;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Inteiro
        int idade = 3;
        int idade2 = (int) 3; //typecast
        Integer idade3 = new Integer(3); // objeto
        //Integer não é um tipo, é uma classe wrapper(involucro) class.

        //Float
        float sal = 1825.54f;
        float sal2 = (float) 1825.54;
        Float sal3 = new Float(1825.54f);
        //Float é uma classe wrapper.

        //Caracteres
        char letra = 'A';
        Character letra2 = new Character('G');
        String frase = "Java"; // corresponde a 4 bytes.
        //Character é uma classe wrapper.


        float nota = 8.7f;
        String nome = "José";
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        //printf para realizar formatação de uma String.


        //Realizando input de dados.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        String nome2 = teclado.nextLine();
        System.out.print("Escreva sua nota: ");
        float nota2 = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome2, nota2);


        //Incompatibilidades de tipos Números <-> String;
        int idade4 = 30;
        //String valor = idade4;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        // String <-> Números
        String valor2 = "30";
        //int idade = (int) valor;
        int idade5 = Integer.parseInt(valor); // parseInt = converter
        System.out.println(idade5);
    }
}
