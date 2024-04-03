package correcao.exercicios.quatro;

public class Main {
    public static void main(String[] args) {
        SistemaVotacao votacao = new SistemaVotacao();
        try {
            votacao.registrarVoto(new Voto(1, Cargo.PRESIDENTE));
            votacao.registrarVoto(new Voto(2, Cargo.SENADOR));
            votacao.registrarVoto(new Voto(3, Cargo.DEPUTADO));
            votacao.registrarVoto(new Voto(4, Cargo.PRESIDENTE));
            votacao.registrarVoto(new Voto(5, Cargo.SENADOR));
            votacao.registrarVoto(new Voto(6, Cargo.DEPUTADO));

            votacao.registrarVoto(new Voto(7, Cargo.SENADOR));
            votacao.registrarVoto(new Voto(8, Cargo.SENADOR));
            votacao.registrarVoto(new Voto(9, Cargo.SENADOR));

            //votacao.registrarVoto(new Voto(1, Cargo.PRESIDENTE));

            System.out.println("Resultados da Votação:");
            votacao.contabilizarVotos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
