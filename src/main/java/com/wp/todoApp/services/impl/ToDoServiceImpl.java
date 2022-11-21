package com.wp.todoApp.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.todoApp.models.entities.ToDo;
import com.wp.todoApp.models.entities.ToDoCategory;
import com.wp.todoApp.models.in.ToDoIn;
import com.wp.todoApp.models.out.ToDoOut;
import com.wp.todoApp.repositories.ToDoCategoryRepository;
import com.wp.todoApp.repositories.ToDoRepository;
import com.wp.todoApp.services.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {

  @Autowired
  private ToDoRepository _ToDoRepository;

  @Autowired
  private ToDoCategoryRepository _ToDoCategoryRepository;

  @Override
  public List<ToDoOut> getAllToDos() {
    List<ToDo> todos = _ToDoRepository.findAll();
    List<ToDoOut> toDoOuts = new ArrayList<ToDoOut>();

    for (ToDo todo : todos) {
      toDoOuts.add(new ToDoOut(todo));
    }

    return toDoOuts;
  }

  @Override
  public ToDoOut addNewToDo(ToDoIn toDoIn) {
    ToDo toDo;
    try {
      toDo = new ToDo(toDoIn);
      List<ToDoCategory> cat = _ToDoCategoryRepository.findById(toDoIn.getCategoryId()).stream()
          .collect(Collectors.toList());
      if (cat.isEmpty()) {
        throw new IllegalArgumentException("Invalid data");
      }
      toDo.setCategory(cat.get(0));
      _ToDoRepository.save(toDo);
      return new ToDoOut(toDo);
    } catch (Exception e) {

    }

    return null;
  }

}
