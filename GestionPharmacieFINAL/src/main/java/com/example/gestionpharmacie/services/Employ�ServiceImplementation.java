package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Employé;
import com.example.gestionpharmacie.repositories.EmployéRepository;
import com.example.gestionpharmacie.repositories.PharmacieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployéServiceImplementation implements EmployéService{
    private EmployéRepository employéRepository;
    @Override
    public Employé newEmployé(Employé employé) {
        return employéRepository.save(employé);
    }

    @Override
    public Employé updateEmployé(Employé employé) {
        return employéRepository.save(employé);
    }

    @Override
    public void deletEmployéById(Long id) {
        employéRepository.deleteById(id);
    }

    @Override
    public void deletAllEmployé() {
        employéRepository.deleteAll();
    }

    @Override
    public Employé getEmployéById(Long id) {
        return employéRepository.findById(id).get();
    }

    @Override
    public List<Employé> getAllEmployé() {
        return employéRepository.findAll();
    }
}
