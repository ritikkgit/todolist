package com.ritikk.todolist;

import com.ritikk.todolist.model.TodoItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private List<TodoItem> todoItems = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todoItems", todoItems);
        return "index";
    }

    @PostMapping("/add")
    public String addTodoItem(@RequestParam String title) {
        todoItems.add(new TodoItem(title));
        return "redirect:/todo/";
    }

    @GetMapping("/delete/{index}")
    public String deleteTodoItem(@PathVariable int index) {
        if (index >= 0 && index < todoItems.size()) {
            todoItems.remove(index);
        }
        return "redirect:/todo/";
    }
}
