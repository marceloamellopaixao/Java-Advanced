package br.com.fiap.gerenciadorTarefas.service;

import br.com.fiap.gerenciadorTarefas.model.TaskContent;
import br.com.fiap.gerenciadorTarefas.controller.dto.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {

    private final Map<Long, TaskContent> mapTasks = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public TaskContent createTask(TaskDTO taskDTO) {
        // Implemente a lógica para criar uma nova tarefa
        TaskContent taskContent = new TaskContent();
        taskContent.setId(counter.incrementAndGet());
        taskContent.setTitulo(taskDTO.getTitulo());
        taskContent.setStatus(taskDTO.getStatus());
        mapTasks.put(taskContent.getId(), taskContent);

        return taskContent;
    }

    public TaskContent updateTask(Long id, TaskDTO taskDTO) {
        // Implemente a lógica para atualizar uma tarefa existente
        TaskContent taskContent = mapTasks.get(id);
        if (taskContent != null){
            taskContent.setTitulo(taskDTO.getTitulo());
            taskContent.setStatus(taskDTO.getStatus());
        }
        return taskContent;
    }

    // Metodo para Listar as Todas as Tarefas
    public List<TaskContent> listTasks() {
        // Implemente a lógica para obter todas as tarefas
        return new ArrayList<>(mapTasks.values());
    }

    // Metodo para Listar a Tarefa por ID
    public TaskContent getTask(Long id){
        return mapTasks.get(id);
    }

    public TaskContent deleteTask(Long id) {
        // Implemente a lógica para excluir uma tarefa pelo ID
        return mapTasks.remove(id);
    }

}
