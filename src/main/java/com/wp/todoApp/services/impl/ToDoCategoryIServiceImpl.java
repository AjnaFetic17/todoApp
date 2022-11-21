package com.wp.todoApp.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.todoApp.models.entities.ToDoCategory;
import com.wp.todoApp.models.in.ToDoCategoryIn;
import com.wp.todoApp.models.out.ToDoCategoryOut;
import com.wp.todoApp.repositories.ToDoCategoryRepository;
import com.wp.todoApp.services.ToDoCategoryService;

@Service
public class ToDoCategoryIServiceImpl implements ToDoCategoryService {

  @Autowired
  private ToDoCategoryRepository _ToDoCategoryRepository;

  @Override
  public List<ToDoCategoryOut> getAllCategories() {
    List<ToDoCategory> toDoCategories = _ToDoCategoryRepository.findAll();
    List<ToDoCategoryOut> toDoCategoryOuts = new ArrayList<ToDoCategoryOut>();

    for (ToDoCategory toDoCategory : toDoCategories) {
      toDoCategoryOuts.add(new ToDoCategoryOut(toDoCategory));
    }
    return toDoCategoryOuts;
  }

  @Override
  public ToDoCategoryOut addNewCategory(ToDoCategoryIn doCategoryIn) {
    ToDoCategory cat;

    try {
      cat = new ToDoCategory(doCategoryIn);
      _ToDoCategoryRepository.save(cat);
      return new ToDoCategoryOut(cat);
    } catch (Exception e) {

    }
    return null;
  }

}
