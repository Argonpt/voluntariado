package com.voluntariado.Services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.voluntariado.Models.Volunteer;
import com.voluntariado.Repository.VolunteerRepository;

@Service
public class VolunteerService {
    private final VolunteerRepository repository;

    public VolunteerService(VolunteerRepository repository) {
        this.repository = repository;
    }

    public List<Volunteer> getAll() {
        return repository.findAll();
    }

    public Volunteer save(Volunteer volunteer) {
        return repository.save(volunteer);
    }
}