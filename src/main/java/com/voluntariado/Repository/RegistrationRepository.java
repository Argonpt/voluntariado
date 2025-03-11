package com.voluntariado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntariado.Models.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}