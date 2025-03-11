package com.voluntariado.dto;

import java.util.List;

import lombok.Data;

@Data
public class BoardDetailsDTO {

    private Long id;
    private String name;
    private String description;
    private List<BoardColumnDTO> columns; // Colunas do board
}