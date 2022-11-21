package com.wp.todoApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.todoApp.models.in.ToDoIn;
import com.wp.todoApp.models.out.ToDoOut;
import com.wp.todoApp.services.ToDoService;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {

  @Autowired
  private ToDoService _ToDoService;

  @GetMapping("/")
  public List<ToDoOut> getAllToDos() {
    return _ToDoService.getAllToDos();
  }

  @PostMapping("/")
  public ToDoOut addToDo(@RequestBody ToDoIn toDoIn) {
    return _ToDoService.addNewToDo(toDoIn);
  }
}
