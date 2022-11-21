package com.wp.todoApp.models.in;

import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

public class ToDoCategoryIn {
  @Nullable
  private Integer id;

  @Size(max = 255)
  private String name;

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

  public ToDoCategoryIn() {
  }

}
