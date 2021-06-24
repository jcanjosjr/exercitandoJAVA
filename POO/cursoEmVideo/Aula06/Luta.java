package POO.cursoEmVideo.Aula06;

import java.util.Random;

public class Luta {
    //atributos da classe luta
    private Lutador desafiado; // instância de lutador é o desafiado.
    private Lutador desafiante; // é um tipo abstrato.
    private int round;
    private boolean aprovada;



    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }


    public void lutar() {
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            System.out.println("### RESULTADO DA LUTA ###");

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0: { //empate
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                }
                case 1: { //Ganhou o Desafiado
                    System.out.println("Vecendor: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                }

                case 2: { //ganhou o desafiante
                    System.out.println("Vencedor: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                }
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }


    //getters
    public Lutador getDesafiado() { return this.desafiado; }
    public Lutador getDesafiante() { return this.desafiante; }
    public Boolean getAprovada() { return this.aprovada; }
    public int getROund() { return this.round; }

    //setter
    public void setDesafiado (Lutador dd) {
        this.desafiado = dd;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void isAprovada(boolean b) {
        this.aprovada = true;
    }

}
