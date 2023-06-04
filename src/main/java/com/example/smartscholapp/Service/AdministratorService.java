package com.example.smartscholapp.Service;


import com.example.smartscholapp.Model.Administrator;

import java.util.List;

public interface AdministratorService {
    List<Administrator> getAllAdministrators();
    Administrator getAdministratorById(Long id);
    Administrator createAdministrator(Administrator administrator);
    Administrator updateAdministrator(Administrator administrator);
    void deleteAdministrator(Long id);
    // Additional methods for administrator-related operations
}
