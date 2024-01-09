package com.var.todo.respositories;

import com.var.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo , Integer> {

    @Query(value = "SELECT * FROM todo", nativeQuery = true)
    List<Todo> findAll();
}
