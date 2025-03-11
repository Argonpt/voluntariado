package com.voluntariado.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voluntariado.Models.Volunteer;
import com.voluntariado.Services.VolunteerService;

@RestController
@RequestMapping("/volunteers")
public class VolunteerController {
    private final VolunteerService service;

    public VolunteerController(VolunteerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return service.getAll();
    }

    @PostMapping
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {
        return service.save(volunteer);
    }
}