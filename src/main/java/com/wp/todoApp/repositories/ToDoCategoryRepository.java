package com.wp.todoApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wp.todoApp.models.entities.ToDoCategory;

@Repository
public interface ToDoCategoryRepository extends JpaRepository<ToDoCategory, Integer> {

}
