package correcao.exercicios.tres;

public class Cidade {
    String nome;
    Clima clima;

    public Cidade(String nome, Clima clima) {
        this.nome = nome;
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "Cidade: " + nome + ", Clima: " + clima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }
}
