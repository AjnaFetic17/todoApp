package com.wp.todoApp.models.out;

import com.wp.todoApp.models.entities.ToDo;

public class ToDoOut {
  private Integer id;
  private String name;
  private String description;
  private Integer categoryId;

  public ToDoOut() {
  }

  public ToDoOut(ToDo toDo) {
    id = toDo.getId();
    name = toDo.getName();
    description = toDo.getDescription();
    categoryId = toDo.getCategory().getId();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

}
