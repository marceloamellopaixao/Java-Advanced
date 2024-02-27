package br.com.fiap.gerenciadorTarefas.tarefas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskContent {
    private int id;
    private String titulo;
    private StatusTarefa statusTarefa;
}
