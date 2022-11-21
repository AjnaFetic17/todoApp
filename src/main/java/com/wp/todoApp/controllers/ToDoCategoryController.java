package com.wp.todoApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.todoApp.models.in.ToDoCategoryIn;
import com.wp.todoApp.models.out.ToDoCategoryOut;
import com.wp.todoApp.services.ToDoCategoryService;

@RestController
@RequestMapping("/api/categories")
public class ToDoCategoryController {

  @Autowired
  private ToDoCategoryService _ToDoCategoryService;

  @GetMapping(value = "/")
  public List<ToDoCategoryOut> getAllCategories() {
    return _ToDoCategoryService.getAllCategories();
  }

  @PostMapping(value = "/")
  public ToDoCategoryOut addNewCategory(@RequestBody ToDoCategoryIn categoryIn) {
    return _ToDoCategoryService.addNewCategory(categoryIn);
  }

}
