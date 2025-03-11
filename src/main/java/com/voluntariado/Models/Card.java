package com.voluntariado.Models;




import com.voluntariado.dto.BoardColumnDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // Status do card (exemplo: "Em andamento", "Concluído")

    @ManyToOne
    private BoardColumnDTO column;

    public void setColumn(BoardColumn boardColumn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setColumn'");
    }
}
