package correcao.exercicios.cinco;

public class Main {
    public static void main(String[] args) throws Exception {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa(new Tarefa(1, "Estudar Java", Status.PENDENTE));
        gerenciador.adicionarTarefa(new Tarefa(2, "Estudar Gradle", Status.PENDENTE));
        System.out.println("Lista de Tarefas:");
        gerenciador.listarTarefas();

        gerenciador.atualizarStatusTarefa(1, Status.CONCLUIDA);
        System.out.println("\nLista de Tarefas após atualização:");
        gerenciador.listarTarefas();

        gerenciador.removerTarefa(2);
        System.out.println("\nLista de Tarefas após remoção:");
        gerenciador.listarTarefas();
    }
}
