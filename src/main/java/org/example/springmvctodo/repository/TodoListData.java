package org.example.springmvctodo.repository;

import org.example.springmvctodo.model.Todo;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class TodoListData {
    @Bean
    public List<Todo> todoList() {
        List<Todo> todos = new ArrayList<>();

        // Add more todos if needed
        return todos;
    }
}
