package br.com.fiap.gerenciadorTarefas.controller.dto;

import br.com.fiap.gerenciadorTarefas.model.StatusTarefa;
import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String titulo;
    private StatusTarefa status;
}
