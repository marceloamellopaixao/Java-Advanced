package correcao.exercicios.cinco;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
    public void removerTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.id == id);
    }

    public void atualizarStatusTarefa(int id, Status novoStatus) throws Exception {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.id == id) {
                tarefa.status = novoStatus;
                return;
            }
        }
        throw new Exception("Tarefa não encontrada.");
    }

    public void listarTarefas() {
        tarefas.forEach(tarefa -> System.out.println("ID: " + tarefa.id + ", Descrição: " + tarefa.descricao + ", Status: " + tarefa.status));
    }

    public void listarTarefasPorStatus(Status status) {
        tarefas.stream().filter(tarefa -> tarefa.status == status).forEach(tarefa -> System.out.println("ID: " + tarefa.id + ", Descrição: " + tarefa.descricao + ", Status: " + tarefa.status));
    }
}
