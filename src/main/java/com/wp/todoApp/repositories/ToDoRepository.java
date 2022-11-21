package com.wp.todoApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wp.todoApp.models.entities.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

}
