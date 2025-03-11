package com.voluntariado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Métodos personalizados podem ser adicionados, como busca por status ou título.
}