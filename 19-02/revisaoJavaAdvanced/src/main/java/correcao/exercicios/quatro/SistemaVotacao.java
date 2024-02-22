package correcao.exercicios.quatro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SistemaVotacao {
    private Map<Cargo, Set<Voto>> votosPorCargo = new HashMap<>();
    private Set<Integer> eleitoresVotaram = new HashSet<>();

    public void registrarVoto(Voto voto) throws Exception {
        if (!eleitoresVotaram.add(voto.idEleitor)) {
            throw new Exception("Eleitor já votou.");
        }
        votosPorCargo.computeIfAbsent(voto.cargo, k -> new HashSet<>()).add(voto);
    }

    public void contabilizarVotos() {
        votosPorCargo.forEach((cargo, votos) -> System.out.println("Cargo: " + cargo + ", Total de Votos: " + votos.size()));
    }
}
