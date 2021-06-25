package POO.cursoEmVideo.Aula11;

abstract class Animal {
    //Atributos
    protected int peso, idade, membros;

    //Método
    public void emitirSom() {
        System.out.println("Som de animal!");
    }

    //Getters
    public int getPeso() {
        return peso;
    }

    public int getMembros() {
        return membros;
    }

    public int getIdade() {
        return idade;
    }

    //Setters
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Mamifero extends Animal {

    //Atributo
    protected String corPelo;

    //Método sobescrito!
    @Override
    public void emitirSom() {
        System.out.println("Estou fazendo som de Mamífero!");
    }

    //Getter
    public String getCorPelo() {
        return corPelo;
    }

    //Setter
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

class Lobo extends Animal {

    //Método sobescrito!
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuu! Sou um Lobo!");
    }

}

class Cachorro extends Lobo {

    //Polimorfismo de SOBRECARGA!
    public void reagir(String frase) {
        if (frase.equals("Almoço!") || frase.equals("Olá bonitão!")) {
            System.out.println("Abanar e Latir!");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void regair(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar o rabo!");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir!");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar o rabo!");
        } else {
            System.out.println("Rosnar!");
        }
    }

    public void reagir(int idade, float peso) {
        if(idade < 5) {
            if(peso < 10) {
                System.out.println("Abanar o rabo!");
            }
        } else {
            System.out.println("Latir!");
        }
    }



    //Método sobescrito!
    @Override
    public void emitirSom() {
        System.out.println("Au!Au! -> Sou um dog!");
    }
}





