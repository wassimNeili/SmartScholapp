package com.example.smartscholapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainers")
public class Trainer extends User {
    private String expertise;

    @OneToMany(mappedBy = "trainer")
    private List<Course> assignedCourses = new ArrayList<>();

    @OneToMany(mappedBy = "trainer")
    private List<Formation> assignedFormations = new ArrayList<>();

    // Other trainer properties

    // Getters and setters
}
