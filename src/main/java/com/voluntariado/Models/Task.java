package com.voluntariado.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // Status pode ser "Pendente", "Concluída", etc.
    
    // Outros campos e relacionamentos com outros modelos como Event, Volunteer, etc.
}