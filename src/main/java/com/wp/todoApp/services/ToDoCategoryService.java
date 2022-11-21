package com.wp.todoApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wp.todoApp.models.in.ToDoCategoryIn;
import com.wp.todoApp.models.out.ToDoCategoryOut;

@Service
public interface ToDoCategoryService {

  public List<ToDoCategoryOut> getAllCategories();

  public ToDoCategoryOut addNewCategory(ToDoCategoryIn doCategoryIn);
}
