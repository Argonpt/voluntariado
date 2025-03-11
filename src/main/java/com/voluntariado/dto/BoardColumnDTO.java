package com.voluntariado.dto;


import lombok.Data;

@Data
public class BoardColumnDTO {

    private Long id;
    private String name;
    private Integer order;
    private Long boardId; // ID do Board ao qual a coluna pertence
    private Integer cardCount; // Quantidade de cards na coluna

}