package org.example.controller.dto;

import lombok.Data;
import org.example.model.TaskStatus;

@Data
public class TaskUpdateDTO {
    private String title;
    private TaskStatus status;
}