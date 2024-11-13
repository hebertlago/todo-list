package br.com.hebertlago.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  ITaksRepository extends JpaRepository<TaskModel, UUID>{
    
}
