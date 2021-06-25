package POO.cursoEmVideo.Aula12;

public class Usuario extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;

    //Métodos
    public void viuMaisUm() {
        this.totAssistido++;
    }

    //Getters
    public int getTotAssistido() {
        return totAssistido;
    }

    public String getLogin() {
        return login;
    }

    //Setters
    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
