package com.voluntariado.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    // Aqui você pode adicionar métodos personalizados para consultas específicas, se necessário
    // Por exemplo:
    // List<Card> findByBoardColumnId(Long boardColumnId);
    // Optional<Card> findByTitle(String title);
}
