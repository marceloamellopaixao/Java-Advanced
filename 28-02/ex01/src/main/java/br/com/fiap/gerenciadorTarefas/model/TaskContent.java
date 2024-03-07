package br.com.fiap.gerenciadorTarefas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskContent {
    private Long id;
    private String titulo;
    private StatusTarefa status;
}
