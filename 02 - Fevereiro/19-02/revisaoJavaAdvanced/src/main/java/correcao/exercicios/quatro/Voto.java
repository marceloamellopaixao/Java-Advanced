package correcao.exercicios.quatro;

public class Voto {
    int idEleitor;
    Cargo cargo;

    public Voto(int idEleitor, Cargo cargo) {
        this.idEleitor = idEleitor;
        this.cargo = cargo;
    }

    public int getIdEleitor() {
        return idEleitor;
    }

    public void setIdEleitor(int idEleitor) {
        this.idEleitor = idEleitor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
