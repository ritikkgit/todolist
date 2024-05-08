package com.ritikk.todolist.model;

public class TodoItem {
    private String title;
    private boolean completed;

    // Constructor, getters, and setters
    public TodoItem(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
