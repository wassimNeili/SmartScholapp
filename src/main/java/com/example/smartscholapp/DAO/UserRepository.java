package com.example.smartscholapp.DAO;

import com.example.smartscholapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define additional methods for user-related operations if needed
}
