package com.voluntariado.dto;



import lombok.Data;

@Data
public class CardDetailsDTO {

    private Long id;
    private String title;
    private String description;
    private String status;
    private Long columnId; // ID da coluna em que o card está
}
