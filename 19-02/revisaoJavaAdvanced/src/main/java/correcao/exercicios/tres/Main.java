package correcao.exercicios.tres;

public class Main {

    public static void main(String[] args) {
        PrevisaoTempo previsao = new PrevisaoTempo();

        previsao.adicionarCidade(new Cidade("São Paulo", Clima.ENSOLARADO));
        previsao.adicionarCidade(new Cidade("Rio de Janeiro", Clima.CHUVOSO));
        System.out.println("Previsões do Tempo:");
        previsao.listarCidades();

        previsao.removerCidade("São Paulo");
        System.out.println("\nPrevisões após remoção:");
        previsao.listarCidades();
    }
}
