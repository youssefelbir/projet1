package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Employé;
import com.example.gestionpharmacie.entities.Pharmacie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployéService {
    Employé newEmployé(Employé employé);
    Employé updateEmployé(Employé employé);
    void deletEmployéById(Long id);
    void deletAllEmployé();
    Employé getEmployéById(Long id);
    List<Employé> getAllEmployé();
}
