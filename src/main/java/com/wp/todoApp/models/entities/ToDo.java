package com.wp.todoApp.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.wp.todoApp.models.in.ToDoIn;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(max = 255)
  private String name;

  @Size(max = 1000)
  private String description;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private ToDoCategory category;

  public ToDo() {
  }

  public ToDo(ToDoIn toDoIn) {
    name = toDoIn.getName();
    description = toDoIn.getDescription();
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

  public ToDoCategory getCategory() {
    return category;
  }

  public void setCategory(ToDoCategory category) {
    this.category = category;
  }

}
