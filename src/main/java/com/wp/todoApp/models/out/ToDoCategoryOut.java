package com.wp.todoApp.models.out;

import com.wp.todoApp.models.entities.ToDoCategory;

public class ToDoCategoryOut {
  private Integer id;
  private String name;

  public ToDoCategoryOut() {
  }

  public ToDoCategoryOut(ToDoCategory toDoCategory) {
    id = toDoCategory.getId();
    name = toDoCategory.getName();
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

}
