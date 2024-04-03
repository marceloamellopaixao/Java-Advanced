package org.example.service;

import org.example.controller.dto.TaskDTO;
import org.example.controller.dto.TaskUpdateDTO;
import org.example.model.Task;
import org.example.model.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public Task createTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(counter.incrementAndGet());
        task.setTitle(taskDTO.getTitle());
        task.setStatus(taskDTO.getStatus());
        tasks.put(task.getId(), task);
        return task;
    }

    public List<Task> listTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task getTask(Long id) {
        return tasks.get(id);
    }

    public Task updateTask(Long id, TaskUpdateDTO taskUpdateDTO) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setTitle(taskUpdateDTO.getTitle());
            task.setStatus(taskUpdateDTO.getStatus());
        }
        return task;
    }

    public void deleteTask(Long id) {
        tasks.remove(id);
    }
}