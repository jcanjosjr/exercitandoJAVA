package fundamentos;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int n[] = {3, 5, 8, 2};
        //n.length = apresenta o tamanho do array.
        System.out.println(n);
        for (var i = 0; i < n.length; i++) {
            System.out.print(n[i] + " -> ");
        }
        System.out.print(" Fim. \n");

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
                "Jun", "Jul", "Ago", "Set", "Out", "Nov",
                "Dez"};
        String tot[] = {"31", "28", "31", "30", "31", "30",
                "31", "31", "30", "31", "30", "31"};

        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + " possui " + tot[i] + " dias.");
        }


        //ForEach
        int num[] = { 10, 3, 2, 9, 5 };
        //Ordenando o array.
        Arrays.sort(num);
        for (int valor: num) {
            System.out.print(valor + " -> ");
        }
        System.out.print("Fim. \n");

        //Buscando um item no array
        int p = Arrays.binarySearch(num, 10);
        System.out.println(p); // apresenta o índice dentro do array.

        int v[] = new int[5];
        Arrays.fill(v, 0);
        for(int valor: v) {
            System.out.print(valor + " -> ");
        }
        System.out.println("Fim. \n");
    }
}
