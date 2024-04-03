package org.example.model;

import lombok.Data;

@Data
public class Task {
    private Long id;
    private String title;
    private TaskStatus status;
}