package com.wp.todoApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wp.todoApp.models.in.ToDoIn;
import com.wp.todoApp.models.out.ToDoOut;

@Service
public interface ToDoService {

  public List<ToDoOut> getAllToDos();

  public ToDoOut addNewToDo(ToDoIn toDoIn);
}
