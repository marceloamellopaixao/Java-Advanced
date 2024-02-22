package correcao.exercicios.dois;

public class Funcionario {
    int id;
    String nome;
    Departamento departamento;

    public Funcionario(int id, String nome, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Departamento: " + departamento;
    }
}
