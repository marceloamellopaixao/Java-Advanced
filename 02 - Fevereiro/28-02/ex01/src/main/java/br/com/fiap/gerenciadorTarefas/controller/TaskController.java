package br.com.fiap.gerenciadorTarefas.controller;

import br.com.fiap.gerenciadorTarefas.model.TaskContent;
import br.com.fiap.gerenciadorTarefas.controller.dto.TaskDTO;
import br.com.fiap.gerenciadorTarefas.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping
    public ResponseEntity<TaskContent> createTask(@RequestBody TaskDTO taskDTO){
        TaskContent task = taskService.createTask(taskDTO);
        return ResponseEntity.ok(task);
    }

    @GetMapping
    public ResponseEntity<List<TaskContent>> getAllTasks(){
        return ResponseEntity.ok(taskService.listTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskContent> getTask(@PathVariable Long id){
        TaskContent task = taskService.getTask(id);
        if(task != null){
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskContent> updateTask(@PathVariable Long id, @RequestBody TaskDTO taskDTO){
        TaskContent task = taskService.updateTask(id, taskDTO);
        if(task != null){
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaskContent> deleteTask(@PathVariable Long id){
        TaskContent task = taskService.deleteTask(id);
        return ResponseEntity.ok(task);
    }
}
