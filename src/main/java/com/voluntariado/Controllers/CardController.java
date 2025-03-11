package com.voluntariado.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.voluntariado.Models.Card;
import com.voluntariado.Services.CardService;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping
    public Card createCard(@RequestParam Long columnId, @RequestBody Card card) {
        return cardService.createCard(columnId, card);
    }

    @PutMapping("/{cardId}/move")
    public Card moveCardToColumn(@PathVariable Long cardId, @RequestParam Long targetColumnId) {
        return cardService.moveCardToColumn(cardId, targetColumnId);
    }
}
