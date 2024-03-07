package br.com.fiap.gerenciadorTarefas.tarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping("/criar-tarefa")
    public ResponseEntity<TaskContent> createTask(@RequestBody TaskDTO taskDTO){
        TaskContent task = taskService.createTask(taskDTO);
        return ResponseEntity.ok(task);
    }

    @GetMapping()
    public ResponseEntity<List<TaskContent>> getAllTasks(){

        return ResponseEntity.ok(taskService.listTasks());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<TaskContent> getTask(@PathVariable Long id){
//        TaskContent task = taskService.getTask(id);
//        return ResponseEntity.ok(task);
//        if (task == 1){
//
//        }
//    }
}
