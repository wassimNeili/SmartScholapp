package com.example.smartscholapp.DAO;

import com.example.smartscholapp.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional methods for Student entity can be added here
}

