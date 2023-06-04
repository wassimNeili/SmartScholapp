package com.example.smartscholapp.Controller;

import com.example.smartscholapp.Model.Trainer;
import com.example.smartscholapp.Service.TrainerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping
    public ResponseEntity<Trainer> createTrainer(@RequestBody Trainer trainer) {
        // Implement logic to create a trainer
        Trainer createdTrainer = trainerService.createTrainer(trainer);
        return ResponseEntity.ok(createdTrainer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trainer> getTrainerById(@PathVariable Long id) {
        // Implement logic to get a trainer by ID
        Trainer trainer = trainerService.getTrainerById(id);
        if (trainer != null) {
            return ResponseEntity.ok(trainer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Add additional endpoints for trainer-related operations as needed
}

