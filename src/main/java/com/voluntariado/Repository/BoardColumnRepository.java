package com.voluntariado.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.BoardColumn;

@Repository
public interface BoardColumnRepository extends JpaRepository<BoardColumn, Long> {
    // Aqui também você pode adicionar métodos personalizados
    // Por exemplo:
    List<BoardColumn> findByBoardId(Long boardId);
}