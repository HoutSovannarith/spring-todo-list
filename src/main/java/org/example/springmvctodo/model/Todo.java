package org.example.springmvctodo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class Todo {
    private int nextId = 1;
    private int id;
    private String task;
    private String description;
    private boolean isDone;
    private String createdAt;
    public Todo() {
        this.createdAt = java.time.LocalDate.now().toString();
        this.id = nextId++;
    }
}
