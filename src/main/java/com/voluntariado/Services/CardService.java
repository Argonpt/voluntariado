package com.voluntariado.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voluntariado.Models.BoardColumn;
import com.voluntariado.Models.Card;
import com.voluntariado.Repository.BoardColumnRepository;
import com.voluntariado.Repository.CardRepository;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private BoardColumnRepository boardColumnRepository;

    public Card createCard(Long columnId, Card card) {
        Optional<BoardColumn> column = boardColumnRepository.findById(columnId);
        if (column.isPresent()) {
            card.setColumn(column.get());
            return cardRepository.save(card);
        }
        throw new RuntimeException("Coluna não encontrada");
    }

    public Card moveCardToColumn(Long cardId, Long targetColumnId) {
        Optional<Card> card = cardRepository.findById(cardId);
        if (card.isPresent()) {
            Optional<BoardColumn> targetColumn = boardColumnRepository.findById(targetColumnId);
            if (targetColumn.isPresent()) {
                card.get().setColumn(targetColumn.get());
                return cardRepository.save(card.get());
            }
            throw new RuntimeException("Coluna alvo não encontrada");
        }
        throw new RuntimeException("Card não encontrado");
    }
}