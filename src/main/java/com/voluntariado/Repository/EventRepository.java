package com.voluntariado.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}