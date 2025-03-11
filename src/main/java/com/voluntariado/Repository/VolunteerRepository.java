package com.voluntariado.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.Volunteer;



@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}