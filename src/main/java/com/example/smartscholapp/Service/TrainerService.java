package com.example.smartscholapp.Service;

import com.example.smartscholapp.Model.Trainer;

import java.util.List;

public interface TrainerService {

    List<Trainer> getAllTrainers();

    Trainer getTrainerById(Long id);

    Trainer createTrainer(Trainer trainer);

    Trainer updateTrainer(Trainer trainer);

    void deleteTrainer(Long id);

    // Add additional methods for trainer management as needed
}
