package com.example.smartscholapp.DAO;


import com.example.smartscholapp.Model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    // Additional methods for administrator-related database operations
}
