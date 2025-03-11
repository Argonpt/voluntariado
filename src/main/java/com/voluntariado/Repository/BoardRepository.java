package com.voluntariado.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    // Aqui você pode adicionar métodos personalizados para consultas específicas, se necessário
    // Por exemplo:
    // Optional<Board> findByName(String name);
}
