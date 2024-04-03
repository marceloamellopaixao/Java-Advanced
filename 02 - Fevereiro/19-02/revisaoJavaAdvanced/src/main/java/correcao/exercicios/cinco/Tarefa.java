package correcao.exercicios.cinco;

public class Tarefa {
    int id;
    String descricao;
    Status status;
    public Tarefa(int id, String descricao, Status status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa ID: " + id + ", Descrição: " + descricao + ", Status: " + status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
