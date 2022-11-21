package com.wp.todoApp.models.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.wp.todoApp.models.in.ToDoCategoryIn;

@Entity
public class ToDoCategory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(max = 255)
  private String name;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
  private List<ToDo> todos;

  public ToDoCategory() {
  }

  public ToDoCategory(ToDoCategoryIn toDoCategoryIn) {
    name = toDoCategoryIn.getName();
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

  public List<ToDo> getTodos() {
    return todos;
  }

  public void setTodos(List<ToDo> todos) {
    this.todos = todos;
  }

}
