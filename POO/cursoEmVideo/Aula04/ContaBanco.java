package POO.cursoEmVideo.Aula04;

public class ContaBanco {
    //atributos da Classe.
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status = false;

    // método construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.status = true;
    }

    //não é recomendado que se use o println em métodos.
    // métodos da conta
    public void abrirConta(String t) {
        this.setTipo(t);
        this.status = true;
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda possui saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta possui saldo negativo.");
        } else {
            this.status = false;
            System.out.println("Conta encerrada.");
        }
    }

    public void depositar(float v) {
        if (this.status = true) {
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Conta fechada, impossível realizar depósito.");
        }
    }

    public void sacar(float v) {
        if (this.status = true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() -v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }

        if (this.status = true) {
            if (this.getSaldo() > v) {
                this.setSaldo(getSaldo() -v);
                System.out.println("Mensalidade paga com sucesso por " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }


    //getters e setters da conta
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String nome) {
        this.dono = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    //Apenas para mostrar o estado do objeto.
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.status);
    }
}
