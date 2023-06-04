package com.example.smartscholapp.serviceImpl;

import com.example.smartscholapp.DAO.AdministratorRepository;
import com.example.smartscholapp.Model.Administrator;
import com.example.smartscholapp.Service.AdministratorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    private final AdministratorRepository administratorRepository;

    public AdministratorServiceImpl(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    @Override
    public List<Administrator> getAllAdministrators() {
        return administratorRepository.findAll();
    }

    @Override
    public Administrator getAdministratorById(Long id) {
        return administratorRepository.findById(id).orElse(null);
    }

    @Override
    public Administrator createAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public Administrator updateAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public void deleteAdministrator(Long id) {
        administratorRepository.deleteById(id);
    }

    // Implement additional methods for administrator-related operations as needed
}
