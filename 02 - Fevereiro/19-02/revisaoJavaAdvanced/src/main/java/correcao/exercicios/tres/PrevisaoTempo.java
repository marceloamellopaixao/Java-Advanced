package correcao.exercicios.tres;

import java.util.ArrayList;
import java.util.List;

public class PrevisaoTempo {
    private List<Cidade> cidades = new ArrayList<>();

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }
    public void removerCidade(String nome) {
        cidades.removeIf(cidade -> cidade.nome.equals(nome));
    }

    public void listarCidades() {
        cidades.forEach(cidade -> System.out.println("Nome: " + cidade.nome + ", Clima: " + cidade.clima));
    }
}
