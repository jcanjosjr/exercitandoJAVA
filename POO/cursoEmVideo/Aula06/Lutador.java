package POO.cursoEmVideo.Aula06;

public class Lutador {

    // Atributos da classe lutador
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    // Método construtor
    public Lutador( String nome, String nacionalidade, int idade, float altura,
                    float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Métodos do lutador
    public void apresentar() {
        System.out.println("--------- LUTADOR ---------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos.");
        System.out.println(this.getAltura() + " m de altura.");
        System.out.println("Pesando " + this.getPeso() + "Kg.");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void status() {
        System.out.println("--------- Apresentando ---------");
        System.out.println(this.getNome());
        System.out.println("é do peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias.");
        System.out.println(this.getDerrotas() + " derrotas.");
        System.out.println(this.getEmpates() + " empates.");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }


    //getters
    String getNome() { return this.nome; }
    private String getNacionalidade() { return this.nacionalidade; }
    private int getIdade() { return this.idade; }
    private float getAltura() { return this.altura; }
    private float getPeso() { return this.peso; }
    String getCategoria() { return this.categoria; }
    private int getVitorias() { return this.vitorias; }
    private int getDerrotas() { return this.derrotas; }
    private int getEmpates() { return this.empates; }

    //setters
    public void setNome(String nome) { this.nome = nome; }

    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public void setIdade(int idade) { this.idade = idade; }

    public void setAltura(int altura) { this.altura = altura; }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void setVitorias(int vitorias) { this.vitorias = vitorias; }
    public void setDerrotas(int derrotas) { this.derrotas = derrotas; }
    public void setEmpates(int empates) { this.empates = empates; }
}
