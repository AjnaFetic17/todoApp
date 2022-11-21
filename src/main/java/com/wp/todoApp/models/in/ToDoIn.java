package com.wp.todoApp.models.in;

import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

public class ToDoIn {

  @Nullable
  private Integer id;

  @Size(max = 255)
  private String name;

  @Size(max = 1000)
  private String description;

  private Integer categoryId;

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

  public ToDoIn() {
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

}
